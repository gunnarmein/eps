/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

/**
 *
 * @author gmein
 */
public class ReminderNode extends Node{
    double value;
    
      ReminderNode(Double v) {
        super(Kind.REMINDER);
        value = v;
    }

    @Override
    public String toString() {
        return "[reminder "+value+" seconds]";
    }

    @Override
    public void dump(int recursionLevel) {
        System.out.println(Util.prefix(recursionLevel) + this);
    }

    
}
