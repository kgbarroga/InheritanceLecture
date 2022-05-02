package com.company;

public class Car1 extends Car{
    /**
     * Toyota Raize
     */
    Car1(){
        System.out.println("Car1 Constructor Initialized");
    }

    Car1(String newCarName){
        super(newCarName);
    }

    public String color = "golden chrome";

    public static void main(String[] args) {
        Car1 c = new Car1();

        Car1 c1 = new Car1("Toyota Raize");

    }
}
