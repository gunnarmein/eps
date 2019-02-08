/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;

/**
 *
 * @author gmein
 */
public class Board {

    ArrayList<Piece> whitePieces = new ArrayList<>();
    ArrayList<Piece> blackPieces = new ArrayList<>();

    void setup() {
        Pawn p = new Pawn();
        whitePieces.add(p); // adds p to the end
        whitePieces.add(1, p); // inserts pieces at position 1
        whitePieces.remove(p); // removes piece p no matter where it is
        whitePieces.remove(whitePieces.size()-1); // removes last piece
        
        for (Piece piece:whitePieces) {
        }
        
        for (int i = 0; i < whitePieces.size(); i++) {
            Object object = whitePieces.get(i);
        }
        
    }
}
