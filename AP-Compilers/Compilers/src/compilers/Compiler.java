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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import vx86.Program;
import vx86.Util;
import vx86.Vx86;

/**
 *
 * @author gmein
 */
public class Compiler {

    static Program compile(InputStream is) throws IOException {
        CharStream cs = CharStreams.fromStream(is);
        LOLcodeLexer lexer = new LOLcodeLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LOLcodeParser parser = new LOLcodeParser(tokens);

        LOLcodeParser.ProgramContext tree = Parser.parse(lexer, parser, tokens);
        if (tree == null) {
            return null;
        }
        Util.println("Parsing successful.");

        // dump parse tree
//        Dumper dumper = new Dumper();
//        ParseTreeWalker.DEFAULT.walk(dumper, tree);
//        System.out.println("\n\n");
        // decorate tree
        StaticAnalyzer checker = new StaticAnalyzer();
        ParseTreeWalker.DEFAULT.walk(checker, tree);
        Util.println("Static analysis successful.");

        // now create a code generator, passing on decorations from checker phase
        CodeGenerator cgen = new CodeGenerator(checker.decs);
        ParseTreeWalker.DEFAULT.walk(cgen, tree);
        Program p = cgen.p;
        if (p == null) {
            return null;
        }
        Util.println("Code generation successful.");

        p.resolveLabels();
        return p;

    }

}
