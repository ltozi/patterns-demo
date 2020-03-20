package com.kaleyra.patterns.singleton.federico;

public class Singleton {

    Singleton() throws InstantiationException {
        if (instance != null) throw new InstantiationException();
    }

    static Singleton instance = null;

    static Singleton getInstance() {
        if (instance == null) try {
            instance = new Singleton();
        } catch (InstantiationException e) {
        }

        return instance;
    }
}
