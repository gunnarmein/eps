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

    ScopeDecoration(ParseTree ctx) {
        super(ctx);
        vars = new HashMap<>();
    }

    public int getNumVariables() {
        return vars.size();
    }

    public void addVariable(String name, String type) {
        Variable.Type t;

        if (!name.equalsIgnoreCase("it") && vars.containsKey(name)) {
            throw new IllegalArgumentException();
        }

        switch (type) {
            case "numbr":
                t = Variable.Type.INTEGER;
                break;
            case "numbar":
                t = Variable.Type.FLOAT;
                break;
            case "yarn":
                t = Variable.Type.STRING;
                break;
            case "troof":
                t = Variable.Type.BOOLEAN;
                break;
            case "null":
            default:
                t = Variable.Type.NULL;
        }

        Variable var = new Variable(name, this.vars.size(), t);
        vars.put(name, var);
    }
    
        public void addParameter(String name, String type, int ordinal) {
        Variable.Type t;

        if (!name.equalsIgnoreCase("it") && vars.containsKey(name)) {
            throw new IllegalArgumentException();
        }

        switch (type) {
            case "numbr":
                t = Variable.Type.INTEGER;
                break;
            case "numbar":
                t = Variable.Type.FLOAT;
                break;
            case "yarn":
                t = Variable.Type.STRING;
                break;
            case "troof":
                t = Variable.Type.BOOLEAN;
                break;
            case "null":
            default:
                t = Variable.Type.NULL;
        }

        Variable var = new Variable(name, ordinal, t);
        vars.put(name, var);
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

}
