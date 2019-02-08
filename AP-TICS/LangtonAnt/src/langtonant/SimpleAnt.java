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
public class SimpleAnt implements Ant {

    int[] direction = {-1, 0};
    int[][] left = {{0, -1}, {1, 0}};
    int[][] right = {{0, 1}, {-1, 0}};

    @Override
    public void init(String kind) {
    }

    @Override
    public Action next(int currentSymbol) {

        direction = turn(direction, currentSymbol == 0 ? right : left);
        //System.out.println("direction "+direction[0]+", "+direction[1]);
        return new Action(1 - currentSymbol, direction[0], direction[1]);
    }

    int[] turn(int[] v, int[][] m) {
        return new int[]{v[0] * m[0][0] + v[1] * m[0][1], v[0] * m[1][0] + v[1] * m[1][1]};
    }

}
