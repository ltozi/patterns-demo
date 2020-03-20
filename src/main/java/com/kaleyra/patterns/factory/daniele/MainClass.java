package com.kaleyra.patterns.factory.daniele;
import java.util.Arrays;

//componenti
//1. Creator: dichiara la Factory che ha il compito di
//            ritornare l'oggetto apropriato
//2. ConcreteCreator: effettua l'override de metodo della
//                    Factory al fine di ritornare
//                    l'implementazione dell'oggetto
//3. Product: definisce l'interfaccia dell'oggetto che
//            deve essere creato dalla Factory
//4. ConcreteProduct: implementa l'oggetto in base ai
//                    metodi definiti dall'interfaccia
//                    product
public class MainClass {

    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        AnimalEnum cane = AnimalEnum.Dog;
        AnimalEnum gatto = AnimalEnum.Cat;

        System.out.println("Il verso e' "+ factory.getAnimal(cane).getCall());
        System.out.println("Il verso e' "+ factory.getAnimal(gatto).getCall());
    }
}
