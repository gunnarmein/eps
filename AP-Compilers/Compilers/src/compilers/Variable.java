/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

/**
 *
 * @author gmein
 */
public class Variable {
    String name;
    int ordinal;
    Type type;
    
    public Variable (String n, int ord, Type t){
        this.name = n;
        this.ordinal = ord;
        this.type = t;
    }
            
    
    public static enum Type {
        NUMBR, NUMBAR, TROOF, YARN, NOOB;
    }
    
}
