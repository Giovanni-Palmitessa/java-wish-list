package org.lessons.java.bonus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente di darmi la parola
        System.out.println("Dammi una parola e ti dirò le lettere.");
        String word = scan.nextLine();

        //creare una mappa
        Map<Character, Integer> occorrenze = new HashMap<>();

        // Iterare attraverso i caratteri della parola e conta le occorrenze

    }
}
