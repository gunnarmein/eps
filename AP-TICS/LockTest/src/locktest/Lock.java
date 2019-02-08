/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locktest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author gmein
 */
public class Lock {
    AtomicInteger next = new AtomicInteger(0);
    int current = 0;
    
    void acquire() {
        int ticket = next.getAndIncrement();
        while (ticket != current) {
            try {
                Thread.sleep(5*(ticket-current));
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
    void release() {
        current++;
    }
    
}
