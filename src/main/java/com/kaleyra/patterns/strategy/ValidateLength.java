package com.kaleyra.patterns.strategy;

public class ValidateLength implements InputValidation {

    @Override
    public <T> void validate(T user) {

        User u = (User)user;

        if(u.getUserName().length() > 10)
            throw new IllegalArgumentException("10 chars max!");
    }
}
