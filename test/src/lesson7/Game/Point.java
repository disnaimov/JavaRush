package Game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Point {
    private int X;
    private int Y;

    public void setX(int x) {
        if (x >= 0 && x <= 1000) {
            this.X = x;
        }
    }

    public void setY(int y) {
        if (y >= 0 && y <= 1000) {
            this.Y = y;
        }
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Point(int x, int y) throws Exception {
        if (x >= 0 && x <= 1000 && y >= 0 && y <= 1000) {
            this.X = x;
            this.Y = y;
        } else throw new Exception();
    }

    public Point() {
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return distance;
    }


    public static void main(String[] args) throws Exception {
        Point firstPoint = new Point(10, 2);
        Point secondPoint = new Point(11, 3);

        System.out.println(distance(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY()));

        Map<Point, List<Heroes>> groups = new HashMap<>();

        try {
            Point point1 = new Point(1005, 1002);
        } catch (Exception e) {
            System.out.println("Введенные коардинаты некорректны, введите коардинаты от 0 до 1000 включительно");
        }

        List<Heroes> heroesList = new LinkedList<>();

    }
}
