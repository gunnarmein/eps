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
public class SimpleAntFSM implements Ant {

    static int[][] stateTable = new int[][]{
        {-1, 0},
        {0, 1},
        {1, 0},
        {0, -1}
    };

    int state;

    @Override
    public void init(String kind) {
    }

    @Override
    public Action next(int currentSymbol) {
        int direction = currentSymbol == 0 ? 1 : -1;
        state += direction;
        state = state>=stateTable.length?0:state;
        state = state < 0? stateTable.length-1:state;
        return new Action(1 - currentSymbol, stateTable[state][0],stateTable[state][1]);
    }
}
