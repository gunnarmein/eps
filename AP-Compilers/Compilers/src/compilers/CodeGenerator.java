/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import java.util.ArrayList;
import lol.LOLDefaultRuntime;
import lol.LOLcodeBaseListener;
import lol.LOLcodeParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import vx86.Instruction;
import vx86.Program;
import vx86.Util;
import vx86.Vx86;

/**
 *
 * @author gmein
 */
public class CodeGenerator extends LOLcodeBaseListener {

    Program p;
    ParseTreeProperty<Decoration> decs;

    public CodeGenerator(ParseTreeProperty<Decoration> decs) {
        this.p = new Program(new ArrayList<>(), new LOLDefaultRuntime());
        this.decs = decs;
    }

    @Override
    public void enterProgram(LOLcodeParser.ProgramContext ctx) {
        ScopeDecoration dec = ScopeDecoration.find(decs, ctx);

        // code to label the main entry point, and to establish a frame
        p.defLabel("$main");
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0, "establish new frame pointer"));

        // now add room for global variables
        p.add(new Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.ESP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, dec.getNumVariables() * 4, "room for locals"));

        // print start message
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, p.newStringId("LOLCode main program started"), "string id of start message"));
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push argument"));
        p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("output"), "call $output"));

    }

    @Override
    public void exitProgram(LOLcodeParser.ProgramContext ctx) {
        // print start message
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, p.newStringId("LOLCode main program finished"), "string id of end message"));
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push argument"));
        p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("output"), "call $output"));

        // kill frame and exit
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.ESP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, 0, "scratch locals"));
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "kill frame"));
        p.add(new Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "return to host"));
    }

    @Override
    public void enterFunc_decl(LOLcodeParser.Func_declContext ctx) {
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        String name = ctx.getTokens(LOLcodeParser.IDENTIFIER).get(0).getText();

        // first, a jump, because in our running program, we want to skip this function as it is being declared
        p.add(new Instruction(Vx86.Inx.JMP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.refLabel(name + "$after"), "skipping function \"" + name + "\""));

        // now the actual function itself, first a label and the frame
        p.defLabel(name);
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0, "establish new frame pointer"));

        // now room for local variables
        p.add(new Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.ESP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, dec.getNumVariables() * 4, "room for locals"));
    }

    @Override
    public void exitFunc_decl(LOLcodeParser.Func_declContext ctx) {
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        String name = ctx.getTokens(LOLcodeParser.IDENTIFIER).get(0).getText();

        p.defLabel(name + "$ret");
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.ESP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, 0, "scratch locals"));
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "restore previous frame pointer"));
        p.add(new Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, dec.numArgs * 4, "return from function"));
        p.defLabel(name + "$after");

    }

    @Override
    public void exitOutput_arg(LOLcodeParser.Output_argContext ctx) {
        // if this, an arg to the visible function, is not a string, convert it into one
        ExprDecoration dec = (ExprDecoration) decs.get(ctx);
        if (dec.type != Variable.Type.STRING) {
            switch (dec.type) {
                case INTEGER:
                    p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push arg for conversion"));
                    p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("intToString"), "call $intToString"));
                    break;
                case FLOAT:
                    p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push arg for conversion"));
                    p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("floatToString"), "call $floatToString"));
                    break;
                case BOOLEAN:
                    p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push arg for conversion"));
                    p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("booleanToString"), "call $booleanToString"));
                    break;
                default:
                    break;
            }
        }
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push arg for output"));

    }

    @Override
    public void exitNaked_arg(LOLcodeParser.Naked_argContext ctx) {
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push arg"));
    }

    @Override
    public void enterOutput_args(LOLcodeParser.Output_argsContext ctx) {
    }

    @Override
    public void exitOutput_args(LOLcodeParser.Output_argsContext ctx) {
        OutputArgListDecoration dec = (OutputArgListDecoration) decs.get(ctx);
        // check number of args, if more than one, insert a concat
        if (dec.numArgs > 1) {
            p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, dec.numArgs, "#arguments to concat"));
            p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
            p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("concat"), "call $concat"));
            p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push string for output"));
        }
    }

    @Override
    public void exitOutput(LOLcodeParser.OutputContext ctx) {
        p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("output"), "call $output"));
    }

    @Override
    public void enterLiteral_value(LOLcodeParser.Literal_valueContext ctx) {
        // put up the type, and any constant it might have
        ExprDecoration dec = (ExprDecoration) decs.get(ctx);

        switch (dec.type) {
            case INTEGER:
                p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, (int) dec.value, "int constant " + dec.value));
                break;
            case STRING:
                p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, p.newStringId((String) dec.value), "string constant \"" + dec.value + "\""));
                break;
            case FLOAT:
                p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Float.floatToIntBits((float) dec.value), "float constant " + dec.value));
                break;
            case BOOLEAN:
                p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, ((boolean) dec.value) ? 1 : 0, "boolean constant " + dec.value));
                break;
            default:
                // not sure how we are here
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void exitDiff(LOLcodeParser.DiffContext ctx) {
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "diff arg 1"));
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "diff arg 2"));
        p.add(new Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.REGISTER, Vx86.Reg.EBX, 0));
    }

    @Override
    public void exitProduct(LOLcodeParser.ProductContext ctx) {
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "diff arg 1"));
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "diff arg 2"));
        p.add(new Instruction(Vx86.Inx.MUL, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.REGISTER, Vx86.Reg.EBX, 0));
    }

    @Override
    public void exitVar_decl(LOLcodeParser.Var_declContext ctx) {
        Variable v = ScopeDecoration.findVar(decs, ctx, ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText());

        // does it have an initializer?
        if (ctx.getChildCount() != 7) {
            p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 0));
        }
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, -(v.ordinal + 1) * 4, "initial value for \"" + v.name + "\""));
    }

    @Override
    public void enterVar_ref(LOLcodeParser.Var_refContext ctx) {
        // put up the type, and any constant it might have

        Variable v = ScopeDecoration.findVar(decs, ctx, ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText());
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, -(v.ordinal + 1) * 4, "load \"" + v.name + "\""));
    }

    @Override
    public void exitInput(LOLcodeParser.InputContext ctx) {
        Variable v = ScopeDecoration.findVar(decs, ctx, ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText());
        if (v == null) {
            Util.println("Unknown variable for GIMMEH: " + v.name);
            throw new IllegalArgumentException();
        }
        if (v.type != Variable.Type.STRING) {
            Util.println("Type mismatch for GIMMEH: " + v.name);
            throw new IllegalArgumentException();
        }

        p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.getRuntimeAddress("input"), "call $input"));
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, -(v.ordinal + 1) * 4, "store \"" + v.name + "\""));

    }

    @Override
    public void exitVar_assignment(LOLcodeParser.Var_assignmentContext ctx) {
        Variable v = ScopeDecoration.findVar(decs, ctx, ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText());
        if (v == null) {
            Util.println("Unknown variable for assignment: " + v.name);
            throw new IllegalArgumentException();
        }
        if (v.type != Variable.Type.STRING) {
            Util.println("Type mismatch for assignment: " + v.name);
            throw new IllegalArgumentException();
        }

        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, -(v.ordinal + 1) * 4, "store \"" + v.name + "\""));
    }

    @Override
    public void exitFunc_call(LOLcodeParser.Func_callContext ctx) {
        String name = ctx.getChild(2).getText();
        FunctionDecoration dec = FunctionDecoration.findByName(decs, ctx, name);
        p.add(new Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.refLabel(dec.name), "call \"" + dec.name + "\""));
    }

}
