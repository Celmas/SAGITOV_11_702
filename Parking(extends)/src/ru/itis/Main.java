package ru.itis;

public class Main {

    public static void main(String[] args) {
        ParkingPlace underground = new ParkingPlace(10);
        ParkingPlace carbon = new ParkingPlace(6);
        ParkingPlace mostWanted = new ParkingPlace(32);

        mostWanted.setName("Мост Вантед");
        carbon.setName("Карбон");
        underground.setName("Андерграунд");

        Transport car1 = new Car("bugatti veyron", "x123yk", underground);
        Transport car2 = new Car("BMW x3", "x010ax", carbon);
        Transport tank = new Tank("T-34", 3, underground);
        Transport plane = new Plane("Samolet", 6,  mostWanted);
        Transport traktor = new TraktorBelarus("Kartoha mobil", 666, underground);
        Transport sportcar = new SportCar("lada x-ray", "c007oc", "Fucking red", underground);

        car1.parking();
        tank.parking();
        plane.parking();
        car1.leave();
        car2.leave();
        traktor.parking();
        sportcar.parking();

    }
}
