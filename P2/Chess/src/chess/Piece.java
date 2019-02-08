/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author gmein
 */
abstract public class Piece {
    int row;
    int col;
    Color color;
    
    abstract boolean canMoveTo(int row, int col);
    abstract boolean canStrikeAt(int row, int col);
    
    public enum Color {
        white,
        black
    }
}
