package com.kaleyra.patterns.factoryMethod.vinitha;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering goods by truck!");
    }
}
