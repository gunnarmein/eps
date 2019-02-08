/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import java.util.Random;
import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gmein
 */
public class Car extends Rectangle {

    double velocity;
    Point3D position;
    int length;
    static Random random = new Random();
    public Event event;

    Car(Point3D origin, int length) {
        super(length, length);
        super.setFill(Color.rgb(random.nextInt(128) + 128, random.nextInt(128) + 128, random.nextInt(128) + 128));
        this.length = length;
        velocity = 0;
        position = origin;
        setTranslate();

    }

    final void setTranslate() {
        this.setTranslateX(this.position.getX() - length / 2);
        this.setTranslateY(this.position.getY() - length / 2);
        this.setTranslateZ(this.position.getZ());
    }
}
