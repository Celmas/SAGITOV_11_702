package ru.itis;

public class Transport {
    ParkingPlace place;
    protected String model;
    protected int i;
    void parking(){
        place.enterTr(this);
    }
    void leave(){
        place.delTr(this);
    }

    Transport(String model, ParkingPlace place){
        this.model = model;
        this.place = place;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
