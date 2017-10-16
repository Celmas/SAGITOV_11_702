package ru.itis;

public class Car {
    private String model, number;
    private ParkingPlace place;
    private int i;

    Car(String model, String number, ParkingPlace place) {
        this.model = model;
        this.number = number;
        this.place = place;
    }

    void parking(){
        place.enterCar(this);
    }
    void leave(){
        place.delCar(this);
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

    public ParkingPlace getPlace() {
        return place;
    }

    public void setPlace(ParkingPlace place) {
        this.place = place;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}