package de.shopName;

import java.util.Scanner;

public class Shop {
  static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);
    zeigeWillkommensMenue();
  }

  private static void zeigeWillkommensMenue() {
    while (true) {
      System.out.println(
          "Willkommen im Shop. Was wollen Sie tun (K (Kundenanlage), E (Eventanlage),B"
              + " (Buchung)):");
      String antwort = scan.next();

      switch (antwort) {
        case "K":
          starteKundenanlage();
          break;
        case "E":
          starteEventanlage();
          break;
        case "B":
          starteBuchung();
          break;
        default:
          System.out.println("Die gewählte Funktion ist nicht verfügbar.");
      }
    }
  }

  private static void starteBuchung() {
    System.out.println("Buchung wurde gestartet");
  }

  private static void starteEventanlage() {
    System.out.println("Eventanlage wurde gestartet");
  }

  private static void starteKundenanlage() {
    System.out.println("Kundenanlage wurde gestartet");
  }
}
