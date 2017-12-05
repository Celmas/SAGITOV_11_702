package ru.itis;

public class TraktorBelarus extends Transport {
    private int countOfPotato;

    TraktorBelarus(String model, int n, ParkingPlace place){
        super(model, place);
        this.countOfPotato = n;
    }

    public int getCountOfPotato() {
        return countOfPotato;
    }

    public void setCountOfPotato(int countOfPotato) {
        this.countOfPotato = countOfPotato;
    }
}
