/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleassembler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleAssembler {

    public static void main(String[] args) {
        SolutionTest.simple_1();
        SolutionTest.simple_2();

    }

    public static Map<String, Integer> interpret(String[] program) {
        Processor p = new Processor();

        p.run(program);

        return p.registers;
    }

    static class Processor {

        int ip;
        String[] program;
        HashMap<String, Integer> registers = new HashMap<>();

        void run(String[] p) {
            this.program = p;
            ip = 0;
            while (ip < program.length) {
                String line = program[ip];
                Scanner sc = new Scanner(line);
                String instruction = sc.next();
                String reg;
                String op;
                int value;

                switch (instruction) {
                    // mov x y - copies y (either a constant value or the content of a register) into register x
                    case "mov":
                        reg = sc.next();
                        op = sc.next();
                        if (registers.containsKey(op)) {
                            value = registers.get(op);
                        } else {
                            value = Integer.parseInt(op);
                        }
                        registers.put(reg, value);
                        break;

                    //inc x - increases the content of register x by one
                    case "inc":
                        reg = sc.next();
                        value = registers.get(reg);
                        registers.put(reg, value + 1);
                        break;

                    //dec x - decreases the content of register x by one
                    case "dec":
                        reg = sc.next();
                        value = registers.get(reg);
                        registers.put(reg, value - 1);
                        break;

                    //jnz x y 
                    case "jnz":
                        op = sc.next();
                        if (registers.containsKey(op)) {
                            value = registers.get(op);
                        } else {
                            value = Integer.parseInt(op);
                        }
                        if (value != 0) {
                            op = sc.next();
                            value = Integer.parseInt(op);
                            ip += value;
                            continue;
                        }
                        break;

                    default:
                    //error
                }
                ip++;
            }
        }
    }

    static class SolutionTest {

        static public void simple_1() {
            String[] program = new String[]{"mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"};
            Map<String, Integer> out = new HashMap<String, Integer>();
            out.put("a", 1);
            Map<String, Integer> result = SimpleAssembler.interpret(program);
            result.forEach((s, i) -> {
                System.out.println(s + ", " + i);
            });
        }

        static public void simple_2() {
            String[] program = new String[]{"mov a -10", "mov b a", "inc a", "dec b", "jnz a -2"};
            Map<String, Integer> out = new HashMap<String, Integer>();
            out.put("a", 0);
            out.put("b", -20);
            Map<String, Integer> result = SimpleAssembler.interpret(program);
            result.forEach((s, i) -> {
                System.out.println(s + ", " + i);
            });
        }
    }

}

/*
This is the first part of this kata series. Second part is here.

We want to create a simple interpreter of assembler which will support the following instructions:

mov x y - copies y (either a constant value or the content of a register) into register x
inc x - increases the content of register x by one
dec x - decreases the content of register x by one
jnz x y - jumps to an instruction y steps away (positive means forward, negative means backward), but only if x (a constant or a register) is not zero
Register names are alphabetical (letters only). Constants are always integers (positive or negative).

Note: the jnz instruction moves relative to itself. For example, an offset of -1 would continue at the previous instruction, while an offset of 2 would skip over the next instruction.

The function will take an input list with the sequence of the program instructions and will return a dictionary with the contents of the registers.

Also, every inc/dec/jnz on a register will always be followed by a mov on the register first, so you don't need to worry about uninitialized registers.

Example
SimpleAssebmler.interpret(new String[]{"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"});

''' visualized:
mov a 5
inc a
dec a
dec a
jnz a -1
inc a
''''
The above code will:

set register a to 5,
increase its value by 1,
decrease its value by 2,
then decrease its value until it is zero (jnz a -1 jumps to the previous instruction if a is not zero)
and then increase its value by 1, leaving register a at 1
So, the function should return

{a=1}
 */
