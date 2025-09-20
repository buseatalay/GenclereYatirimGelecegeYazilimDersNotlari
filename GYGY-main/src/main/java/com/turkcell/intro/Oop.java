package com.turkcell.intro;

public class Oop {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Honda");
        System.out.println(car1.getBrand());

        Motorcycle motor1 = new Motorcycle();
        motor1.setYear(2022);
        System.out.println(motor1.getYear());

        motor1.startRent();
        car1.startRent();

        System.out.println("********");
        // Polymorphism // runtime için
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        v1.startRent();
        v2.startRent();

        //Casting
        Car c = (Car) v1;
        c.getDoorCount();

        DatabaseHelper.connect("admin", "admin123");
        DatabaseHelper.connet("admin", "12356", "jdbc//:localhost:3306");

    }
}
