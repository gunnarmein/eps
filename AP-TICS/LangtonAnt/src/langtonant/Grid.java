/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langtonant;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author gmein
 */
public class Grid extends GridPane {

    int[][] cells;
    Rectangle[][] rects;
    int rows, cols;
    int max;
    String[] colors = new String[]{"black", "white", "red", "yellow", "blue", "orange", "green", "pink", "brown", "purple", "lightblue", "gold"};

    Grid(int rows, int cols, int size, int symbols) {
        this.rows = rows;
        this.cols = cols;
        cells = new int[rows][cols];
        max = Math.max(symbols, colors.length);
        rects = new Rectangle[rows][cols];

        super.setVgap(0);
        super.setHgap(0);

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                Rectangle r = new Rectangle(3, 3);
                r.setFill(Color.web(colors[0]));
                rects[y][x] = r;
                super.add(r, x, y);
            }
        }
    }

    void clear() {
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                rects[y][x].setFill(Color.web(colors[0]));
                cells[y][x] = 0;
            }
        }
    }

    void set(int row, int col, int value) {
        if (col < 0 || col >= cols || row < 0 || row >= rows) {
            return;
        }
        value = value % max;
        cells[row][col] = value;
        rects[row][col].setFill(Color.web(colors[value]));
    }

    int get(int row, int col) {
        if (col < 0 || col >= cols || row < 0 || row >= rows) {
            return 0;
        }
        return cells[row][col];
    }

}
