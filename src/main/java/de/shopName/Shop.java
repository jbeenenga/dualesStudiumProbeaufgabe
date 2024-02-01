package de.shopName;

import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        zeigeWillkommensMenue(scan);
    }

    private static void zeigeWillkommensMenue(Scanner scan) {
        while (true) {
            System.out
                    .println("Willkommen im Shop. Was wollen Sie tun (K (Kundenanlage), E (Eventanlage),B (Buchung)):");
            String antwort = scan.next();

            switch (antwort) {
                case "K":
                    starteKundenanlage(scan);
                    break;
                case "E":
                    starteEventanlage(scan);
                    break;
                case "B":
                    starteBuchung(scan);
                    break;
                default:
                    System.out.println("Die gewählte Funktion ist nicht verfügbar.");
            }
        }
    }

    private static void starteBuchung(Scanner scan) {
        System.out.println("Buchung wurde gestartet");
    }

    private static void starteEventanlage(Scanner scan) {
        System.out.println("Eventanlage wurde gestartet");
    }

    private static void starteKundenanlage(Scanner scan) {
        System.out.println("Kundenanlage wurde gestartet");
    }
}
