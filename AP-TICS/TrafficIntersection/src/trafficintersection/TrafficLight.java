/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author gmein
 */
public class TrafficLight extends Circle {
    String name;
    
    TrafficLight(String name, double radius, Point3D lightPos) {
        super(radius);
        this.name = name;
        setFill(Color.RED);
        setTranslateX(lightPos.getX());
        setTranslateY(lightPos.getY());
        setTranslateZ(lightPos.getZ());
    }
}
