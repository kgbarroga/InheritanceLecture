package com.company;

public class Car3 extends Car{
    /**
     * Constructor
     */

    Car3(){
        System.out.println("Car3 Constructor Initialized");
    }

    /**
     * Ford Ranger -> Velociraptor
     */
    public int wheels = 6;

    /**
     * Display number of wheels method
     */
    public void displayWheels(){
        /**
         * Call value from Parent using super
         */
        System.out.println("The wheels of a car is originally " + super.wheels);

        /**
         * Call value in local class
         */
        System.out.println("I have changed, the wheels of a car is now " + this.wheels);
    }

    /**
     * Special Feature/Exclusive
     */
    public void fwd(){
        System.out.println("All wheels go vrooom!!!");
    }

    public static void main(String[] args) {
        Car3 c = new Car3();
        c.displayWheels();

    }
}