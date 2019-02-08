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
public class StraightCarLane extends CarLane {

    Point3D min;
    Point3D max;
    Group group;
    Point3D direction;
    TrafficLight light;
    Point3D lightPosition;
    Runnable carDetected;

    StraightCarLane(String name, Point3D min, Point3D max, int delta, TrafficLight light) {
        super(name);
        this.direction = max.subtract(min).normalize();
        Point3D offset = this.direction.crossProduct(0, 0, delta);
        this.min = min.add(offset);
        this.max = max.add(offset);
        this.light = light;
        this.lightPosition = new Point3D(light.getTranslateX(), light.getTranslateY(), light.getTranslateZ());

        this.group = new Group();

        Line line = new Line(this.min.getX(), this.min.getY(), this.max.getX(), this.max.getY());
        line.setFill(Color.BLUE);
        line.setStroke(Color.BLUE);

        group.getChildren().add(line);
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

            } else {
                car.event = null;
            }

            // accelerate if car in front is far enough away, or no car in front
            if (prev == null || car.position.distance(prev.position) > 20) {
                car.position = car.position.add(direction.multiply(car.velocity));
                car.velocity += 0.1;
                car.velocity = Math.max(car.velocity, 5);
            } else {
                car.velocity = 0;
            }

            // remove cars past max
            if (isPastMax(car)) {
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
        return (diff.dotProduct(direction) < 0.0)
                && (car.position.distance(lightPosition) < 40)
                && (this.light.getFill() == Color.RED);
    }

    boolean isPastMax(Car car) {
        Point3D progress = max.subtract(car.position);
        return progress.dotProduct(direction) < 0.0;
    }

    @Override
    void addCar() {
        Car car = new Car(min, 10);
        this.add(car);
        group.getChildren().add(car);
    }
}
