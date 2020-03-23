package com.kaleyra.patterns.strategy.camilo;
//Appliction.java


interface Validator {
    void validate (String str) throws IllegalArgumentException;
}

class ValidateName implements Validator{
    @Override
    public void validate(String str) throws IllegalArgumentException {
        if(str.equals(null))
            throw new IllegalArgumentException("Should not be null");
    }
}

class ValidateUserName implements Validator{
    @Override
    public void validate(String str) throws IllegalArgumentException {
        if(str.equals(null) || !str.matches("[a-z]{10}") )
            throw new IllegalArgumentException("Should not be null");
    }
}

class ValidateEmail implements Validator{
    @Override
    public void validate(String str) throws IllegalArgumentException {

        if(!str.matches("^[A-Za-z0-9+_.-]+@(.+)$") )
            throw new IllegalArgumentException("Should not be null");
    }
}

class ValidateAge implements Validator{
    @Override
    public void validate(String str) throws IllegalArgumentException {
        int age = Integer.parseInt(str);

        if( age < 18 || age < 0)
            throw new IllegalArgumentException("Age must be greater than 18");

    }
}

class Context {
    private Validator validator;
    public void setValidator (Validator validator){
        this.validator = validator;
    }
    void executeValidation(String str){
        validator.validate(str);
    }

}

public class Application {

    public void save(User user) {

        /*
        *         if (action == addition) then
            context.setStrategy(new ConcreteStrategyAdd())

        if (action == subtraction) then
            context.setStrategy(new ConcreteStrategySubtract())

        if (action == multiplication) then
            context.setStrategy(new ConcreteStrategyMultiply())

        result = context.executeStrategy(First number, Second number)*/

        Context context = new Context();

        context.setValidator(new ValidateName());
        context.executeValidation(user.getName());

        //TODO other validations

        System.out.println("User saved!");
    }
}
