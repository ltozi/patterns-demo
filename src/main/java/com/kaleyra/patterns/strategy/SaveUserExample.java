package com.kaleyra.patterns.strategy;

public class SaveUserExample {

    public static void main(String[] arg) {

        User user = new User();
        user.setName("Franco"); //Not null
        user.setUsername("Marconi");//Not null //Can contain only letters and max 10 chars
        user.setEmail("franco.marconi@kaleyra.com");//Not null //Email format must be valid
        user.setAge(44);//Not null //Not negative and age greater than 18

        Application application = new Application();
        application.saveUser(user);
    }
}