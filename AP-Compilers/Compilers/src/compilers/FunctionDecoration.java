/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 *
 * @author gmein
 */
public class FunctionDecoration extends ScopeDecoration{
    public int numArgs;
    public String name;
    public Variable.Type returnType;
    
    FunctionDecoration(ParseTree ctx, String name) {
        super(ctx);
        this.name = name;
        this.numArgs = 0;
        this.returnType = Variable.Type.NULL;
    }
    
    
    static FunctionDecoration find(ParseTreeProperty<Decoration> decs, ParseTree ctx) {
      Decoration dec =  Decoration.find(decs, ctx, FunctionDecoration.class);
      if (dec != null) {
          return (FunctionDecoration) dec;
      }
      return null;
    }

}
