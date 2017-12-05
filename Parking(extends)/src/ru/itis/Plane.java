package ru.itis;

public class Plane extends Transport {
    private int countOfEngines;
    Plane(String model, int n, ParkingPlace place){
        super(model, place);
        this.countOfEngines = n;
    }

    public int getCountOfEngines() {
        return countOfEngines;
    }

    public void setCountOfEngines(int countOfEngines) {
        this.countOfEngines = countOfEngines;
    }
}
