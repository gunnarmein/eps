/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author gmein
 */
public class Tuple implements Comparable<Tuple>{

    int count;
    String word;

    // constructors make the code look niceer when you use this class
    Tuple(String word, int count) {
        this.count = count;
        this.word = word;
    }
    
    @Override
    public int compareTo(Tuple arg0) {
        // you have to write code that compares "this" to "arg0", and return negative, 0, or positive
        // remember you are supposed to compare to tuples based on their count, not on their words.
        // for those wanting a challenge, implement this so that it sub-sorts by words if the counts are equal.
        return 0;
    }
    
}
