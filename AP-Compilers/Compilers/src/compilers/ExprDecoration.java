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
public class ExprDecoration extends Decoration {

    Variable.Type type;
    Object value;
    
    ExprDecoration(ParseTree ctx) {
        super(ctx);
        type = Variable.Type.NULL;
        value = null;
    }
    
}
