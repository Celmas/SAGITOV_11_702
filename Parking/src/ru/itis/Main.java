package ru.itis;

public class Main {

    public static void main(String[] args) {
        ParkingPlace underground = new ParkingPlace();
        ParkingPlace carbon = new ParkingPlace();
        ParkingPlace mostWanted = new ParkingPlace();

        mostWanted.setName("Мост Вантед");
        carbon.setName("Карбон");
        underground.setName("Андерграунд");

        Car car1 = new Car("bugatti veyron", "x123yk", underground);
        Car car2 = new Car("BMW x3", "x010ax", carbon);
        Car car3 = new Car("toyota rav4", "x888aa", mostWanted);
        Car car4 = new Car("range rover velar", "x888aa",  carbon);
        Car car5 = new Car("lada priora", "o001oo", underground);

        car1.parking();
        car2.parking();
        car3.parking();
        car4.parking();
        car1.leave();
        car5.leave();
    }
}
