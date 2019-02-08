/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

import lol.LOLcodeBaseListener;
import lol.LOLcodeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author gmein
 */
public class Dumper extends LOLcodeBaseListener {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    int level;
    ParseTree parent;


    private String spaces(int level) {
        String s = "                                                                                                             ";
        if (s.length() > 2 * level) {
            return s.substring(0, 2 * level);
        } else {
            return s;
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx.getClass() == LOLcodeParser.SeparatorContext.class) {
            return;
        }
        System.out.println("");
        System.out.print(spaces(level));
        String s = ctx.getClass().getName();
        System.out.print(s.substring(s.indexOf("$") + 1));
        level++;
        parent = ctx;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if (ctx.getClass() == LOLcodeParser.SeparatorContext.class) {
            return;
        }
        level--;
        System.out.println("");
        System.out.print(spaces(level));
        String s = ctx.getClass().getName();
        System.out.print("/" + s.substring(s.indexOf("$") + 1));
        parent = ctx.getParent();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getParent().getClass() == LOLcodeParser.SeparatorContext.class) {
            return;
        }
        if (parent != node.getParent()) {
            System.out.println(spaces(level));
            parent = node.getParent();
        }
        System.out.print(" " + ANSI_BLUE + node.getText() + ANSI_RESET);
    }

}
