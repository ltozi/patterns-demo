package com.kaleyra.patterns.factoryMethod.vinitha;

public interface Transport {

    default void deliver() {
        System.out.println("Delivering goods...");
    }
}
