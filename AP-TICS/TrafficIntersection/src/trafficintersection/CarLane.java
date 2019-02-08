/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import java.util.LinkedList;

/**
 *
 * @author gmein
 */
abstract public class CarLane extends LinkedList<Car> {

    String name;

    CarLane(String name) {
        this.name = name;
    }

    abstract void addCar();

    abstract Event updateAll();

}
