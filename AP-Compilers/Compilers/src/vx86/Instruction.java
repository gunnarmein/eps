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
public  class Instruction {

        Inx name;
        Mode opDest;
        Mode opSrc;
        Reg dest;
        Reg src;
        int value;
        String comment;

        public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val) {
            this.name = name;
            this.opSrc = opSrc;
            this.opDest = opDest;
            this.src = src;
            this.dest = dest;
            this.value = val;
        }

        public Instruction(Inx name, Mode opDest, Reg dest, Mode opSrc, Reg src, int val, String comment) {
            this.name = name;
            this.opSrc = opSrc;
            this.opDest = opDest;
            this.src = src;
            this.dest = dest;
            this.value = val;
            this.comment = comment;
        }

        public boolean validate() {
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

            return Util.leftJustify(name.toString(), 5)
                    + Util.leftJustify(strOp, 20)
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