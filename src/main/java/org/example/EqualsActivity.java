package org.example;

import org.example.Car;

public class EqualsActivity {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Nissan");
        car1.setModel("Murano");
        car1.setColor("Black");
        car1.setNumber("К939ОМ77");

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setModel("A7");
        car2.setColor("Grey");
        car2.setNumber("У111ОМ777");

        Car car3 = new Car();
        car3.setBrand("Nissan");
        car3.setModel("Murano");
        car3.setColor("White");
        car3.setNumber("К941ОМ77");

        System.out.println(car1.equals(car3));
        System.out.println(car1.equals(car2));
    }
}
