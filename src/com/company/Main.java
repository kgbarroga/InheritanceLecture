package com.company;

public class Main {

    public static void main(String[] args) {
        Car1 c1 = new Car1();
        /**
         * Invoke Exclusive Feature
         */
        System.out.println("Car 1 ");
        System.out.println("My Special color is " + c1.color);

        /**
         * Invoke Inherited Feature/Method
         */
        c1.accelerate();
        c1.reverse();

        Car2 c2 = new Car2();
        /**
         * Invoke Exclusive Feature
         */
        System.out.println("Car 2 ");
        c2.nitro();


        /**
         * Invoke Inherited Feature/Method
         */
        c2.accelerate();
        c2.reverse();

        Car3 c3 = new Car3();
        /**
         * Invoke Exclusive Feature
         */
        System.out.println("Car 3");
        c3.fwd();


        /**
         * Invoke Inherited Feature/Method
         */
        c3.accelerate();
        c3.reverse();
    }
}
