/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

/**
 *
 * @author gunnar
 */
public class Main {
    public static void main(String[] args) {
        String program = "Siri, I hate you Siri, remind me in 5 seconds Siri, I hate you";
        
        Parser p = new Parser();
        Node tree = p.parse(program);
        tree.dump();
    }
    
}
