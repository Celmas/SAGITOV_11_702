package ru.itis;

public class Main {

    public static void main(String[] args) {
        ParkingPlace underground = new ParkingPlace();
        ParkingPlace carbon = new ParkingPlace();
        ParkingPlace mostWanted = new ParkingPlace();

        Car car1 = new Car("bugatti veyron", "x123yk", underground);
        Car car2 = new Car("BMW x3", "x010ax", carbon);
        Car car3 = new Car("toyota rav4", "x888aa", mostWanted);
        Car car4 = new Car("range rover velar", "x888aa",  carbon);
        Car car5 = new Car("lada priora", "o001oo", underground);

        car1.parking(car1);
        car2.parking(car2);
        car3.parking(car3);
        car4.parking(car4);
        car1.leave(car1);
    }
}
