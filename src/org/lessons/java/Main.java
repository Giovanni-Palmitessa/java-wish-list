package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //leggo il file
        System.out.println("Hai questi regali nella tua lista!");
        try(Scanner fileReader = new Scanner(new File("./resources/gifts.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Impossibile leggere file!");
        }

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
        // stampo il contenuto della lista
        System.out.println(gifts);

        // scrivo su file
        try (FileWriter fileWriter = new FileWriter("./resources/gifts.txt", true)) {
            //scrivo una riga per ogni regalo
            for (Gift gift : gifts) {
                fileWriter.write(gift.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Impossibile scrivere file!");;
        }

        //chiudo lo scanner
        scan.close();
    }
}
