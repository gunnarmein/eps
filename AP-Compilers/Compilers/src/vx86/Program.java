/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vx86;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gmein
 */
public class Program {

    ArrayList<Instruction> instructions;
    StringMap strings;
    RuntimeSupport runtime;
    HashMap<String, Label> labels;

    public Program(ArrayList<Instruction> list, RuntimeSupport runtime) {
        this.instructions = list;
        this.strings = new StringMap();
        this.runtime = runtime;
        this.labels = new HashMap<>();
    }

    public int newStringId(String s) {
        return strings.newStringId(s);
    }

    public int getRuntimeAddress(String routine) {
        return runtime.getRuntimeAddress(routine);
    }

    public void defLabel(String name) {
        Label l = labels.get(name);
        if (l == null) {
            l = new Label(name);
            labels.put(name, l);
        }
        l.define(this.instructions.size());
        Util.println("label " + name + " defined at " + l.line);
    }

    public int refLabel(String name) {
        Label l = labels.get(name);
        if (l == null) {
            l = new Label(name);
            labels.put(name, l);
        }
        l.addRef(this.instructions.size());
        Util.println("label " + name + " referenced at " + this.instructions.size());
        return 0;
    }

    public boolean hasLabel(String name) {
        Label l = labels.get(name);
        if (l == null) {
            return false;
        }
        return l.defined;
    }
    
    public void resolveLabels() {
        for (Label l : labels.values()) {

            for (Integer refLine : l.refs) {
                if (l.defined) {
                Instruction ix = instructions.get(refLine);
                    ix.value = l.line - (refLine + 1);
                } else {
                    System.err.println("Reference to undefined label " + l.name + " at " + refLine);
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    public void dump() {
        int line = 0;
        for (Instruction x : instructions) {
            System.out.println(Util.rightJustify("" + line, 4) + ": " + x);
            line++;
            // extra line after ret
            if (x.name == Vx86.Inx.RET) {
                System.out.println("");
            }
        }
    }
}
