package com.company;

public class DemoVirtualMethod {
    public static void main(String[] args) {
        Car c = new Car("Honda Civic");
        c.connect();

        Car2 c2 = new Car2("Suzuki Swift");
        c2.connect();
    }
}
