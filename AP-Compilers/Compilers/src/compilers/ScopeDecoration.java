/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 *
 * @author gmein
 */
public class ScopeDecoration extends Decoration {

    HashMap<String, Variable> vars;
    HashMap<String, FunctionDecoration> funcs;
    int varNum;

    ScopeDecoration(ParseTree ctx) {
        super(ctx);
        vars = new HashMap<>();
        funcs = new HashMap<>();
        varNum = 0;
    }

    public int getNumVariables() {
        return vars.size();
    }

    public void addVariable(String name, Variable.Type type) {

        if (!name.equalsIgnoreCase("it") && vars.containsKey(name)) {
            throw new IllegalArgumentException();
        }

        varNum++;
        Variable var = new Variable(name, -varNum, type);
        vars.put(name, var);
    }

    public void addFunction(String name, FunctionDecoration fdec) {
        funcs.put(name, fdec);
    }

    static ScopeDecoration find(ParseTreeProperty<Decoration> decs, ParseTree ctx) {
        Decoration dec = Decoration.find(decs, ctx, ScopeDecoration.class);
        if (dec != null) {
            return (ScopeDecoration) dec;
        }
        return null;
    }

    static Variable findVar(ParseTreeProperty<Decoration> decs, ParseTree ctx, String name) {
        do {
            // go up tree to find next scope
            ScopeDecoration scope = find(decs, ctx);
            if (scope == null) {
                return null;
            }

            // does it have our variable?
            Variable var = scope.vars.get(name);
            if (var != null) {
                // yes! return the variable
                return var;
            }

            // go sideways back to tree to get to parent
            ctx = scope.ctx.getParent();
        } while (ctx != null);

        // nothing found
        return null;
    }

    static FunctionDecoration findFunc(ParseTreeProperty<Decoration> decs, ParseTree ctx, String name) {
        do {
            // go up tree to find next scope
            ScopeDecoration scope = find(decs, ctx);
            if (scope == null) {
                return null;
            }

            // does it have our variable?
            FunctionDecoration fdec = scope.funcs.get(name);
            if (fdec != null) {
                // yes! return the variable
                return fdec;
            }

            // go sideways back to tree to get to parent
            ctx = scope.ctx.getParent();
        } while (ctx != null);

        // nothing found
        return null;
    }

}
