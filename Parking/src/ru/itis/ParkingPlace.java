package ru.itis;

import java.time.LocalTime;

public class ParkingPlace {
    LocalTime beginTime = LocalTime.parse("11:00:00");
    LocalTime finishTime = LocalTime.parse("23:50:00");
    private Car[] cars;
    private String name;
    private boolean isParked = false;
    ParkingPlace(int n){
        cars = new Car[n];
        for (int i = 0; i < cars.length; i++){
            cars[i] = null;
        }
    }

    void enterCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i = 0; i < cars.length; i++){
                if (cars[i] == null){
                    cars[i] = x;
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

    void delCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i=0; i < cars.length;i++){
                if (cars[i] == x){
                    cars[i]=null;
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
