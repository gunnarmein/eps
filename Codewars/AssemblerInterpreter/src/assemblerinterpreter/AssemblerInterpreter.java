package assemblerinterpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AssemblerInterpreter {

    public static void main(String[] args) {
        AssemblerInterpreterTest.sampleTests();
    }

    public static String interpret(final String input) {
        Processor p = new Processor();
        return p.run(input);
    }

    static class Processor {

        int ip;
        String[] program;
        HashMap<String, Integer> registers = new HashMap<>();
        HashMap<String, Integer> labels = new HashMap<>();
        LinkedList<Integer> stack = new LinkedList<>();
        boolean zeroFlag;
        boolean carryFlag;
        String msg;

        String[] parseProgram(String p) {
            ArrayList<String> al = new ArrayList<>();
            Scanner sc = new Scanner(p);
            ip = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                line = trimComments(line);
                if (line.endsWith(":")) {
                    String label = line.substring(0, line.length() - 1);
                    labels.put(label, ip);
                }
                System.out.println("Parsed " + ip + "--- " + line);
                al.add(line);
                ip++;
            }

            String[] p2 = new String[al.size()];
            al.toArray(p2);
            return p2;
        }

        String trimComments(String line) {
            boolean inQuotes = false;
            for (int i = 0; i < line.length(); i++) {
                switch (line.charAt(i)) {
                    case '\'':
                        inQuotes = !inQuotes;
                        break;
                    case ';':
                        if (!inQuotes) {
                            return line.substring(0, i).trim();
                        }
                }
            }
            return line.trim();
        }

        int parseOperand(String op) {
            if (registers.containsKey(op)) {
                return registers.get(op);
            } else {
                return Integer.parseInt(op);
            }
        }

        int resolveLabel(String op) {
            return labels.get(op);
        }

        void dumpRegisters() {
            System.out.print("{ ");
            registers.forEach((r, v) -> {
                System.out.print(r + ":" + v + " ");
            });
            System.out.print(carryFlag ? "c " : "");
            System.out.print(zeroFlag ? "z " : "");
            System.out.println("}");
        }

        String run(String p) {
            this.program = parseProgram(p);
            ip = 0;
            while (ip < program.length) {
                dumpRegisters();
                System.out.println("" + ip + ": " + program[ip] + " ");
                String line = program[ip];
                Scanner sc = new Scanner(line);
                sc.useDelimiter("[ \t,]+");
                if (sc.hasNext()) {
                    String instruction = sc.next();
                    String reg;
                    String op;
                    int value;

                    switch (instruction) {
                        case "end":
                            return msg;

                        case "msg":
                            // a little manual parsing
                            msg = "";
                            String part = "";
                            line = sc.nextLine().trim();
                            while (line.length() != 0) {
                                int next = 0;
                                if (line.substring(0, 1).equals("'")) {
                                    // there is a literal string here
                                    part = line.substring(1, line.indexOf("'", 1));
                                    next = line.indexOf(',', part.length() + 2);
                                    if (next == -1) {
                                        next = line.length() + 1;
                                    } else {
                                        next++;
                                    }
                                } else {
                                    // just arguments, either find the next comma, or take rest of line
                                    int comma = line.indexOf(',');
                                    if (comma != -1) {
                                        part = line.substring(0, comma);
                                        next = comma + 1;
                                    } else {
                                        part = line;
                                        next = line.length() + 1;
                                    }
                                    part = part.trim();
                                    part = Integer.toString(parseOperand(part));
                                }

                                msg += part;
//                                System.out.println("Line: " + line);
//                                System.out.println("Part: '" + part + "'");
//                                System.out.println("next: " + next);
                                if (next < line.length()) {
                                    line = line.substring(next).trim();
                                } else {
                                    line = "";
                                }

                            }
                            break;

                        // mov x y - copies y (either a constant value or the content of a register) into register x
                        case "mov":
                            reg = sc.next();
                            op = sc.next();
                            value = parseOperand(op);
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

                        case "add":
                            reg = sc.next();
                            value = registers.get(reg);
                            op = sc.next();
                            value += parseOperand(op);
                            registers.put(reg, value);
                            break;

                        case "mul":
                            reg = sc.next();
                            value = registers.get(reg);
                            op = sc.next();
                            value *= parseOperand(op);
                            registers.put(reg, value);
                            break;

                        case "sub":
                            reg = sc.next();
                            value = registers.get(reg);
                            op = sc.next();
                            value -= parseOperand(op);
                            registers.put(reg, value);
                            break;

                        case "div":
                            reg = sc.next();
                            value = registers.get(reg);
                            op = sc.next();
                            value /= parseOperand(op);
                            registers.put(reg, value);
                            break;

                        case "cmp":
                            reg = sc.next();
                            value = registers.get(reg);
                            op = sc.next();
                            value -= parseOperand(op);
                            carryFlag = value < 0;
                            zeroFlag = value == 0;
                            break;

                        case "call":
                            op = sc.next();
                            value = resolveLabel(op);
                            stack.addLast(ip);
                            ip = value;
                            continue;

                        case "ret":
                            ip = stack.removeLast();
                            break;

                        case "jmp":
                            op = sc.next();
                            value = resolveLabel(op);
                            ip = value;
                            continue;

                        case "jne":
                            if (!zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        case "je":
                            if (zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        case "jg":
                            if (!carryFlag && !zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        case "jge":
                            if (!carryFlag || zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        case "jl":
                            if (carryFlag && !zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        case "jle":
                            if (carryFlag || zeroFlag) {
                                op = sc.next();
                                value = resolveLabel(op);
                                ip = value;
                                continue;
                            }
                            break;

                        default:
                            //error
                            //System.out.println("error");
                            break;
                    } //switch
                } // hasNext()
                ip++;
            }
            return null;
        }
    }

    static class AssemblerInterpreterTest {

        static public void sampleTests() {
            for (int i = 0; i < expected.length; i++) {
                System.out.println(AssemblerInterpreter.interpret(displayProg(progs[i])));
                System.out.println("Expected: " + expected[i]);
            }
        }

        private static String[] progs = {
            //            "\n; My first program\nmov  a, 5\ninc  a\ncall function\nmsg  '(5+1)/2 = ', a    ; output message\nend\n\nfunction:\n    div  a, 2\n    ret\n",
            //            "\nmov   a, 5\nmov   b, a\nmov   c, a\ncall  proc_fact\ncall  print\nend\n\nproc_fact:\n    dec   b\n    mul   c, b\n    cmp   b, 1\n    jne   proc_fact\n    ret\n\nprint:\n    msg   a, '! = ', c ; output text\n    ret\n",
            "\nmov   a, 8            ; value\nmov   b, 0            ; next\nmov   c, 0            ; counter\nmov   d, 0            ; first\nmov   e, 1            ; second\ncall  proc_fib\ncall  print\nend\n\nproc_fib:\n    cmp   c, 2\n    jl    func_0\n    mov   b, d\n    add   b, e\n    mov   d, e\n    mov   e, b\n    inc   c\n    cmp   c, a\n    jle   proc_fib\n    ret\n\nfunc_0:\n    mov   b, c\n    inc   c\n    jmp   proc_fib\n\nprint:\n    msg   'Term ', a, ' of Fibonacci series is: ', b        ; output text\n    ret\n",
            //            "\nmov   a, 11           ; value1\nmov   b, 3            ; value2\ncall  mod_func\nmsg   'mod(', a, ', ', b, ') = ', d        ; output\nend\n\n; Mod function\nmod_func:\n    mov   c, a        ; temp1\n    div   c, b\n    mul   c, b\n    mov   d, a        ; temp2\n    sub   d, c\n    ret\n",
            //            "\nmov   a, 81         ; value1\nmov   b, 153        ; value2\ncall  init\ncall  proc_gcd\ncall  print\nend\n\nproc_gcd:\n    cmp   c, d\n    jne   loop\n    ret\n\nloop:\n    cmp   c, d\n    jg    a_bigger\n    jmp   b_bigger\n\na_bigger:\n    sub   c, d\n    jmp   proc_gcd\n\nb_bigger:\n    sub   d, c\n    jmp   proc_gcd\n\ninit:\n    cmp   a, 0\n    jl    a_abs\n    cmp   b, 0\n    jl    b_abs\n    mov   c, a            ; temp1\n    mov   d, b            ; temp2\n    ret\n\na_abs:\n    mul   a, -1\n    jmp   init\n\nb_abs:\n    mul   b, -1\n    jmp   init\n\nprint:\n    msg   'gcd(', a, ', ', b, ') = ', c\n    ret\n",
            //            "\ncall  func1\ncall  print\nend\n\nfunc1:\n    call  func2\n    ret\n\nfunc2:\n    ret\n\nprint:\n    msg 'This program should return null'\n",
            //            "\nmov   a, 2            ; value1\nmov   b, 10           ; value2\nmov   c, a            ; temp1\nmov   d, b            ; temp2\ncall  proc_func\ncall  print\nend\n\nproc_func:\n    cmp   d, 1\n    je    continue\n    mul   c, a\n    dec   d\n    call  proc_func\n\ncontinue:\n    ret\n\nprint:\n    msg a, '^', b, ' = ', c\n    ret\n",
            ""
        };

        private static String[] expected = {
            //            "(5+1)/2 = 3",
            //            "5! = 120",
            "Term 8 of Fibonacci series is: 21",
            //            "mod(11, 3) = 2",
            //            "gcd(81, 153) = 9",
            //            null,
            //            "2^10 = 1024",
            null
        };

        static private String displayProg(String p) {
            System.out.println("\n----------------------\n");
            System.out.println(p);
            return p;
        }
    }

}

/*
This is the second part of this kata series. First part is here.

We want to create an interpreter of assembler which will support the following instructions:

mov x, y - copy y (either an integer or the value of a register) into register x.
inc x - increase the content of register x by one.
dec x - decrease the content of register x by one.
add x, y - add the content of the register x with y (either an integer or the value of a register) and stores the result in x (i.e. register[x] += y).
sub x, y - subtract y (either an integer or the value of a register) from the register x and stores the result in x (i.e. register[x] -= y).
mul x, y - same with multiply (i.e. register[x] *= y).
div x, y - same with integer division (i.e. register[x] /= y).
label: - define a label position (label = identifier + ":", an identifier being a string that does not match any other command). Jump commands and call are aimed to these labels positions in the program.
jmp lbl - jumps to to the label lbl.
cmp x, y - compares x (either an integer or the value of a register) and y (either an integer or the value of a register). The result is used in the conditional jumps (jne, je, jge, jg, jle and jl)
jne lbl - jump to the label lbl if the values of the previous cmp command were not equal.
je lbl - jump to the label lbl if the values of the previous cmp command were equal.
jge lbl - jump to the label lbl if x was greater or equal than y in the previous cmp command.
jg lbl - jump to the label lbl if x was greater than y in the previous cmp command.
jle lbl - jump to the label lbl if x was less or equal than y in the previous cmp command.
jl lbl - jump to the label lbl if x was less than y in the previous cmp command.
call lbl - call to the subroutine identified by lbl. When a ret is found in a subroutine, the instruction pointer should return to the instruction next to this call command.
ret - when a ret is found in a subroutine, the instruction pointer should return to the instruction that called the current function.
msg 'Register: ', x - this instruction stores the output of the program. It may contain text strings (delimited by single quotes) and registers. The number of arguments isn't limited and will vary, depending on the program.
end - this instruction indicates that the program ends correctly, so the stored output is returned (if the program terminates without this instruction it should return the default output: see below).
; comment - comments should not be taken in consideration during the execution of the program.

Output format:
The normal output format is a string (returned with the end command).

If the program does finish itself without using an end instruction, the default return value is:

null

Input format:
The function/method will take as input a multiline string of instructions, delimited with EOL characters. Please, note that the instructions may also have indentation for readability purposes.

For example:

program = "\n; My first program\nmov  a, 5\ninc  a\ncall function\nmsg  '(5+1)/2 = ', a    ; output message\nend\n\nfunction:\n    div  a, 2\n    ret\n"
AssemblerInterpreter.interpret(program);

// Which is equivalent to (keep in mind that empty lines are not displayed in the console on CW, so you actually won't see the separation before "function:"...):

; My first program
mov  a, 5
inc  a
call function
msg  '(5+1)/2 = ', a    ; output message
end

function:
    div  a, 2
    ret
The above code would set register a to 5, increase its value by 1, calls the subroutine function, divide its value by 2, returns to the first call instruction, 
prepares the output of the program and then returns it with the end instruction. In this case, the output would be (5+1)/2 = 3.
 */
