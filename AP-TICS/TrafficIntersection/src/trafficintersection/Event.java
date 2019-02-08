/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

/**
 *
 * @author gmein
 */
public class Event {
    String name;
    long time;
    
    Event (String name, long time) {
        this.name = name;
        this.time = time;
    }
}
