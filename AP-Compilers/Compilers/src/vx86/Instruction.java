/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vx86;

import vx86.Vx86.Inx;
import vx86.Vx86.Mode;
import vx86.Vx86.Reg;

/**
 *
 * @author gmein
 */
public class Instruction {

    public Inx name;
    public Mode modeDest;
    public Mode modeSrc;
    public Reg regDest;
    public Reg regSrc;
    public Object value;
    public String comment;

    public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val) {
        this.name = name;
        this.modeSrc = opSrc;
        this.modeDest = opDest;
        this.regSrc = src;
        this.regDest = dest;
        this.value = val;
    }

    public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, Object val) {
        this.name = name;
        this.modeSrc = opSrc;
        this.modeDest = opDest;
        this.regSrc = src;
        this.regDest = dest;
        this.value = val;
    }

    public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val, String comment) {
        this.name = name;
        this.modeSrc = opSrc;
        this.modeDest = opDest;
        this.regSrc = src;
        this.regDest = dest;
        this.value = val;
        this.comment = comment;
    }

    public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, Object val, String comment) {
        this.name = name;
        this.modeSrc = opSrc;
        this.modeDest = opDest;
        this.regSrc = src;
        this.regDest = dest;
        this.value = val;
        this.comment = comment;
    }

    public void dump(Integer line) {
        if (name == Vx86.Inx.NONE) {
            Util.println("; " + Util.ANSI_BLUE + comment + Util.ANSI_RESET);
            line++;
            ;
        } else {
            Util.println(Util.rightJustify("" + line, 4) + ": " + this);
        }
        line++;
        // extra line after ret
        if (name == Vx86.Inx.RET) {
            Util.println("");

        }
    }

    public boolean validate() {
        if ((this.modeDest == Mode.MEMORY && this.modeSrc == Mode.MEMORY)
                || (this.modeDest == Mode.INDIRECT && this.modeSrc == Mode.INDIRECT)
                || (this.modeDest == Mode.INDIRECT && this.modeSrc == Mode.MEMORY)
                || (this.modeDest == Mode.MEMORY && this.modeSrc == Mode.INDIRECT)
                || (this.modeDest == Mode.NONE)
                || (this.modeDest == Mode.IMMEDIATE)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String strSrc = opToString(modeSrc, regSrc, value);
        String strDest = opToString(modeDest, regDest, value);

        String strOp = "";
        if (strSrc != null && strDest != null) {
            strOp = strDest + "," + strSrc;
        } else if (strDest != null) {
            strOp = strDest;
        } else if (strSrc != null) {
            strOp = strSrc;
        }

        return Util.leftJustify(name.toString(), 5)
                + Util.leftJustify(strOp, 20)
                + ((comment == null) ? "" : "; " + comment);
    }

    private String opToString(Mode opMode, Reg reg, Object val) {
        switch (opMode) {
            case REGISTER:
                return reg.toString();
            case IMMEDIATE:
                return val.toString();
            case MEMORY:
                return "[" + val + "]";
            case INDIRECT:
                int v = (Integer) val;
                return "[" + reg.toString() + (v != 0 ? (v < 0 ? "" : "+") + val.toString() : "") + "]";
            default:
        }
        return null;
    }

    // invoked on pattern instruction
    public boolean matches(Instruction that) {
        if ((this.name == that.name || this.name == Inx.ANY || this.name == Inx.THIS || this.name == Inx.THAT)
                && (this.modeDest == that.modeDest || this.modeDest == Mode.ANY || this.modeDest == Mode.THIS || this.modeDest == Mode.THAT)
                && (this.modeSrc == that.modeSrc || this.modeSrc == Mode.ANY || this.modeSrc == Mode.THIS || this.modeSrc == Mode.THAT)
                && (this.regDest == that.regDest || this.regDest == Reg.ANY || this.regDest == Reg.THIS || this.regDest == Reg.THAT)
                && (this.regSrc == that.regSrc || this.regSrc == Reg.ANY || this.regSrc == Reg.THIS || this.regSrc == Reg.THAT)
                && (this.value.equals(that.value) || this.value.equals("ANY") || this.value.equals("THIS") || this.value.equals("THAT"))) {
            return true;
        }
        return false;

    }

    //invoked on pattern instruction
    public Object extractThis(Instruction x) {
        if (this.name == Inx.THIS) {
            return x.name;
        }
        if (this.modeDest == Mode.THIS) {
            return new Operand(x.modeDest, x.regDest, (Integer) x.value);
        }
        if (this.modeSrc == Mode.THIS) {
            return new Operand(x.modeSrc, x.regSrc, (Integer) x.value);
        }
        if (this.regSrc == Reg.THIS) {
            return new Operand(x.modeSrc, x.regSrc, (Integer) x.value);
        }
        if (this.regDest == Reg.THIS) {
            if (x.regDest == Reg.EAX) {
                x = x;
            }
            return new Operand(x.modeDest, x.regDest, (Integer) x.value);
        }
        if (this.value.equals("THIS")) {
            return new Operand((Integer) x.value);
        }

        return null;
    }

    // invoked on pattern instruction
    public Object extractThat(Instruction x) {
        if (this.name == Inx.THAT) {
            return x.name;
        }
        if (this.modeDest == Mode.THAT) {
            return new Operand(x.modeDest, x.regDest, (Integer) x.value);
        }
        if (this.modeSrc == Mode.THAT) {
            return new Operand(x.modeSrc, x.regSrc, (Integer) x.value);
        }
        if (this.regSrc == Reg.THAT) {
            return new Operand(x.modeSrc, x.regSrc, (Integer) x.value);
        }
        if (this.regDest == Reg.THAT) {
            return new Operand(x.modeDest, x.regDest, (Integer) x.value);
        }
        if (this.value.equals("THAT")) {
            return new Operand((Integer) x.value);
        }

        return null;
    }

    public void fillThisAndThat(Object thisObj, Object thatObj) {
        // this
        if (this.name == Inx.THIS) {
            this.name = (Inx) thisObj;
        }
        if (this.modeDest == Mode.THIS) {
            Operand dest = (Operand) thisObj;
            this.modeDest = dest.mode;
        }
        if (this.modeSrc == Mode.THIS) {
            Operand src = (Operand) thisObj;
            this.modeSrc = src.mode;
        }
        if (this.regSrc == Reg.THIS) {
            Operand src = (Operand) thisObj;
            this.regSrc = src.reg;
        }
        if (this.regDest == Reg.THIS) {
            Operand dest = (Operand) thisObj;
            this.regDest = dest.reg;
        }
        if (this.value.equals("THIS")) {
            Operand v = (Operand) thisObj;
            this.value = v.value;
        }

        // that
        if (this.name == Inx.THAT) {
            this.name = (Inx) thatObj;
        }
        if (this.modeDest == Mode.THAT) {
            Operand dest = (Operand) thatObj;
            this.modeDest = dest.mode;
        }
        if (this.modeSrc == Mode.THAT) {
            Operand src = (Operand) thatObj;
            this.modeSrc = src.mode;
        }
        if (this.regSrc == Reg.THAT) {
            Operand src = (Operand) thatObj;
            this.regSrc = src.reg;
        }
        if (this.regDest == Reg.THAT) {
            Operand dest = (Operand) thatObj;
            this.regDest = dest.reg;
        }
        if (this.value.equals("THAT")) {
            Operand v = (Operand) thatObj;
            this.value = v.value;
        }
    }
}
