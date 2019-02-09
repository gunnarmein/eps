/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import java.io.IOException;
import java.io.InputStream;
import lol.LOLcodeLexer;
import lol.LOLcodeParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author gmein
 */
public class Parser {

    public static LOLcodeParser.ProgramContext parse(LOLcodeLexer lexer, LOLcodeParser parser, CommonTokenStream tokens) throws IOException {
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        parser.addErrorListener(errorListener);
        LOLcodeParser.ProgramContext tree = parser.program(); // parse an expression

        if (!errorListener.getSyntaxErrors().isEmpty()) {
            for (SyntaxError e : errorListener.getSyntaxErrors()) {
                System.out.println("Syntax error: Line " + e.getLine() + ": " + e.getMessage());
            }
            return null;
        }

     

        return tree;
    }
}
