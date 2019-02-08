/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilstarcatalog;

/**
 *
 * @author gmein
 */
public class StarPositioner {

    double[][] catalog;
  
    public StarPositioner(double[][] catalog) {
        // Analyze and store the catalog here
        this.catalog = catalog;
    }

    // Returns an array containing doubles [x, y, z, theta, phi]
    public double[] getPosition(double[][] observations) {
        // calculate center of mass
        // sort by distance from it
        // separate outer hull - maybe 1% of stars
        // put into k-d tree by angles to origin
        // for every star in hull
        //   identify closest two hull stars by angle from cm
        //   assign compound measure to star: elbow angle * ratio of arms ?
        // for every star in observations
        //   
        return new double[]{0, 0, 0, 0, 0};
    }
}
