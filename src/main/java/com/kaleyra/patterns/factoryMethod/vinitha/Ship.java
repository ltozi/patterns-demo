package com.kaleyra.patterns.factoryMethod.marco;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods by ship!");
    }
}
