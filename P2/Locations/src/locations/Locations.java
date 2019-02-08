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
public class Locations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Location[] locations = new Location[10];

        locations[0] = new Lake(45.6);
        Object o = new Lake("blah");

        for (int i = 0; i < locations.length; i++) {
            if (locations[i] != null) {
                System.out.println(locations[i]);
            }
        }
    }

}
