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
public class Pawn extends Piece {

    @Override
    boolean canMoveTo(int row, int col) {
        // cannot move sideways or diagonally
        if (this.col != col) {
            return false;
        }

        switch (this.color) {
            case white:
                // cannot move back
                if (row <= this.row) {
                    return false;
                }

                // in starting row, can move up to 2 spots
                if (this.row == 1 && (row - this.row <= 2)) {
                    return true;
                }

                // not in starting row
                if (row - this.row == 1) {
                    return true;
                }
                break;
            case black:
                // cannot move back
                if (row >= this.row) {
                    return false;
                }

                // in starting row, can move up to 2 spots
                if (this.row == 6 && (this.row - row <= 2)) {
                    return true;
                }

                // not in starting row
                if (row - this.row == 1) {
                    return true;
                }
                break;
            default:
                System.out.println("How did this happen?");
                break;
        }
        return false;
    }

    @Override
    boolean canStrikeAt(int row, int col) {
        return false;
    }

}
