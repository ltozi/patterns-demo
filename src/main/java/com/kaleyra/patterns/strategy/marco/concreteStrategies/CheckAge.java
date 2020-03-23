package com.kaleyra.patterns.strategy.marco.concreteStrategies;

import com.kaleyra.patterns.strategy.marco.Strategy;
import com.kaleyra.patterns.strategy.marco.User;

public class CheckAge implements Strategy {

    @Override
    public void check(User user) {
        if(user.getAge() < 18)
            throw new IllegalArgumentException("Age must be greater than 18");
    }
}
