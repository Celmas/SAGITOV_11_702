package ru.itis;

import java.time.LocalTime;

public class ParkingPlace {
    LocalTime beginTime = LocalTime.parse("14:00:00");
    LocalTime finishTime = LocalTime.parse("18:00:00");
    private Car[] cars = new Car[10];
    private int i = 0;

    void enterCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            cars[i] = x;
            i++;
        } else {
            System.out.println("Не работает");
        }
    }

    void delCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i=0; i<this.i;i++){
                if (cars[i]==x){
                    for (int k=i;i<this.i-1;i++){
                        cars[k] = cars[k+1];
                    }
                }
            }
        } else {
            System.out.println("Не работает");
        }

    }
}
