package com.kaleyra.patterns.com.kaleyra.patterns.strategy.luigi;

public class Application {

    public void save(User user) {

        if(user.getName() == null)
            throw new IllegalArgumentException("Should not be null");

        if(user.getUserName() == null)
            throw new IllegalArgumentException("Should not be null");

        if(user.getUserName().length() > 10)
            throw new IllegalArgumentException("10 chars max!");

        if(user.getEmail() == null)
            throw new IllegalArgumentException("Should not be null");

        //TODO Only the braves...
//        if(user.getEmail() == null)
//            throw new IllegalArgumentException("Should not be null");

        if(user.getAge() < 18)
            throw new IllegalArgumentException("Age must be greater than 18");

        //TODO imagine a logic that writes user on file....
        System.out.println("User saved!");
    }
}
