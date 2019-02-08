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
public class State {
    int id;
    String name;
    String state;
    
    State (String[] line) {
        id = Integer.parseInt(line[1].trim());
        name = line[2].trim();
        state = line[3].trim();
    }
    
}
