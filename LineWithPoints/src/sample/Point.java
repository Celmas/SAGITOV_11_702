package sample;

public class Point {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Точка{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
