package com.kaleyra.patterns.abstract_factory.daniele;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
