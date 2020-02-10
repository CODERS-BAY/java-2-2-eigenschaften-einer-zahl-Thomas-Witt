package com.codersbay.witt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello my hero!");
        int choice;
        do {
            System.out.println("Gib eine Zahl zwischen 1 und 99 ein:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice < 0) {
                System.out.println("Du darfst keine negativen Zahlen wählen!");
            } else if (choice == 0) {
                System.out.println("Die Zahl Null liegt nicht zwischen 1 und  99");
            } else if (choice > 99) {
                System.out.println("Die eingegebene Zahl ist zu groß");
            }
        } while (choice >= 99 || choice <= 1);
        System.out.println("Meine Lieblingszahl ist 5.");
        System.out.println("Du hast " + choice + " eingegeben.");
        if (choice % 10 == 0) {
            System.out.println("Das ist eine Runde Zahl");
        } else if (choice % 2 == 0) {                                    //if number is even and round and both should be printed out, delete "else"
            System.out.println("Das ist eine gerade Zahl");
        } else {
            System.out.println("Das ist eine ungerade Zahl");
        }

        if (choice == 5) {
            System.out.println("Du hast meine Lieblingszahl gewählt. Wir passen gut zusammen.");
        } else {
            System.out.println("Du hast eine andere Lieblingszahl als ich.");
        }
        int biggerThanTen = choice / 10;
        if (biggerThanTen == 0) {
            System.out.println("Die Zahl ist einstellig.");
        } else {
            System.out.println("Die Zahl ist zweistellig.");
        }


    }

}
