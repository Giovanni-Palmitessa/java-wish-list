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
        for (char carattere : word.toCharArray()) {
            // Verifica se il carattere è già presente nella mappa
            if (occorrenze.containsKey(carattere)) {
                // Se sì, incrementa il conteggio
                occorrenze.put(carattere, occorrenze.get(carattere) + 1);
            } else {
                // Altrimenti, aggiungi il carattere alla mappa con un conteggio di 1
                occorrenze.put(carattere, 1);
            }
        }

        // Stampa le occorrenze dei caratteri
        for (char carattere : occorrenze.keySet()) {
            int conteggio = occorrenze.get(carattere);
            System.out.println(carattere + ":" + conteggio);
        }

        scan.close();

    }
}
