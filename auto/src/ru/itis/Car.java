package ru.itis;

public class Car {
    private String model, number, color;
    private int power, mileage;

    Car(){
        this.mileage=0;
    }

    Car(String model, int power){
        this.model = model;
        this.power = power;
        this.mileage=0;
    }

    Car(String model, String number, int power, String color){
        this.model = model;
        this.number = number;
        this.power = power;
        this.color = color;
        this.mileage = 0;
    }

    void goTo(int n){
        mileage += n;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0){
            this.power = power;
        }else System.err.println("incorrect");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
