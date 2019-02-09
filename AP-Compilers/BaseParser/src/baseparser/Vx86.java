package baseparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * The Virtual x86 - Just enough x86 for our subset of LOLCODE
 *
 * @author gmein
 */
public class Vx86 {

    public static void dump(List<Instruction> program) {
        int line = 0;
        for (Instruction x : program) {
            System.out.println(rightJustify("" + line, 4) + ": " + x);
            line++;
            // extra line after ret
            if (x.name == Inx.RET) {
                System.out.println("");
            }
        }

    }

    public static enum Reg {
        NONE,
        EAX,
        EBX,
        ECX,
        EDX,
        ESP,
        EBP,
        FLAGS
    }

    public static enum Mode {
        NONE,
        REGISTER,
        IMMEDIATE,
        MEMORY,
        INDIRECT
    }

    public static enum Inx {
        NONE,
        MOV,
        PUSH,
        POP,
        CALL,
        RET,
        ADD,
        SUB,
        MUL,
        DIV,
        CMP,
        INC,
        DEC,
        FADD,
        FSUB,
        FMUL,
        FDIV,
        FCMP,
        JZ,
        JNZ,
        JE,
        JNE,
        JC,
        JNC,
        JGE,
        JG,
        JL,
        JLE,
        JMP,
    }

    public static enum Runtime {
        none(0),
        output(1),
        input(2),
        intToString(3),
        intToFloat(4),
        floatToInt(5),
        floatToString(6),
        stringToInt(7),
        stringToFloat(8),
        concat(9),
        strcmp(10);

        private int addr;

        private Runtime(int v) {
            addr = v;
        }

        public int getAddress() {
            return addr + 10000;
        }
    };
    static private Runtime[] runtime = Runtime.values();

    private static String leftJustify(String s, int n) {
        return (s + "                                                          ").substring(0, n);
    }

    private static String rightJustify(String s, int n) {
        s = ("                                                          " + s);
        return s.substring(s.length() - n);
    }

    public static class Instruction {

        Inx name;
        Mode opDest;
        Mode opSrc;
        Reg dest;
        Reg src;
        int value;
        String comment;

        Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val) {
            this.name = name;
            this.opSrc = opSrc;
            this.opDest = opDest;
            this.src = src;
            this.dest = dest;
            this.value = val;
        }

        Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val, String comment) {
            this.name = name;
            this.opSrc = opSrc;
            this.opDest = opDest;
            this.src = src;
            this.dest = dest;
            this.value = val;
            this.comment = comment;
        }

        boolean validate() {
            if ((this.opDest == Mode.MEMORY && this.opSrc == Mode.MEMORY)
                    || (this.opDest == Mode.INDIRECT && this.opSrc == Mode.INDIRECT)
                    || (this.opDest == Mode.INDIRECT && this.opSrc == Mode.MEMORY)
                    || (this.opDest == Mode.MEMORY && this.opSrc == Mode.INDIRECT)
                    || (this.opDest == Mode.NONE)
                    || (this.opDest == Mode.IMMEDIATE)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            String strSrc = opToString(opSrc, src, value);
            String strDest = opToString(opDest, dest, value);

            String strOp = "";
            if (strSrc != null && strDest != null) {
                strOp = strDest + "," + strSrc;
            } else if (strDest != null) {
                strOp = strDest;
            } else if (strSrc != null) {
                strOp = strSrc;
            }

            return leftJustify(name.toString(), 5)
                    + leftJustify(strOp, 20)
                    + ((comment == null) ? "" : "; " + comment);
        }

        private String opToString(Mode opMode, Reg reg, int val) {
            switch (opMode) {
                case REGISTER:
                    return reg.toString();
                case IMMEDIATE:
                    return Integer.toString(val);
                case MEMORY:
                    return "[" + val + "]";
                case INDIRECT:
                    return "[" + reg.toString() + (val != 0 ? (val < 0 ? "" : "+") + val : "") + "]";
                default:
            }
            return null;
        }
    }

    //
    // machine state
    //
    private int eip;
    private HashMap<Reg, Integer> regs;
    private int[] memory;
    private boolean cf;
    private boolean zf;
    
    private String status () {
        return "["
                +regs.get(Reg.EAX)+","
                +regs.get(Reg.EBX)+","
                +regs.get(Reg.ECX)+","
                +regs.get(Reg.EDX)+","
                +"s:"+regs.get(Reg.ESP)+","
                +"b:"+regs.get(Reg.EBP)+","
                +(cf?"c":"")+(zf?"z":"")
                +"]";
    }

    public void setup() {
        regs = new HashMap<>();
        regs.put(Reg.EAX, 0);
        regs.put(Reg.EBX, 0);
        regs.put(Reg.ECX, 0);
        regs.put(Reg.EDX, 0);
        regs.put(Reg.EBP, 0);

        memory = new int[10000 / 4];
    }

    private void writeRegister(Reg reg, int value) {
        if (regs.get(reg) == null) {
            System.err.println("Vx86: unknown register " + (eip - 1));
            throw new IllegalArgumentException();
        }

        regs.put(reg, value);
    }

    private int readRegister(Reg reg) {
        Integer value = regs.get(reg);
        if (value == null) {
            System.err.println("Vx86: unknown register " + (eip - 1));
            throw new IllegalArgumentException();
        }

        return value;
    }

    private void writeMemory(int address, int val) {
        if (address % 4 != 0) {
            System.err.println("Vx86: unaligned memory acces at " + (eip - 1));
            throw new IllegalArgumentException();
        }
        memory[address / 4] = val;
    }

    private int readMemory(int address) {
        if (address % 4 != 0) {
            System.err.println("Vx86: unaligned memory access at " + (eip - 1));
            throw new IllegalArgumentException();
        }
        return memory[address / 4];
    }

    private int readSrc(Mode opSrc, Reg reg, int val) {
        switch (opSrc) {
            case REGISTER:
                return readRegister(reg);
            case IMMEDIATE:
                return val;
            case MEMORY:
                return readMemory(val);
            case INDIRECT:
                return readMemory(readRegister(reg) + val);
            default:
                System.err.println("Vx86: unknown opmode at " + (eip - 1));
                throw new IllegalArgumentException();
        }
    }

    private void writeDest(Mode opDest, Reg reg, int val, int data) {
        switch (opDest) {
            case REGISTER:
                writeRegister(reg, data);
                break;
            case MEMORY:
                writeMemory(val, data);
                break;
            case INDIRECT:
                writeMemory(readRegister(reg) + val, data);
                break;
            default:
                System.err.println("Vx86: unknown opmode at " + (eip - 1));
                throw new IllegalArgumentException();
        }
    }

    public void run(ArrayList<Instruction> program) {
        int src = 0;
        int dest = 0;
        int data = 0;
        int stack = 0;

        eip = 0;
        int preveip = -1;
        regs.put(Reg.ESP, memory.length * 4);

        while (eip >= 0 && eip < program.size()) {
            //dumpRegisters();
            Instruction ix = program.get(eip);
            System.out.println(status());
            System.out.println(""+ eip + ": " + ix);
            if (eip != preveip+1) {
                System.out.println("");
            }
            preveip = eip;
            eip++;
            switch (ix.name) {
                // mov x y - copies y (either a constant value or the content of a register) into register x
                case MOV:
                    data = readSrc(ix.opSrc, ix.src, ix.value);
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    break;

                case PUSH:
                    dest = readRegister(Reg.ESP);
                    dest -= 4;
                    writeRegister(Reg.ESP, dest);
                    data = readSrc(ix.opDest, ix.dest, ix.value);
                    writeDest(Mode.INDIRECT, Reg.ESP, 0, data);
                    break;

                case POP:
                    data = readSrc(Mode.INDIRECT, Reg.ESP, 0);
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    src = readRegister(Reg.ESP);
                    src += 4;
                    writeRegister(Reg.ESP, src);
                    break;

                case CALL:
                    stack = readRegister(Reg.ESP);
                    stack -= 4;
                    writeRegister(Reg.ESP, stack);
                    writeDest(Mode.INDIRECT, Reg.ESP, 0, eip);
                // intentional fall-through
                case JMP:
                    if (ix.opDest == Mode.IMMEDIATE && ix.value > 10000) {
                        invokeRuntime(ix.value);
                    } else {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case RET:
                    stack = readRegister(Reg.ESP);
                    if (stack == memory.length * 4) {
                        return;
                    }
                    eip = readSrc(Mode.INDIRECT, Reg.ESP, 0);
                    data = readSrc(ix.opDest, ix.dest, ix.value);
                    stack += 4 + data;
                    writeRegister(Reg.ESP, stack);
                    break;

                case ADD:
                    src = readSrc(ix.opSrc, ix.src, ix.value);
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    data = dest + src;
                    zf = data == 0;
                    cf = src > dest;
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    break;

                case SUB:
                    src = readSrc(ix.opSrc, ix.src, ix.value);
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    data = dest - src;
                    zf = data == 0;
                    cf = src > dest;
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    break;

                case CMP:
                    src = readSrc(ix.opSrc, ix.src, ix.value);
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    data = dest - src;
                    zf = data == 0;
                    cf = src > dest;
                    break;

                case MUL:
                    src = readSrc(ix.opSrc, ix.src, ix.value);
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    data = dest * src;
                    zf = data == 0;
                    cf = dest > data;
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    break;

                case DIV:
                    src = readSrc(ix.opSrc, ix.src, ix.value);
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    if (src == 0) {
                        System.err.println("Vx86: Divide by Zero at " + (eip - 1));
                        throw new IllegalArgumentException();
                    }
                    data = dest / src;
                    zf = data == 0;
                    cf = false;
                    writeDest(ix.opDest, ix.dest, ix.value, data);
                    break;

                case INC:
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    dest++;
                    zf = dest == 0;
                    cf = dest == Integer.MIN_VALUE;
                    writeDest(ix.opDest, ix.dest, ix.value, dest);
                    break;

                case DEC:
                    dest = readSrc(ix.opDest, ix.dest, ix.value);
                    dest--;
                    zf = dest == 0;
                    cf = dest == Integer.MAX_VALUE;
                    writeDest(ix.opDest, ix.dest, ix.value, dest);
                    break;

                case JZ:
                case JE:
                    if (zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JNZ:
                case JNE:
                    if (!zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JC:
                    if (cf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip = data;
                    }
                    break;

                case JNC:
                    if (!cf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JG:
                    if (!cf && !zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JGE:
                    if (!cf || zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JL:
                    if (cf && !zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                case JLE:
                    if (cf || zf) {
                        data = readSrc(ix.opDest, ix.dest, ix.value);
                        eip += data;
                    }
                    break;

                default:
                    System.err.println("Unknown instruction at " + (eip - 1));
                    throw new IllegalArgumentException();
            } //switch
        } // while
        System.err.println("outside of program area at " + (eip - 1));
        throw new IllegalArgumentException();
    }

    private void invokeRuntime(int func) {
        int stack = 0;
        int args = 0;

        func -= 10000;
        if (func < 0 || func >= runtime.length) {
            System.err.println("invalid runtime call " + func + " at " + (eip - 1));
            throw new IllegalArgumentException();
        }

        switch (runtime[func]) {
            case output:
                System.out.println("Vx86: $output called");
                args = 1;
                break;
            default:
                System.err.println("invalid runtime call " + func + " at " + (eip - 1));
                throw new IllegalArgumentException();
        }

        // proper return, clearing stack
        stack = readRegister(Reg.ESP);
        if (stack == memory.length) {
            return;
        }
        eip = readSrc(Mode.INDIRECT, Reg.ESP, 0);
        stack += 4 + args * 4;
        writeRegister(Reg.ESP, stack);
    }
}
