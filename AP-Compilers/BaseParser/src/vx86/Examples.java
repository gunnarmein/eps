/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vx86;

import lol.LOLDefaultRuntime;
import java.util.ArrayList;

/**
 *
 * @author gmein
 */
public class Examples {

    public static Program example_increment() {
        ArrayList<Vx86.Instruction> instructions = new ArrayList<>();
        StringMap strings = new StringMap();
        Runtime runtime = new LOLDefaultRuntime();

        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 3, "argument for increment"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 3, "call line 5"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "push result"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, runtime.getRuntimeAddres("output"), "call $output"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "return to host"));

        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0, "establish new frame pointer"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8, "load first parameter"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.ADD, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1, "add 1"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "restore previous frame pointer"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 4, "return from function"));

        Program program = new Program(instructions, runtime, strings);

        return program;

    }

    public static Program example_factorial() {
        ArrayList<Vx86.Instruction> instructions = new ArrayList<>();
        StringMap strings = new StringMap();
        Runtime runtime = new LOLDefaultRuntime();

        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.IMMEDIATE, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, strings.newStringId("Hello World! 10! is:")));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, runtime.getRuntimeAddres("output"), "call $output"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 10, "main program calculates 10! and prints it"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 5, "call factorial line 9"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, runtime.getRuntimeAddres("intToString"), "call $intToString"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, runtime.getRuntimeAddres("output"), "call $output"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.NONE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));

        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0, "factorial starts here"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.REGISTER, Vx86.Reg.ESP, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CMP, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1));
        instructions.add(new Vx86.Instruction(Vx86.Inx.JNE, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 1, "skip to line 11"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.JMP, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 5, "jmp to common ret point line 16"));

        instructions.add(new Vx86.Instruction(Vx86.Inx.MOV, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));
        instructions.add(new Vx86.Instruction(Vx86.Inx.SUB, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, 1));
        instructions.add(new Vx86.Instruction(Vx86.Inx.PUSH, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.CALL, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, -10, "recurse to line 5"));
        instructions.add(new Vx86.Instruction(Vx86.Inx.MUL, Vx86.Mode.REGISTER, Vx86.Reg.EAX, Vx86.Mode.INDIRECT, Vx86.Reg.EBP, 8));

        instructions.add(new Vx86.Instruction(Vx86.Inx.POP, Vx86.Mode.REGISTER, Vx86.Reg.EBP, Vx86.Mode.NONE, Vx86.Reg.NONE, 0));
        instructions.add(new Vx86.Instruction(Vx86.Inx.RET, Vx86.Mode.IMMEDIATE, Vx86.Reg.NONE, Vx86.Mode.NONE, Vx86.Reg.NONE, 4));

        Program program = new Program(instructions, runtime, strings);

        return program;

    }

}
