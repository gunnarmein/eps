package baseparser;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * The Virtual x86 Just enough x86 for our subset of LOLCODE
 *
 * @author gmein
 */
public class Vx86 {

    public static List<Instruction> example() {
        LinkedList<Instruction> result = new LinkedList<>();
        
        
        return result;

    }

    public enum Register {
        NONE,
        EAX,
        EBX,
        ECX,
        EDX,
        ESP,
        EBP,
        FLAGS
    }

    public enum OpMode {
        NONE,
        REGISTER,
        IMMEDIATE,
        MEMORY,
        INDIRECT
    }

    public enum InstructionName {
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
        INC,
        DEC,
        FADD,
        FSUB,
        FMUL,
        FDIV,
        JZ,
        JE,
        JC,
        JNC,
        JGE,
        JG,
        JL,
        JLE,
        JMP,
    }

    public String[] runtime = new String[]{
        "$output",
        "$input",
        "$toInteger",
        "$toFloat",
        "$toString"
    };

    public class Instruction {

        InstructionName name;
        OpMode opDest;
        OpMode opSrc;
        Register dest;
        Register src;
        int value;

        Instruction(InstructionName name, OpMode opDest, Register dest, OpMode opSrc, Register src, int val) {
            this.name = name;
            this.opSrc = opSrc;
            this.opDest = opDest;
            this.src = src;
            this.dest = dest;
            this.value = val;
        }

        boolean validate() {
            if ((this.opDest == OpMode.MEMORY && this.opSrc == OpMode.MEMORY)
                    || (this.opDest == OpMode.INDIRECT && this.opSrc == OpMode.INDIRECT)
                    || (this.opDest == OpMode.INDIRECT && this.opSrc == OpMode.MEMORY)
                    || (this.opDest == OpMode.MEMORY && this.opSrc == OpMode.INDIRECT)
                    || (this.opDest == OpMode.NONE)
                    || (this.opDest == OpMode.IMMEDIATE)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            return ""+name+src+dest+value;
        }
        
        private String opToString(OpMode opMode, Register reg, int val) {
            return "";
        }
    }

}
