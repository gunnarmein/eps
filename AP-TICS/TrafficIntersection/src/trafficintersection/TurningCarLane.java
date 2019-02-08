/*
 * The MIT License
 *
 * Copyright 2019 gmein.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package trafficintersection;

import java.util.Iterator;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import static trafficintersection.TrafficIntersection.random;

/**
 *
 * @author gmein
 */
public class TurningCarLane extends CarLane {

    Point3D min;
    Point3D knee;
    Point3D max;

    Group group;
    Point3D direction1;
    Point3D direction2;
    TrafficLight light;
    Point3D lightPosition;

    TurningCarLane(String name, Point3D min, Point3D knee, Point3D max, int delta1, int delta2, TrafficLight light) {
        super(name);
        this.direction1 = knee.subtract(min).normalize();
        Point3D offset = this.direction1.crossProduct(0, 0, delta1);
        this.min = min.add(offset);
        this.knee = knee.add(offset);

        this.direction2 = max.subtract(knee).normalize();
        offset = this.direction2.crossProduct(0, 0, delta2);
        this.knee = this.knee.add(offset);
        this.max = max.add(offset);

        this.light = light;
        this.lightPosition = new Point3D(light.getTranslateX(), light.getTranslateY(), light.getTranslateZ());

        this.group = new Group();

        Line line = new Line(this.min.getX(), this.min.getY(), this.knee.getX(), this.knee.getY());
        line.setFill(Color.BLUE);
        line.setStroke(Color.BLUE);

        Line line2 = new Line(this.knee.getX(), this.knee.getY(), this.max.getX(), this.max.getY());
        line2.setFill(Color.BLUE);
        line2.setStroke(Color.BLUE);

        group.getChildren().addAll(line, line2);
    }

    @Override
    Event updateAll() {
        Event firstEvent = null;

        if (isEmpty()) {
            return null;
        }

        Iterator<Car> iter = this.iterator();
        Car prev = null;
        Car car;
        while (iter.hasNext()) {
            Point3D direction;
            car = iter.next();

            // detect at traffic light and stop if red
            if (detected(car)) {
                if (car.event == null) {
                    car.event = new Event(this.name, System.currentTimeMillis());
                }
                if (prev == null) {
                    firstEvent = car.event;
                }
                if (redLight()) {
                    prev = car;
                    continue;
                }
                if (yellowLight()) {
                    int r = random.nextInt(1000);
                    if (r < 333) {
                        car.velocity /= 3;
                    } else {
                        car.velocity *= 2;
                    }
                }
            }

            // detect in which segment car is
            if (car.position.subtract(min).dotProduct(direction1) / knee.distance(min) < 1.0) {
                direction = direction1;
            } else {
                direction = direction2;
            }

            // accelerate if car in front is far enough away, or no car in front
            if (prev == null || car.position.distance(prev.position) > 20) {
                car.position = car.position.add(direction.multiply(car.velocity));
                car.velocity += 0.1;
                car.velocity = Math.max(car.velocity, 5);
            } else {
                car.velocity = 0;
            }

            // adjust segment position if necessary
            if (car.position.subtract(min).dotProduct(direction1) / knee.distance(min) >= 1.0 && (direction == direction1)) {
                car.position = knee;
            }

            // remove cars past max
            if (isPastMax(car)) {
                //System.out.println("car is done");
                iter.remove();
                group.getChildren().remove(car);
                car = null;
            } else {
                car.setTranslate();
            }

            prev = car;
        }
        return firstEvent;
    }

    boolean redLight() {
        return (this.light.getFill() == Color.RED);
    }

    boolean yellowLight() {
        return (this.light.getFill() == Color.YELLOW);
    }

    boolean detected(Car car) {
        Point3D diff = car.position.subtract(lightPosition);
        return (diff.dotProduct(direction1) < 0.0)
                && (car.position.distance(lightPosition) < 40)
                && (this.light.getFill() == Color.RED);
    }

    boolean isPastMax(Car car) {
        Point3D progress = max.subtract(car.position);
        return progress.dotProduct(direction2) < 0.0 && car.position.distance(max) < 20;
    }

    @Override
    void addCar() {
        Car car = new Car(min, 10);
        this.add(car);
        group.getChildren().add(car);
    }
}
