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

    public Variable(String n, int ord, Type t) {
        this.name = n;
        this.ordinal = ord;
        this.type = t;
    }

    public static enum Type {
        INTEGER, FLOAT, BOOLEAN, STRING, NULL;
    }

    public static Variable.Type typeFromTypeName(String typeName) {
        Variable.Type t;
        typeName = typeName.toLowerCase();
        switch (typeName) {
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
        return t;
    }

}
