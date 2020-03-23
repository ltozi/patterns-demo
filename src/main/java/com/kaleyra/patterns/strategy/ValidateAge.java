package com.kaleyra.patterns.strategy;

public class ValidateAge implements InputValidation{

    @Override
    public <T> void validate(T user) {

        User u = (User)user;

        if(u.getAge() < 18)
            throw new IllegalArgumentException("Age must be greater than 18");
    }
}
