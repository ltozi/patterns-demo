package com.kaleyra.patterns.strategy;

public class ValidateNullField implements InputValidation {

    @Override
    public <T> void validate(T user) {

        User u = (User)user;

        if(u.getName() == "" || user == null)
            throw  new IllegalArgumentException("Input should not be null!");
    }
}
