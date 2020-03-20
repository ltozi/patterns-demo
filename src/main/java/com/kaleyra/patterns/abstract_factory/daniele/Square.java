package com.kaleyra.patterns.abstract_factory.daniele;

//ConcreteProduct
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drow a Square");
    }
}
