package com.kaleyra.patterns.abstract_factory.daniele;

//ConcreteProduct
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drow a Rectangle");
    }

}
