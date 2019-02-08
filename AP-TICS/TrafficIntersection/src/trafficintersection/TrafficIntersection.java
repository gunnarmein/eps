/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficintersection;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gmein
 */
public class TrafficIntersection extends Application {

    static Random random = new Random();
    static Thread tick;
    StateMachine sm;
    int maxX = 1000;
    int maxY = 800;
    int halfX = 500;
    int halfY = 400;
    int trafficLightRadius = 5;
    int laneWidth = 8;
    int spawnPercent = 1;

    long timer;

    TrafficLight nsLight;
    TrafficLight ewLight;
    TrafficLight snLight;
    TrafficLight weLight;

    TrafficLight neLight;
    TrafficLight esLight;
    TrafficLight swLight;
    TrafficLight wnLight;

    TrafficLight nwLight;
    TrafficLight enLight;
    TrafficLight seLight;
    TrafficLight wsLight;

    StraightCarLane ns;
    StraightCarLane ew;
    TurningCarLane ne;
    TurningCarLane nw;
    TurningCarLane en;
    TurningCarLane es;

    StraightCarLane sn;
    StraightCarLane we;
    TurningCarLane se;
    TurningCarLane sw;
    TurningCarLane wn;
    TurningCarLane ws;

    CarLane[] lanes;
    TrafficLight[] lights;

    Text currentState;

    @Override
    public void start(Stage primaryStage) {

        Point3D e = new Point3D(maxX, halfY, 0);
        Point3D w = new Point3D(0, halfY, 0);
        Point3D n = new Point3D(halfX, 0, 0);
        Point3D s = new Point3D(halfX, maxY, 0);
        Point3D center = new Point3D(halfX, halfY, 0);
        Point3D de = e.subtract(center).normalize();
        Point3D dw = w.subtract(center).normalize();
        Point3D dn = n.subtract(center).normalize();
        Point3D ds = s.subtract(center).normalize();
        
        int outputLaneOffset = -laneWidth;
        int leftLaneOffset = -2*laneWidth;
        int straightLaneOffset = -3*laneWidth;

        nsLight = new TrafficLight("ns", trafficLightRadius, center.add(dw.multiply(2 * laneWidth)).add(dn.multiply(30)));
        ewLight = new TrafficLight("ew", trafficLightRadius, center.add(dn.multiply(2 * laneWidth)).add(de.multiply(30)));
        snLight = new TrafficLight("sn", trafficLightRadius, center.add(de.multiply(2 * laneWidth)).add(ds.multiply(30)));
        weLight = new TrafficLight("we", trafficLightRadius, center.add(ds.multiply(2 * laneWidth)).add(dw.multiply(30)));

        neLight = new TrafficLight("ne", trafficLightRadius, center.add(dw.multiply(laneWidth)).add(dn.multiply(30)));
        esLight = new TrafficLight("es", trafficLightRadius, center.add(dn.multiply(laneWidth)).add(de.multiply(30)));
        swLight = new TrafficLight("sw", trafficLightRadius, center.add(de.multiply(laneWidth)).add(ds.multiply(30)));
        wnLight = new TrafficLight("wn", trafficLightRadius, center.add(ds.multiply(laneWidth)).add(dw.multiply(30)));

        nwLight = new TrafficLight("nw", trafficLightRadius, center.add(dw.multiply(3 * laneWidth)).add(dn.multiply(30)));
        enLight = new TrafficLight("en", trafficLightRadius, center.add(dn.multiply(3 * laneWidth)).add(de.multiply(30)));
        seLight = new TrafficLight("se", trafficLightRadius, center.add(de.multiply(3 * laneWidth)).add(ds.multiply(30)));
        wsLight = new TrafficLight("ws", trafficLightRadius, center.add(ds.multiply(3 * laneWidth)).add(dw.multiply(30)));

        lights = new TrafficLight[]{nsLight, neLight, nwLight, ewLight, enLight, esLight, snLight, seLight, swLight, weLight, wnLight, wsLight};

        ns = new StraightCarLane("ns", n, s, -2 * laneWidth, nsLight);
        ne = new TurningCarLane("ne", n, center, e, -laneWidth, -2 * laneWidth, neLight);
        nw = new TurningCarLane("nw", n, center, w, -3 * laneWidth, -2 * laneWidth, nwLight);

        ew = new StraightCarLane("ew", e, w, -2 * laneWidth, ewLight);
        en = new TurningCarLane("en", e, center, n, -3 * laneWidth, -2 * laneWidth, enLight);
        es = new TurningCarLane("es", e, center, s, -laneWidth, -2 * laneWidth, esLight);

        we = new StraightCarLane("we", w, e, - 2 * laneWidth, weLight);
        ws = new TurningCarLane("ws", w, center, s, -3 * laneWidth, -2 * laneWidth, wsLight);
        wn = new TurningCarLane("wn", w, center, n, -laneWidth, -2 * laneWidth, wnLight);

        sn = new StraightCarLane("sn", s, n, -2 * laneWidth, snLight);
        se = new TurningCarLane("se", s, center, e, -3 * laneWidth, - 2 * laneWidth, seLight);
        sw = new TurningCarLane("sw", s, center, w, -laneWidth, -2 * laneWidth, swLight);

        lanes = new CarLane[]{ns, ne, nw, ew, en, es, sn, se, sw, we, ws, wn};

        Slider slider = new Slider();
        slider.setMin(1);
        slider.setMax(60);
        slider.setValue(spawnPercent);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setBlockIncrement(10);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            spawnPercent = (int) (double) newValue;
        });

        currentState = new Text("Current state: <none>");
        currentState.setTranslateX(5);
        currentState.setTranslateY(50);

        Pane root = new Pane();
        root.getChildren().addAll(ns.group, ne.group, nw.group,
                ew.group, en.group, es.group,
                sn.group, sw.group, se.group,
                we.group, wn.group, ws.group,
                nsLight, ewLight, snLight, weLight,
                neLight, esLight, swLight, wnLight,
                nwLight, enLight, seLight, wsLight,
                slider, currentState);

        Scene scene = new Scene(root, maxX, maxY);

        primaryStage.setTitle("Traffic Intersection");
        primaryStage.setScene(scene);
        primaryStage.show();

        //
        this.startStateMachine();
        this.createTickThread();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        launch(args);
        tick.interrupt();
        tick.join();
    }

    void createTickThread() {
        tick = new Thread(() -> {
            try {
                while (true) {
                    Platform.runLater(() -> tickFunction());
                    Thread.sleep(50);
                }
            } catch (InterruptedException ex) {
            }
        });
        tick.start();
    }

    void tickFunction() {
        long time = System.currentTimeMillis();

        // spawn new cars
        for (CarLane lane : lanes) {
            if (random.nextInt(3000) < spawnPercent) {
                //System.out.println("adding car ns");
                lane.addCar();
            }
        }

        ArrayList<Event> events = new ArrayList<>();

        // update all lanes, gather "car detected" events
        for (CarLane lane : lanes) {
            Event e = lane.updateAll();
            if (e != null) {
                events.add(e);
            }
        }

        // process all events through state machine
        events.sort((a, b) -> ((int) (a.time - b.time)));
        for (Event event : events) {
            //System.out.println("firing " + event);
            processEvent(event.name);
        }

        // if there is a current timer event ticking
        // and it's about time
        if (timer != 0 && time > timer) {
            timer = 0;
            //System.out.println("firing timer at " + time);
            processEvent("timer");

        }

        // update display
        currentState.setText("Current state: " + sm.getCurrentState().name + " (" + sm.getCurrentState().id + ")");
    }

    void processEvent(String event) {
        String action = sm.process(event);
        // change lights
        setLightColors(sm.getCurrentState().state);

        if (action == null) {
            return;
        }
        // set any timers
        int newTimer = Integer.parseInt(action);
        if (newTimer != 0) {
            if (timer == -1) {
                cancelTimer();
            } else {
                scheduleTimerEvent(newTimer);
            }
        }
    }

    void startStateMachine() {
        InputStream is = TrafficIntersection.class.getResourceAsStream("resources/statetransitiontable.csv");
        if (is == null) {
            System.out.println("resource csv not found");
            System.exit(-1);
        }
        sm = new StateMachine();
        sm.init(is, 0);
        System.out.println("state machine started");
        processEvent("start"); // get current state and initializes lights, sets initial timer
        System.out.println("lights initialized");
    }

    void scheduleTimerEvent(int seconds) {
        long timerOrigin = System.currentTimeMillis();
        timer = timerOrigin + (1000 * seconds);
        //System.out.println("scheduling timer event for " + timer);
    }

    void cancelTimer() {
        timer = 0;
    }

    void setLightColors(String colors) {
        for (TrafficLight light : lights) {
            try {
                int pos = colors.indexOf(light.name + ":");
                if (pos != -1) {
                    String color;
                    light.setFill(Color.web(colors.substring(pos + 3, colors.indexOf(";", pos + 3))));
                } else {
                    light.setFill(Color.RED);

                }
            } catch (Exception e) {
            }
        }
    }

}
