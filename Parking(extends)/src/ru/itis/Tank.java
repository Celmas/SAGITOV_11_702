package ru.itis;

public class Tank extends Transport {
    private int countOfWeopen;
    Tank(String model, int n, ParkingPlace place){
        super(model, place);
        this.countOfWeopen= n;
    }

    public int getCountOfWeopen() {
        return countOfWeopen;
    }

    public void setCountOfWeopen(int countOfWeopen) {
        this.countOfWeopen = countOfWeopen;
    }
}
