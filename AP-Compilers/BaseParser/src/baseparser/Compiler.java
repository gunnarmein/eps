/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

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
public class Compiler {

    static void compile(InputStream is) throws IOException {
        CharStream cs = CharStreams.fromStream(is);
        LOLcodeLexer lexer = new LOLcodeLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LOLcodeParser parser = new LOLcodeParser(tokens);

        LOLcodeParser.ProgramContext tree = Parser.parse(lexer, parser, tokens);
        if (tree == null) {
            return;
        }

        // dump parse tree
        Dumper dumper = new Dumper();
        ParseTreeWalker.DEFAULT.walk(dumper, tree);
        System.out.println("\n\n");

        // decorate tree
        Checker checker = new Checker();
        ParseTreeWalker.DEFAULT.walk(checker, tree);

    }

}
