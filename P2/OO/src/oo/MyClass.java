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
public class MyClass {
   private   String word;
     int number;
     int[] a;
    
    MyClass(String w, int number) {
        this.word = w;
        this.number = number;
        a = new int[5];
    }
    
    void setWord(String word) {
        this.word = word;
    }
    
}
