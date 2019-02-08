/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langtonant;

import java.util.HashMap;
import java.util.Random;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author gmein
 */
public class LangtonAnt extends Application {

    HashMap<String, Integer> h = new HashMap<>();
    static Random random = new Random();
    int rows = 150;
    int cols = 350;
    int symbols = 5;
    int size = 3;
    Thread t;
    volatile boolean running = false;
    Button resetBtn;
    Button startBtn;
    Button stopBtn;
    Button stepBtn;
    TextField pattern;

    Grid grid;
    int row;
    int col;
    Ant ant;

    @Override
    public void start(Stage primaryStage) {

        row = rows / 2;
        col = cols / 2;

        grid = new Grid(rows, cols, size, symbols);

        // change this to your ant class
        ant = new ColorAnt();
        ant.init(null);

        Label label1 = new Label("Pattern: ");
        pattern = new TextField("RL");

        resetBtn = new Button();
        resetBtn.setText("Create");
        resetBtn.setOnAction((ActionEvent event) -> {
            grid.clear();
            row = rows / 2;
            col = cols / 2;
            ant = new ColorAnt();
            ant.init(pattern.getText());
        });

        startBtn = new Button();
        startBtn.setText("Start");
        startBtn.setOnAction((ActionEvent event) -> {
            startChain();
        });

        stopBtn = new Button();
        stopBtn.setText("Stop");
        stopBtn.setOnAction((ActionEvent event) -> {
            stopChain();
        });

        stepBtn = new Button();
        stepBtn.setText("Step");
        stepBtn.setOnAction((ActionEvent event) -> {
            step();
        });

        HBox buttons = new HBox();
        VBox all = new VBox();

        buttons.getChildren().addAll(label1, pattern, resetBtn, startBtn, stopBtn, stepBtn);
        all.getChildren().addAll(grid, buttons);

        Pane root = new Pane();
        root.getChildren().add(all);

        Scene scene = new Scene(root, cols * (size), rows * (size) + 25);

        primaryStage.setOnCloseRequest((e) -> System.exit(0));

        primaryStage.setTitle("Langton's Ant");
        primaryStage.setScene(scene);
        primaryStage.show();

        //startChain();
    }

    void startThread() {
        stopThread();
        startBtn.setDisable(true);
        stepBtn.setDisable(true);

        t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                Platform.runLater(() -> step());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        });
        t.start();
        stopBtn.setDisable(false);

    }

    void stopThread() {
        stopBtn.setDisable(true);
        if (t != null) {
            try {
                t.interrupt();
                t.join();
            } catch (InterruptedException ex) {
            }
        }
        t = null;
        startBtn.setDisable(false);
        stepBtn.setDisable(false);
    }

    void startChain() {
        running = true;
        stopBtn.setDisable(false);
        startBtn.setDisable(true);
        stepBtn.setDisable(true);
        chain();
    }

    void stopChain() {
        running = false;
        stopBtn.setDisable(true);
        startBtn.setDisable(false);
        stepBtn.setDisable(false);
    }

    void chain() {
        if (running) {
            step();
            Platform.runLater(() -> chain());
        }
    }

    void step() {
        Action a = ant.next(grid.get(row, col));

        //System.out.println("step: " + row + ", " + col + ": " + a.newSymbol);
        grid.set(row, col, a.newSymbol);
        row += a.deltaRow;
        col += a.deltaCol;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    }
}
