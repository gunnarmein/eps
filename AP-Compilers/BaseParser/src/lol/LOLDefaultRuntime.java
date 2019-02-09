/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lol;

import vx86.Runtime;
import vx86.Util;
import vx86.Vx86;
import static vx86.Vx86.RUNTIME_BASE;

/**
 *
 * @author gmein
 */
public class LOLDefaultRuntime implements Runtime {

    @Override
    public boolean isRuntimeRoutine(int addr) {
        return addr >= RUNTIME_BASE;
    }

    public static enum RuntimeEntry {
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

        private RuntimeEntry(int v) {
            addr = v;
        }

        public int getAddress() {
            return RUNTIME_BASE + addr;
        }
    };

    private final RuntimeEntry[] routines = RuntimeEntry.values();

    @Override
    public int getRuntimeAddres(String routine) {
        return RuntimeEntry.valueOf(routine).getAddress();
    }

    private int argument(int n) {
        return n * 4;
    }

    @Override
    public void invokeRoutine(Vx86 vm, int addr) {
        int stack = 0;
        int args = 0;

        addr -= RUNTIME_BASE;
        if (addr < 0 || addr >= routines.length) {
            System.err.println("invalid runtime call " + addr + " at " + (vm.eip - 1));
            throw new IllegalArgumentException();
        }

        switch (routines[addr]) {
            case output:
                Util.println("");
                Util.print(Util.ANSI_GREEN + "Vx86 output :");
                int id = vm.peekStackVar(argument(1));
                String s = vm.strings.getString(id);
                if (s == null) {
                    System.err.println("Unknown string id " + id);
                    throw new IllegalArgumentException();
                }
                System.out.println(Util.ANSI_BLUE + s + Util.ANSI_RESET);
                args = 1;
                break;
            case intToString:
                Util.println("");
                Util.println(Util.ANSI_GREEN + "Vx86: $intToString called" + Util.ANSI_RESET);
                int sid = vm.strings.newStringId(Integer.toString(vm.peekStackVar(argument(1))));
                vm.writeRegister(Vx86.Reg.EAX, sid);
                args = 1;
                break;
            default:
                System.err.println("invalid runtime call " + addr + "[" + routines[addr] + "] at " + (vm.eip - 1));
                throw new IllegalArgumentException();
        }

        // proper return, clearing stack
        stack = vm.readRegister(Vx86.Reg.ESP);
        if (stack == vm.memory.length) {
            return;
        }
        vm.eip = vm.readSrc(Vx86.Mode.INDIRECT, Vx86.Reg.ESP, 0);
        stack += 4 + args * 4;
        vm.writeRegister(Vx86.Reg.ESP, stack);
    }

}
