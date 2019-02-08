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
public class Action {
    int newSymbol;
    int deltaRow; 
    int deltaCol;
    
    Action(int s, int r, int c) {
        newSymbol = s;
        deltaRow = r;
        deltaCol = c;
    }
}
