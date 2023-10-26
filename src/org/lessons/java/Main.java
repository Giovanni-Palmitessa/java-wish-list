package org.lessons.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        //creo una collection di Regali
        List<Gift> gifts = new ArrayList<>();

        //chiedo all'utente di aggiungere nuovi regali
        boolean exit = false;
        System.out.println("Lista dei regali!");
        while (!exit) {
            System.out.println("Vuoi aggiungere un nuovo regalo alla lista? y/n");
            exit = scan.nextLine().equals("n");
            if (!exit) {
                System.out.println("Dammi la descrizione del regalo.");
                String description = scan.nextLine();
                System.out.println("Dimmi per chi è il regalo.");
                String recipient = scan.nextLine();
                gifts.add(new Gift(description, recipient));
                System.out.println("La tua lista contiene: " + gifts.size() + " regalo/i.");
            }
        }
    }
}
