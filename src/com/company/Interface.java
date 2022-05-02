package com.company;

interface Vegetarian {
    void eatGrass();
}

public class Interface implements Vegetarian{
    public static void main(String[] args) {
        Interface i = new Interface();
        i.eatGrass();
    }

    @Override
    public void eatGrass() {
        System.out.println("I am eating grass");
    }
}
