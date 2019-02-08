/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakevilpieces;

import java.util.List;

import java.util.*;
import java.util.stream.*;

// approach:
// for each piece
// if wall, follow clockwise, build shape
// register in hash map
public class BreakEvilPieces {

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static List<String> solve(String shape) {
        // Your code here!!
        return null;
    }

    static class Field {

        int row;
        int col;
        Grid grid;

        boolean vertical;
        boolean horizontal;

        Field(Grid g, int row, int col, char kind) {
            this.row = row;
            this.col = col;
            this.grid = g;

            switch (kind) {
                case '-':
                    horizontal = true;
                    break;
                case '|':
                    vertical = true;
                    break;
                case '+':
                    horizontal = true;
                    vertical = true;
                    break;
                default:
                    break;
            }
        }
        
        
        ArrayList<Field> clockwiseNeighbor() {
            
        }
    }

    static class Grid {

        Field[][] f;

        Grid(String shape) {
            String[] rows = shape.split("\n");
            f = new Field[rows.length][rows[0].length()];
            for (int row = 0; row < rows.length; row++) {
                for (int col = 0; col < rows[0].length(); col++) {
                    f[row][col] = new Field(this, row, col, rows[row].charAt(col));
                }
            }
        }
        
        boolean isValid(int row, int col) {
            return (row >= 0 && row < f.length && col >=0 && col < f[0].length)
        }

    }

    static class BreakEvilPiecesTest {

        /**
         * DATA formating: Object[][] of Object[] { name of the test (as
         * String), shape (as String), expected list (as List<String>) }
         */
        private static Object[][] DATA = new Object[][]{
            // Test 1
            new Object[]{"Simple shape",
                "+----------+\n|          |\n|          |\n|          |\n+----------+\n|          |\n|          |\n+----------+",
                Arrays.asList("+----------+\n|          |\n|          |\n+----------+", "+----------+\n|          |\n|          |\n|          |\n+----------+"),
                ""},
            // Test 2
            new Object[]{"",
                "              \n +----------+ \n |          | \n |          | \n |          | \n +----------+ \n |          | \n |          | \n +----------+ \n              ",
                Arrays.asList("+----------+\n|          |\n|          |\n+----------+", "+----------+\n|          |\n|          |\n|          |\n+----------+"),
                ""},
            // Test 3
            new Object[]{"3 boxes",
                "+------------+\n|            |\n|            |\n|            |\n+------+-----+\n|      |     |\n|      |     |\n+------+-----+",
                Arrays.asList("+-----+\n|     |\n|     |\n+-----+", "+------+\n|      |\n|      |\n+------+", "+------------+\n|            |\n|            |\n|            |\n+------------+"),
                ""},
            // Test 4
            new Object[]{"",
                "                \n +------------+ \n |            | \n |            | \n |            | \n +------+-----+ \n |      |     | \n |      |     | \n +------+-----+ \n                ",
                Arrays.asList("+-----+\n|     |\n|     |\n+-----+", "+------+\n|      |\n|      |\n+------+", "+------------+\n|            |\n|            |\n|            |\n+------------+"),
                ""},
            // Test 5
            new Object[]{"Lego stuff",
                "+-------------------+--+\n|                   |  |\n|                   |  |\n|  +----------------+  |\n|  |                   |\n|  |                   |\n+--+-------------------+",
                Arrays.asList("                 +--+\n                 |  |\n                 |  |\n+----------------+  |\n|                   |\n|                   |\n+-------------------+", "+-------------------+\n|                   |\n|                   |\n|  +----------------+\n|  |\n|  |\n+--+"),
                ""},
            // Test 6
            new Object[]{"",
                "                          \n +-------------------+--+ \n |                   |  | \n |                   |  | \n |  +----------------+  | \n |  |                   | \n |  |                   | \n +--+-------------------+ \n                          ",
                Arrays.asList("                 +--+\n                 |  |\n                 |  |\n+----------------+  |\n|                   |\n|                   |\n+-------------------+", "+-------------------+\n|                   |\n|                   |\n|  +----------------+\n|  |\n|  |\n+--+"),
                ""},
            // Test 7
            new Object[]{"Piece of cake! (check for irrelevant spaces)",
                "                           \n                           \n           +-+             \n           | |             \n         +-+-+-+           \n         |     |           \n      +--+-----+--+        \n      |           |        \n   +--+-----------+--+     \n   |                 |     \n   +-----------------+     \n                           \n                           ",
                Arrays.asList("+-+\n| |\n+-+", "+-----+\n|     |\n+-----+", "+-----------+\n|           |\n+-----------+", "+-----------------+\n|                 |\n+-----------------+"),
                ""},
            // Test 8
            new Object[]{"",
                "                             \n                             \n                             \n            +-+              \n            | |              \n          +-+-+-+            \n          |     |            \n       +--+-----+--+         \n       |           |         \n    +--+-----------+--+      \n    |                 |      \n    +-----------------+      \n                             \n                             \n                             ",
                Arrays.asList("+-+\n| |\n+-+", "+-----+\n|     |\n+-----+", "+-----------+\n|           |\n+-----------+", "+-----------------+\n|                 |\n+-----------------+"),
                ""},
            // Test 9
            new Object[]{"Horseshoe (shapes are not always rectangles!)",
                "+-----------------+\n|                 |\n|   +-------------+\n|   |\n|   |\n|   |\n|   +-------------+\n|                 |\n+-----------------+",
                Arrays.asList("+-----------------+\n|                 |\n|   +-------------+\n|   |\n|   |\n|   |\n|   +-------------+\n|                 |\n+-----------------+"),
                ""},
            // Test 10
            new Object[]{"",
                "                     \n +-----------------+ \n |                 | \n |   +-------------+ \n |   |               \n |   |               \n |   |               \n |   +-------------+ \n |                 | \n +-----------------+ \n                     ",
                Arrays.asList("+-----------------+\n|                 |\n|   +-------------+\n|   |\n|   |\n|   |\n|   +-------------+\n|                 |\n+-----------------+"),
                ""},
            // Test 11
            new Object[]{"Warming up",
                "+------------+\n|            |\n|            |\n|            |\n+------++----+\n|      ||    |\n|      ||    |\n+------++----+",
                Arrays.asList("++\n||\n||\n++", "+----+\n|    |\n|    |\n+----+", "+------+\n|      |\n|      |\n+------+", "+------------+\n|            |\n|            |\n|            |\n+------------+"),
                ""},
            // Test 12
            new Object[]{"",
                "                \n +------------+ \n |            | \n |            | \n |            | \n +------++----+ \n |      ||    | \n |      ||    | \n +------++----+ \n                ",
                Arrays.asList("++\n||\n||\n++", "+----+\n|    |\n|    |\n+----+", "+------+\n|      |\n|      |\n+------+", "+------------+\n|            |\n|            |\n|            |\n+------------+"),
                ""},
            // Test 13
            new Object[]{"Don't forget the eggs! (you'll understand later...)",
                "++\n++",
                Arrays.asList("++\n++"),
                ""},};

        public void breakEvilPieces_Tests() {

            Object[] exec = new Object[]{"Sample tests", 1, 15};
            String describe = (String) exec[0];
            int start = (int) exec[1] - 1,
                    end = (int) exec[2] - 1;

            printDescribe(describe);

            for (int n = start; n < end; n++) {

                if (Arrays.asList(23).contains(n + 1)) {
                    n++;
                    n--;
                }

                Object[] params = DATA[n];
                String name = (String) params[0],
                        shape = (String) params[1],
                        addMsg = (String) params[3];

                List<String> expected = (List<String>) params[2],
                        actual = BreakEvilPieces.solve(shape);

                if (!name.isEmpty()) {
                    System.out.println("\n\n" + name);
                }
                if (!addMsg.isEmpty()) {
                    System.out.println("\n" + addMsg);
                }
                System.out.println(String.format("Test #" + (n + 1)));

                assertShape(shape, actual, expected);
            }
        }

        private void assertShape(String shape, List<String> actual, List<String> expected) {
            expected.sort(null);
            actual.sort(null);

            if (!actual.equals(expected)) {
                System.out.println(String.format(" \nFAILED TEST !!!\n\nShape:\n%s\n\nExpected:\n%s\n\nBut answer was:\n%s",
                        shape,
                        String.join(" \n\n", expected),
                        String.join(" \n\n", actual)));
                Set<String> tooMuch = new HashSet<String>(actual),
                        lacking = new HashSet<String>(expected);
                tooMuch.removeAll(expected);
                lacking.removeAll(actual);

                if (!lacking.isEmpty()) {
                    System.out.println(String.format(" \n\nSubshapes that your answer is missing:\n%s", strFormat(String.join("\n\n", lacking))));
                }

                if (!tooMuch.isEmpty()) {
                    System.out.println(String.format(" \n\nWrong subshapes that your answer shouldn't create:\n%s", strFormat(String.join("\n\n", tooMuch))));
                }
            }

            //assertEquals(expected, actual); 
        }

        private String strFormat(String s) {
            return s.replaceAll(" ", ".");
        }

        private void printDescribe(String s) {
            System.out.println(String.format(" \n\n*\n* %s\n*", s.toUpperCase()));
        }
    }
}
