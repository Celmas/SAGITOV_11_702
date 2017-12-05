package ru.itis;

public class Car extends Transport{
    private String number;

    Car(String model, String number, ParkingPlace place) {
        super(model, place);
        this.number = number;
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

}