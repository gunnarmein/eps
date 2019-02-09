/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

import java.util.ArrayList;

/**
 *
 * @author gmein
 */
public class Vx86Examples {
     public static ArrayList<Vx86.Instruction> example_increment() {
        ArrayList<Vx86.Instruction> result = new ArrayList<>();

        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 3, "argument for increment"));
        result.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 3, "call line 5"));
        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push result"));
        result.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Runtime.output.getAddress(), "call $output"));
        result.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "return to host"));

        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        result.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0, "establish new frame pointer"));
        result.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8, "load first parameter"));
        result.add(new Vx86.Instruction(Vx86.Inx.ADD, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1, "add 1"));
        result.add(new Vx86.Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "restore previous frame pointer"));
        result.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 4, "return from function"));

        return result;

    }

    public static ArrayList<Vx86.Instruction> example_factorial() {
        ArrayList<Vx86.Instruction> result = new ArrayList<>();

        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 10, "main program calculates 10! and prints it"));
        result.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 3, "call factorial line 5"));
        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        result.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Runtime.output.getAddress(), "call $output"));
        result.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));

        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "factorial starts here"));
        result.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0));
        result.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));
        result.add(new Vx86.Instruction(Vx86.Inx.CMP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1));
        result.add(new Vx86.Instruction(Vx86.Inx.JNE, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 1, "skip to line 11"));
        result.add(new Vx86.Instruction(Vx86.Inx.JMP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 5, "jmp to common ret point line 16"));

        result.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));
        result.add(new Vx86.Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1));
        result.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        result.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, -10, "recurse to line 5"));
        result.add(new Vx86.Instruction(Vx86.Inx.MUL, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));
  
        result.add(new Vx86.Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        result.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 4));
        
        return result;

    }
    
}
