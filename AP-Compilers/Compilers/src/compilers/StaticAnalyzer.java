package compilers;

import java.util.List;
import lol.LOLcodeBaseListener;
import lol.LOLcodeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import vx86.Util;

/**
 *
 * @author gmein
 */
public class StaticAnalyzer extends LOLcodeBaseListener {

    // keep track here:
    // list of global variables encountered, with names
    // list of functions declared
    ParseTreeProperty<Decoration> decs = new ParseTreeProperty<>();

    // loop checking: the easy stuff
    @Override
    public void enterLoop(LOLcodeParser.LoopContext ctx) {
        List<TerminalNode> labels = ctx.getTokens(LOLcodeParser.IDENTIFIER);
        if (labels.size() != 2 || !labels.get(0).getText().equals(labels.get(1).getText())) {
            System.err.println("Encountered mismatched loop labels in line " + ctx.getStart().getLine());
            throw new IllegalArgumentException();
        }
        System.out.println("Encountering loop " + labels.get(0).getText());
        // to do: check enter and exit labels
    }

    @Override
    public void enterProgram(LOLcodeParser.ProgramContext ctx) {
        // put up new scope
        ScopeDecoration scope = new ScopeDecoration(ctx);
        decs.put(ctx, scope);
    }

    @Override
    public void enterFunc_decl(LOLcodeParser.Func_declContext ctx) {
        String name = ctx.getTokens(LOLcodeParser.IDENTIFIER).get(0).getText();

        // put up new scope
        Util.println("Entering function declaration for " + name);
        FunctionDecoration dec = new FunctionDecoration(ctx, name);
        decs.put(ctx, dec);

    }

    @Override
    public void exitFunc_decl(LOLcodeParser.Func_declContext ctx) {
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        Util.println("Exiting function declaration for " + dec.name + ", counted " + dec.numArgs + " arguments");
    }

    @Override
    public void enterVar_decl(LOLcodeParser.Var_declContext ctx) {
        // name is the 4th token (index 3) in this context
        String name = ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText();

        // type is the first token in the vartype subnode which is the child (not token) with index 3
        LOLcodeParser.VartypeContext ctxType = (LOLcodeParser.VartypeContext) ctx.getChild(3);
        String type = ctxType.getText().toLowerCase();

        // now find the responsible scope and register the variable
        ScopeDecoration scope = ScopeDecoration.find(decs, ctx);
        scope.addVariable(ctx.getToken(LOLcodeParser.IDENTIFIER, 0).getText(), type);

        Util.println("registered variable " + name + " with type " + type);
    }

    @Override
    public void enterArg_decl(LOLcodeParser.Arg_declContext ctx) {
        // to do: Register this arg in the function's scope
        // put up new scope
        FunctionDecoration dec = FunctionDecoration.find(decs, ctx);
        dec.numArgs++;  // will be counted by arg nodes, updated by exit event
    }

    @Override
    public void enterVar_ref(LOLcodeParser.Var_refContext ctx) {
        // to do: walk up tree, checking for scopes, searching those for variables
        System.out.println("Using variable in expression: " + ctx.getTokens(LOLcodeParser.IDENTIFIER));
    }

    private void setTypeFromChildren(ParserRuleContext ctx) {
        // put up the type, and any constant it might have
        ExprDecoration dec = (ExprDecoration) decs.get(ctx);
        Util.println("Setting type for " + ctx.getClass().getName());

        // type upward propagation: if all subnodes have same type, make that ours
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            ExprDecoration decChild = (ExprDecoration) decs.get(child);
            if (decChild == null) {
                // something went wrong
                Util.println("undecorated sub-expression in upward promotion");
                throw new IllegalArgumentException();
            }
            if (dec.type == Variable.Type.NULL) {
                // our expression is still undecided, record the child node's type here
                dec.type = decChild.type;
            } else {
                // our type is already set, is it the same?
                if (dec.type != decChild.type) {
                    Util.println("type mismatch in " + ctx.getStart().getLine());
                }
            }
        }
        if (dec.type != Variable.Type.NULL) {
            Util.println("  success, set to " + dec.type);
        } else {
            Util.println("  failed");
        }
    }

    @Override
    public void exitAtom(LOLcodeParser.AtomContext ctx) {
        // put up the type, and any constant it might have
        ExprDecoration dec = new ExprDecoration(ctx);
        decs.put(ctx, dec);
        setTypeFromChildren(ctx);
    }

     @Override
    public void enterOutput_args(LOLcodeParser.Output_argsContext ctx) {
        // put up the type, and any constant it might have
        OutputArgListDecoration dec = new OutputArgListDecoration(ctx);
        decs.put(ctx, dec);
    }
    
    @Override
    public void exitOutput_args(LOLcodeParser.Output_argsContext ctx) {
    }

    @Override
    public void exitOutput_arg(LOLcodeParser.Output_argContext ctx) {
        // put up the type, and any constant it might have
        ExprDecoration dec = new ExprDecoration(ctx);
        decs.put(ctx, dec);
        setTypeFromChildren(ctx);
        
        // count this argument in the list
        OutputArgListDecoration decList = OutputArgListDecoration.find(decs, ctx);
        decList.numArgs++;
    }

    @Override
    public void exitExpr(LOLcodeParser.ExprContext ctx) {
        // put up the type, and any constant it might have
        ExprDecoration dec = new ExprDecoration(ctx);
        decs.put(ctx, dec);

        setTypeFromChildren(ctx);
    }

    @Override
    public void enterLiteral_value(LOLcodeParser.Literal_valueContext ctx) {
        // put up the type, and the constant
        ExprDecoration dec = new ExprDecoration(ctx);
        decs.put(ctx, dec);

        TerminalNode tn = (TerminalNode) ctx.children.get(0);
        switch (tn.getSymbol().getType()) {
            case LOLcodeParser.INTEGER:
                dec.type = Variable.Type.INTEGER;
                dec.value = Integer.parseInt(tn.getText());
                break;
            case LOLcodeParser.STRING:
                dec.type = Variable.Type.STRING;
                String s = tn.getText();
                dec.value = s.substring(1, s.length() - 1);
                break;
            case LOLcodeParser.FLOAT:
                dec.type = Variable.Type.FLOAT;
                dec.value = Float.parseFloat(tn.getText());
                break;
            case LOLcodeParser.BOOLEAN:
                dec.type = Variable.Type.BOOLEAN;
                dec.value = tn.getText().equalsIgnoreCase("win");
                break;
            default:
                // not sure how we are here
                throw new IllegalArgumentException();
        }
    }

}