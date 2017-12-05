package ru.itis;

public class SportCar extends Car {
    private String color;
    SportCar(String model, String number, String color,ParkingPlace place ){
        super(model, number, place);
        this.color = color;
    }
}
