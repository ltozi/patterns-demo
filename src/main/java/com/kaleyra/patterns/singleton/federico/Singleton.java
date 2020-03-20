package com.kaleyra.patterns.singleton.federico;

public class Singleton {

    static Singleton instance = null;

    static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
