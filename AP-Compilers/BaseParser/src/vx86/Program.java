/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vx86;

import java.util.ArrayList;

/**
 *
 * @author gmein
 */
 public class Program {
     
        Program(ArrayList<Vx86.Instruction> list, Runtime runtime, StringMap strings) {
            this.instructions = list;
            this.strings = strings;
            this.runtime = runtime;
        }

        ArrayList<Vx86.Instruction> instructions;
        StringMap strings;
        Runtime runtime;

        public void dump() {
            int line = 0;
            for (Vx86.Instruction x : instructions) {
                System.out.println(Util.rightJustify("" + line, 4) + ": " + x);
                line++;
                // extra line after ret
                if (x.name == Vx86.Inx.RET) {
                    System.out.println("");
                }
            }
        }
    }