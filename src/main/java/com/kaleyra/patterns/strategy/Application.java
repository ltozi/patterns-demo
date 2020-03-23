package com.kaleyra.patterns.strategy;

public class Application {

    public void saveUser(User u) {

        //effettua le validazioni
        Context context = new Context();

        //valida l'età di nascita
        context.setValidation(new ValidateAge());
        context.executeValidation(u);

        //valida lunghezza del campo
        context.setValidation((new ValidateLength()));
        context.executeValidation(u);

        //valida campo non nullo
        context.setValidation((new ValidateNullField()));
        context.executeValidation(u);

        //user creato
        System.out.println("User saved!");
    }
}