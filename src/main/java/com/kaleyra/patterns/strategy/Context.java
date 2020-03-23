package com.kaleyra.patterns.strategy;

class Context {

    private InputValidation validation;

    public void setValidation(InputValidation validation){
        this.validation = validation;
    }

    void executeValidation(User user){
        validation.validate(user);
    }
}