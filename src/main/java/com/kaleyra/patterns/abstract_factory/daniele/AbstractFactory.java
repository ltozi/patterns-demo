package com.kaleyra.patterns.abstract_factory.daniele;

//è l'interfaccia di riferimento per gli oggetti(Factory) che creano le istanze
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);

}
