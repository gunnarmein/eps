package rectanglesunion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RectanglesUnion {

    public static void main(String[] args) {
        int space = calculateSpace(new int[][]{{1, 1, 3, 3}, {2, 2, 4, 4}, {3, 3, 5, 5}, {10, 10, 20, 20}});
        System.out.println("Space: " + space);
        space = calculateSpace(new int[][]{});
        System.out.println("Space: " + space);
    }

    public static int calculateSpace(int[][] rs) {
        // deal with border case
        if (rs.length == 0) {
            return 0;
        }

        System.out.println("inputs: " + rs.length);
        LinkedList<Rectangle> list = new LinkedList<>();
        for (int[] ra : rs) {
            Rectangle r = new Rectangle(ra[0], ra[1], ra[2], ra[3]);
//            System.out.println("r: " + r);
            list.add(r);
        }
        // sort & eliminate duplicates
        normalize(list);
        list = slice(list);

//        normalize(list2);
//        dump(list2, "after x");

        // process vertical cuts by flipping x<->y and repeating procedure
        flipAll(list);
        normalize(list);
        list = slice(list);
        flipAll(list);
        // this time, sort AND eliminate duplicates
        normalize(list);

        // done processing
        //dump(list, "after all processing");
        int sum = 0;
        for (Rectangle r1 : list) {
            sum += (r1.x1 - r1.x0) * (r1.y1 - r1.y0);
        }

        return sum;
    }

    static void flipAll(LinkedList<Rectangle> list) {
        for (Rectangle r : list) {
            int temp;

            temp = r.x0;
            r.x0 = r.y0;
            r.y0 = temp;

            temp = r.x1;
            r.x1 = r.y1;
            r.y1 = temp;
        }
    }

    static LinkedList<Rectangle> slice(LinkedList<Rectangle> list) {
        // make list of edges
        ArrayList<Edge> edges = new ArrayList<>(list.size() * 2);
        list.forEach((r) -> {
            edges.add(new Edge(r.x0, true));
            edges.add(new Edge(r.x1, false));
        });
        edges.sort((a,b)->a.x-b.x);

        // process horizontal cuts
        LinkedList<Rectangle> list2 = new LinkedList<>();
        Window w = new Window();
        for (Edge e : edges) {
            // cut here, discard left side into catcher list2
            w.cutAllAt(e.x, list2);
            if (e.left) {
                // left edge of new rect, cut here, then add new rects
                while (!list.isEmpty() && list.peek().x0 == e.x) {
                    w.add(list.removeFirst());
                }
            }
        }
        return list2;
    }

    static class Window {

        LinkedList<Rectangle> list = new LinkedList<>();

        void cutAllAt(int x, LinkedList<Rectangle> cut) {
            Iterator<Rectangle> iter = list.iterator();
            while (iter.hasNext()) {
                Rectangle r = iter.next();
                // intersecting at x?
                if (x > r.x0 && x < r.x1) {
                    cut.add(new Rectangle(r.x0, r.y0, x, r.y1));
                    r.x0 = x;
                } else if (x == r.x1) {
                    iter.remove();
                    cut.add(r);
                }
            }
        }

        // adds one element, shifts if necessary, return cut list of elements pushed out
        void add(Rectangle r) {
            list.add(r);
        }
    }

    static class Edge {

        int x;
        boolean left;

        Edge(int x, boolean left) {
            this.x = x;
            this.left = left;
        }
    }

    static void sort(List<Rectangle> list) {
        // sort the sub-rects
        list.sort((a, b) -> {
            if (a.x0 != b.x0) {
                return a.x0 - b.x0;
            }

            if (a.x1 != b.x1) {
                return a.x1 - b.x1;
            }

            if (a.y0 != b.y0) {
                return a.y0 - b.y0;
            }
            if (a.y1 != b.y1) {
                return a.y1 - b.y1;
            }
            return 0;
        });
    }

    static void normalize(List<Rectangle> list) {
        sort(list);
        // eliminate duplicates
        Rectangle r2 = new Rectangle(-1, -1, -1, -1);
        Iterator<Rectangle> iter = list.iterator();
        while (iter.hasNext()) {
            Rectangle r = iter.next();
            if ((r.x0 == r.x1 || r.y0 == r.y1)
                    || (r.x0 == r2.x0 && r.x1 == r2.x1 && r.y0 == r2.y0 && r.y1 == r2.y1)) {
                iter.remove();
            }
            r2 = r;
        }
    }

    static class Rectangle {

        @Override
        public String toString() {
            return "[" + x0 + "," + y0 + "," + x1 + "," + y1 + "]:" + ((x1 - x0) * (y1 - y0));
        }

        int x0, y0, x1, y1;

        Rectangle(int x, int y, int xe, int ye) {
            x0 = x;
            y0 = y;
            x1 = xe;
            y1 = ye;
        }

        boolean intersects(Rectangle r1) {
            return (x0 < r1.x1 && y0 < r1.y1 && r1.x0 < x1 && r1.y0 < y1);
        }

        LinkedList<Rectangle> splitHorizontally(int atX) {
            LinkedList<Rectangle> list = new LinkedList<>();

            // not intersecting at atX?
            if (atX <= x0 || atX >= x1) {
                list.add(this);
                return list;
            }

            // split 
            list.add(new Rectangle(x0, y0, atX, y1));
            list.add(new Rectangle(atX, y0, x1, y1));
            return list;

        }

    }

    static class RectVis {

        int x0, y0;
        int[][] cells;

        RectVis(List<Rectangle> list) {
            if (list.size() != 0) {
                int xMin = list.stream().min((a, b) -> a.x0 - b.x0).get().x0;
                int xMax = list.stream().max((a, b) -> a.x1 - b.x1).get().x1;
                int yMin = list.stream().min((a, b) -> a.y0 - b.y0).get().y0;
                int yMax = list.stream().max((a, b) -> a.y1 - b.y1).get().y1;

                x0 = xMin;
                y0 = yMin;

                cells = new int[xMax - xMin][yMax - yMin];

                int count = 1;
                for (Rectangle r : list) {
                    System.out.println("r(" + count + "): " + r);
                    for (int x = r.x0 - x0; x < (r.x1 - x0); x++) {
                        for (int y = r.y0 - y0; y < (r.y1 - y0); y++) {
                            cells[x][y] = count;
                        }
                    }
                    count++;
                }
            }
        }

        void dump() {
            if (cells != null) {
                System.out.println("(" + x0 + "," + y0 + ")");
                for (int y = 0; y < cells[0].length; y++) {

                    for (int x = 0; x < cells.length; x++) {
                        //System.out.print("\u001B[30m");
                        System.out.print(/*"\u001B[" + (32 + cells[x][y]) + "m" + */format(cells[x][y]) + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }

        static String format(int x) {
            if (x == 0) {
                return "  0";
            }

            return ("  " + x).substring((int) Math.log10(x));
        }
    }

    static void dump(List<Rectangle> list, String m) {
        System.out.println(m);
        new RectVis(list).dump();

    }

}
