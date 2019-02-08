/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langtonant;

import java.util.Random;

/**
 *
 * @author gmein
 */
public class RandomAnt implements Ant {
    
    static Random random = new Random();
    int syms;

    @Override
    public void init(String kind) {
        syms = kind != null?kind.length():2;
    }

    @Override
    public Action next(int currentSymbol) {
        return new Action (random.nextInt(syms), random.nextInt(3)-1, random.nextInt(3)-1);
    }

 
    
}
