/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gmein
 */
public class BaseParser {

    public static void main(String[] args) throws IOException {
        ArrayList<Vx86.Instruction> program = Vx86Examples.example_factorial();
        Vx86.dump(program);
        
        Vx86 vm = new Vx86();
        vm.setup();
        vm.run(program);
        
        //Compiler.compile (BaseParser.class.getResourceAsStream("example1.lol"));
    }

}
