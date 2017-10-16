package ru.itis;

import java.time.LocalTime;

public class ParkingPlace {
    LocalTime beginTime = LocalTime.parse("14:00:00");
    LocalTime finishTime = LocalTime.parse("18:00:00");
    private Car[] cars = new Car[10];
    private String name;
    private int i = 0;

    void enterCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            for (int i = 0; i<10; i++){
                if (cars[i]==null){
                    cars[i]=x;
                    System.out.println("Вы поставили машину " + x.getModel() + " в " + this.name + " на место " + i);
                    x.setI(i);
                    break;
                } else{
                    cars[this.i] = x;
                    this.i++;
                    System.out.println("Вы поставили машину " + x.getModel() + " в " + this.name + " на место " + this.i);
                    x.setI(this.i);
                    break;
                }
            }
        } else {
            System.out.println("Не работает");
        }
    }

    void delCar(Car x){
        if (LocalTime.now().isAfter(beginTime) && LocalTime.now().isBefore(finishTime)) {
            System.out.println("Машина " + x.getModel() + " покинула " + this.name + " с места " + i);
            for (int i=0; i<this.i;i++){
                if (cars[i]==x){
                    cars[i]=null;
                    x.setI(-1);
                    }
                }
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
