/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseparser;

import java.io.IOException;

/**
 *
 * @author gmein
 */
public class BaseParser {

    public static void main(String[] args) throws IOException {
        parseExpr();
    }

    static void parseExpr() throws IOException {
        //expr.MyExprParser.parse(BaseParser.class.getResourceAsStream("example1.xpr"));
        Compiler.compile (BaseParser.class.getResourceAsStream("example1.lol"));
    }

}
