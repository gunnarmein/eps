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
        
        Program program = Examples.example_factorial();
        program.resolveLabels();
        program.dump();
        
        Vx86 vm = new Vx86();
        vm.setup(program);
        vm.run();
        
        //Compiler.compile (BaseParser.class.getResourceAsStream("example1.lol"));
    }

}
