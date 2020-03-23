package com.kaleyra.patterns.strategy.marco.concreteStrategies;

import com.kaleyra.patterns.strategy.marco.Strategy;
import com.kaleyra.patterns.strategy.marco.User;

public class CheckUserName implements Strategy{

    @Override
    public void check(User user) {
        if(user.getUserName() == null)
            throw new IllegalArgumentException("Should not be null");

        if(user.getUserName().length() > 10)
            throw new IllegalArgumentException("10 chars max!");
    }
}
