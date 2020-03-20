package com.kaleyra.patterns.singleton.camilo;

public class Singleton {
    private static Singleton instanceRef;

    public String name;

    private Singleton(String name){
        this.name = name;
    }

    public static Singleton getInstance(String str) {
        if (instanceRef == null)
            instanceRef = new Singleton(str);
        return instanceRef;
    }
}

