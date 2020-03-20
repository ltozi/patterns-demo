package com.kaleyra.patterns.singleton.federico;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void shouldGetOneIstance() {
     Singleton s = Singleton.getInstance();
     Singleton t = Singleton.getInstance();
     assert (s.equals(t));
    }
}