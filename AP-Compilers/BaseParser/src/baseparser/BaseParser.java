/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

import vx86.Examples;
import vx86.Vx86;
import java.io.IOException;
import vx86.Program;
import vx86.Util;

/**
 *
 * @author gmein
 */
public class BaseParser {

    public static void main(String[] args) throws IOException {

        Util.debugOff();

        Program program1 = Examples.example_increment();
        program1.resolveLabels();
        program1.dump();

        Vx86 vm = new Vx86();
        vm.setup(program1);
        vm.run();

        System.out.println("");
        System.out.println("");

        Program program2 = Examples.example_factorial();
        program2.resolveLabels();
        program2.dump();

        vm.setup(program2);
        vm.run();

        //Compiler.compile (BaseParser.class.getResourceAsStream("example1.lol"));
    }

}
