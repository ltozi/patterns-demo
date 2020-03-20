package com.kaleyra.patterns.abstract_factory.daniele;

//ConcreteFactory
//crea effettivamente una tipologia specifica di oggetti
//apparteneneti ad una famiglia
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

}
