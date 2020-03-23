package com.kaleyra.patterns.strategy.marco.concreteStrategies;

import com.kaleyra.patterns.strategy.marco.Strategy;
import com.kaleyra.patterns.strategy.marco.User;

public class CheckEMail implements Strategy {

    @Override
    public void check(User user) {
        if(user.getEmail() == null)
            throw new IllegalArgumentException("Should not be null");
    }
}
