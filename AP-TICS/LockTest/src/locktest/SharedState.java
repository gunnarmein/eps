/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locktest;

/**
 *
 * @author gmein
 */
public class SharedState {

    volatile long l1 = 0;
    volatile long l2 = 0;

    void doWork(int n) {
        for (int i = 0; i < n; i++) {
            l1 += 1;
        }
        for (int i = 0; i < n; i++) {
            l2 -= 1;
        }
    }

    boolean isValid() {
        return l1 + l2 == 0;
    }
}
