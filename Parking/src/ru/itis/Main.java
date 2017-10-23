package ru.itis;

public class Main {

    public static void main(String[] args) {
        ParkingPlace underground = new ParkingPlace(10);
        ParkingPlace carbon = new ParkingPlace(6);
        ParkingPlace mostWanted = new ParkingPlace(32);

        mostWanted.setName("Мост Вантед");
        carbon.setName("Карбон");
        underground.setName("Андерграунд");

        Car car1 = new Car("bugatti veyron", "x123yk", underground);
        Car car2 = new Car("BMW x3", "x010ax", carbon);
        Car car3 = new Car("toyota rav4", "x888aa", underground);
        Car car4 = new Car("range rover velar", "x888aa",  mostWanted);
        Car car5 = new Car("lada priora", "o001oo", underground);
        Car car6 = new Car("lada x-ray", "c007oc", underground);

        car1.parking();
        car3.parking();
        car4.parking();
        car1.leave();
        car2.leave();
        car5.parking();
        car6.parking();

    }
}
