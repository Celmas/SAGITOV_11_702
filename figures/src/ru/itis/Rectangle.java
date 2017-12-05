package ru.itis;

public class Rectangle extends Figures {
    private double width;
    private double length;
    public Rectangle(double x, double y, double width, double length){
        super(x,y);
        this.width = width;
        this.length = length;
    }

    @Override
    protected double area() {
        return width*length;
    }

    @Override
    protected double perimetr() {
        return 2*(width+length);
    }
}
