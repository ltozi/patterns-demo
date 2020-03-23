package com.kaleyra.patterns.factoryMethod.marco;

public interface Transport {

    default void deliver() {
        System.out.println("Delivering goods...");
    }
}
