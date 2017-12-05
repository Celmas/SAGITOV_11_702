package ru.itis;

public class Ellipse extends Figures {
    private double radius1;
    private double radius2;
    public Ellipse(double x, double y, double radius1, double radius2){
        super(x,y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    protected double area() {
        return 3.14*radius1*radius2;
    }

    @Override
    protected double perimetr() {
        return 6.28*Math.sqrt(radius1*radius1 + radius2*radius2/2);
    }
}
