package com.kaleyra.patterns.factoryMethod.marco.logistics;

import java.util.Scanner;

public class Logistics {

    String clientAddress;

    Scanner scan = new Scanner(System.in);

    public void planDelivery(Scanner scan) {
        System.out.println("Please enter you address: ");
        String clientAddress = scan.next();
    }
}
