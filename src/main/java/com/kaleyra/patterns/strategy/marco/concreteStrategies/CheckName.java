package com.kaleyra.patterns.strategy.marco.concreteStrategies;

import com.kaleyra.patterns.strategy.marco.Strategy;
import com.kaleyra.patterns.strategy.marco.User;

public class CheckName implements Strategy{

    @Override
    public void check(User user) {
        if(user.getName() == null)
            throw new IllegalArgumentException("Should not be null");
    }
}
