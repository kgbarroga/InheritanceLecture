package com.company;

public class Car2 extends Car{
    /**
     * Constructor
     */
    Car2(){
        System.out.println("Car2 Constructor Initialized");
    }

    Car2(String cname){
        System.out.println("The car name is "+cname);
    }
    /**
     * BMW m3 gtr
     */

    /**
     * "Special Feature"
     */
    public void nitro(){
        System.out.println("Car go fast!!! Vrooom!!!");
    }

    /**
     * Overriding parent class method
     */
    public void connect(){
        System.out.println("Connecting via bluetooth.....");
    }

    public void connectFromParent(){
        /**
         * invoking the method from parent class
         */
        super.connect();
    }

    public static void main(String[] args) {
        Car2 c2 = new Car2();
        c2.connect();
        c2.connectFromParent();
    }
}
