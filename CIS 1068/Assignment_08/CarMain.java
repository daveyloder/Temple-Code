package Assignment_08;

import Assignment_08.Car;

public class CarMain {
    public static void main(String[] args) {
        Car Jagare = new Car("Volvo", "C30", 2009, 23, 0, 15.9, 15.9);
        Car Bjorn = new Car("Honda", "HR-V", 2016, 29, 0, 13.2, 13.2);
        Car Sven = new Car("Volvo", "S40", 2008, 21, 0, 15.1, 15.1);
        System.out.println(Jagare);
        System.out.println(Bjorn);
        System.out.println(Sven);

        System.out.println("### Jagare Drive Info");
        Jagare.drive(320);
        System.out.println(Jagare.getMilage());
        System.out.println(Jagare.getFuelRemaining());
        System.out.println("### Bjorn Drive Info");
        Bjorn.drive(320);
        System.out.println(Bjorn.getMilage());
        System.out.println(Bjorn.getFuelRemaining());
        System.out.println("Sven Drive Info");
        Sven.drive(320);
        System.out.println(Sven.getMilage());
        System.out.println(Sven.getFuelRemaining());
    }
}