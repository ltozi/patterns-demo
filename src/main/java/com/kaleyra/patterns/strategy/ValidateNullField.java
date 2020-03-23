package com.kaleyra.patterns.strategy;

public class ValidateNullField implements InputValidation {

    @Override
    public <T> void validate(T user) {

        if(user == null)
            throw  new IllegalArgumentException("Input should not be null!");
    }
}
