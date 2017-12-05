package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(1,2,3);
	    Ellipse ellipse = new Ellipse(1,2,3,4);
	    Square square = new Square(2,3,4);
	    Rectangle rectangle = new Rectangle(1,2,3,4);

	    Figures[] figures = {circle,ellipse,square,rectangle};
	    for (Figures figure : figures){
			System.out.println(figure.area());
			System.out.println(figure.perimetr());
        }
    }
}
