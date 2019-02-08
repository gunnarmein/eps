package baseparser;

import lol.LOLcodeBaseListener;
import lol.LOLcodeParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 *
 * @author gmein
 */
public class Checker extends LOLcodeBaseListener {

    // keep track here:
    // list of global variables encountered, with names
    // list of functions declared
    ParseTreeProperty<Decoration> decs = new ParseTreeProperty<>();

    // loop checking: the easy stuff
    @Override
    public void enterLoop(LOLcodeParser.LoopContext ctx) {
        System.out.println("Encountering loop " + ctx.getTokens(LOLcodeParser.IDENTIFIER));
        // to do: check enter and exit labels
    }

    @Override
    public void enterProgram(LOLcodeParser.ProgramContext ctx) {
        // put up new scope
        Decoration dec = new Decoration();
        decs.put(ctx, dec);
    }

    @Override
    public void enterFunc_decl(LOLcodeParser.Func_declContext ctx) {
        System.out.println("Encountering function declaration " + ctx.getTokens(LOLcodeParser.IDENTIFIER));

        // put up new scope
        Decoration dec = new Decoration();
        decs.put(ctx, dec);
    }

    @Override
    public void enterVar_decl(LOLcodeParser.Var_declContext ctx) {
        // to do: walk up tree, find scope, register var
    }

    @Override
    public void enterArg_decl(LOLcodeParser.Arg_declContext ctx) {
        // to do: Register this arg in the function's scope
    }

    @Override
    public void enterVar_ref(LOLcodeParser.Var_refContext ctx) {
        // to do: walk up tree, checking for scopes, searching those for variables
        System.out.println("Using variable in expression: " + ctx.getTokens(LOLcodeParser.IDENTIFIER));
    }

}
