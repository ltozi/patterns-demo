package com.kaleyra.patterns.factoryMethod.vinitha;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods by ship!");
    }
}
