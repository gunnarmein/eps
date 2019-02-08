/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locations;

/**
 *
 * @author gmein
 */
public class Lake extends Location{
    String name;
    int length;
    int temperature;
    
    Lake(String name) {
        this.name = name;
    }
    
    Lake (String name, int length, int temperature) {
        this.name = name;
        this.length = length;
        this.temperature = temperature;
    }
    
    Lake (Double sqMiles) {
        this.name = "<Some unknown lake of "+sqMiles+" square miles>";
    }
    
//    @Override
//    public String toString() {
//        return "I am a lake by the name of "+name;
//    }
}
