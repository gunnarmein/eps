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
    }

    @Override
    public void exitProgram(LOLcodeParser.ProgramContext ctx) {
        p.add(new Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "return to host"));
    }

    @Override
    public void enterFunc_decl(LOLcodeParser.Func_declContext ctx) {
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        String name = ctx.getTokens(LOLcodeParser.IDENTIFIER).get(0).getText();

        // first, a jump, because in our running program, we want to skip this function as it is being declared
        p.add(new Instruction(Vx86.Inx.JMP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, p.refLabel(name+"$after")));
        
        // now the actual function itself, first a label and the frame
        p.defLabel(name);
        p.add(new Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        p.add(new Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0, "establish new frame pointer"));
        
        // now room for local variables
        p.add(new Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.ESP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, dec.getNumVariables()*4, "room for locals"));
  }

    @Override
    public void exitFunc_decl(LOLcodeParser.Func_declContext ctx) {
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        String name = ctx.getTokens(LOLcodeParser.IDENTIFIER).get(0).getText();

        p.defLabel(name + "$ret");
        p.add(new Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "restore previous frame pointer"));
        p.add(new Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, dec.numArgs * 4, "return from function"));
        p.defLabel(name + "$after");

    }
}
