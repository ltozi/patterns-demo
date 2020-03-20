package com.kaleyra.patterns.singleton.camilo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void shouldGetOneIstance() {
        Singleton ref1 = Singleton.getInstance("daniele");
        Singleton ref2 = Singleton.getInstance("camilo");

        if (ref1 == ref2)
            System.out.println("ref1 and ref 2 point to the same object");

        ref1.name = "marco";

        System.out.println("ref1.name: "+ref1.name);
        System.out.println("ref2.name: "+ref2.name);


        //TODO Singletong.getInstance().......
    }
}