package com.company;

public class Car {
    /**
     * Constructor of Parent Class
     */
    Car(){
        System.out.println("This is from Parent Class");
    }

    Car(String carName){
        System.out.println("The name of the Car is " + carName);
    }
    /**
     * Parent Class
     */
    public int wheels = 4;

    public void accelerate(){
        System.out.println("I am moving Forward!!!");
    }

    public void reverse(){
        System.out.println("I am moving Backward!!!");
    }

    public void connect(){
        System.out.println("Connecting via infrared.....");
    }

}
