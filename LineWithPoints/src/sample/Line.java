package sample;

public class Line {
    Point[] points;


    Line(Point[] points){
        this.points = points;
    }
/*
    public void add(Point point){
        points[count++] = point;
    }
    public Point getPoint(){
        return points[count-1];
    }*/
    public void show(){
        System.out.println("Линия:");
        for (int i = 0; i < points.length; i++){
            System.out.println(points[i].toString());
        }
    }
}
