/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langtonant;

/**
 *
 * @author gmein
 */
public class ColorAnt implements Ant {

    static int[][] stateTable = new int[][]{
        {-1, 0},
        {0, 1},
        {1, 0},
        {0, -1}
    };

    static String dirs[] = new String[]{
        "up",
        "right",
        "down",
        "left"
    };

    int state;
    String directions;

    @Override
    public void init(String kind) {
        directions = kind;
        if (directions == null || directions.length() == 0){
            directions = "RL";
        }
    }

    @Override
    public Action next(int currentSymbol) {
        char deltaChar = directions.charAt(currentSymbol % directions.length());
        //System.out.println("current dir: " + dirs[state] + ", symbol:" + currentSymbol+", char "+deltaChar);
        int delta = deltaChar == 'R' ? 1 : -1;
        state += delta;
        state = state >= stateTable.length ? 0 : state;
        state = state < 0 ? stateTable.length - 1 : state;
        int symbol = (currentSymbol + 1) % directions.length();
        //System.out.println("changing symbol to:" + symbol + ", new dir: " + dirs[state]);
        return new Action(symbol, stateTable[state][0], stateTable[state][1]);
    }
}
