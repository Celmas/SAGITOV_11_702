package ru.itis;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("solo", 322);
        Car car3 = new Car("XBOCT", "444", 44, "yellow");
        car1.goTo(69);
        car2.goTo(1337);
        car3.goTo(1488);
    }
}
