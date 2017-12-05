package ru.itis;

import java.time.LocalTime;

public class ParkingPlace {
    LocalTime beginTime = LocalTime.parse("00:05:00");
    LocalTime finishTime = LocalTime.parse("23:50:00");
    private Transport[] transports;
    private String name;
    private boolean isParked = false;
    ParkingPlace(int n){
        transports = new Transport[n];
        for (int i = 0; i < transports.length; i++){
            transports[i] = null;
        }
    }

    void enterTr(Transport x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i = 0; i < transports.length; i++){
                if (transports[i] == null){
                    transports[i] = x;
                    System.out.println("Вы поставили машину " + x.getModel() + " в " + this.name + " на место " + i);
                    x.setI(i);
                    isParked = true;
                    break;
                }
            }
            if (isParked == false) System.out.println("На парковке " + this.name + " нету маста");
            isParked = false;
        } else {
            System.out.println("Не работает");
        }
    }

    void delTr(Transport x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i=0; i < transports.length;i++){
                if (transports[i] == x){
                    transports[i]=null;
                    System.out.println("Машина " + x.getModel() + " покинула " + this.name + " с места " + i);
                    x.setI(-1);
                    }
                }
            if (x.getI() != -1) System.out.println(x.getModel() + " не парковалась на " + this.name);
        } else {
            System.out.println("Не работает");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
