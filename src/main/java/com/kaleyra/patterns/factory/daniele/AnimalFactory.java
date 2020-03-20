package com.kaleyra.patterns.factory.daniele;

//la Factory crea la specia giusta di animale in base all'enum
//specificato in input
public class AnimalFactory {

    public Animal getAnimal (AnimalEnum a) {
        Animal ret = null;
        switch(a) {
            case Cat:
                ret = new Cat();
                break;
            case Dog:
                ret = new Dog();
                break;
        }
        return ret;
    }
}
