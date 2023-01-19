package de.shopName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.shopName.data.Event;
import de.shopName.data.Kunde;

public class Shop {

    private static List<Kunde> kundenListe ;
    private static List<Event> eventListe ;

    public static void main(String[] args) {
        kundenListe = new ArrayList<>();
        eventListe = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        zeigeWillkommensMenue(scan);
    }

    private static void zeigeWillkommensMenue(Scanner scan) {
        System.out.println("Willkommen im Shop. Was wollen Sie tun (K (Kundenanlage), E (Eventanlage),B (Buchung)):");
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
                zeigeWillkommensMenue(scan);
        }
    }

    private static void starteBuchung(Scanner scan) {
        System.out.println("Buchung wurde gestartet");
        System.out.println(eventListe);
        System.out.println("Gefragte Eventnummer: ");
        int eventnummer = scan.nextInt();
        Event foundEvent = null;
        for(Event event : eventListe){
            if (eventnummer == event.getEventNummer())
            { System.out.println("Folgendes Event wurde ausgewählt: " + event);
                foundEvent = event;
            }
        }

        System.out.println("Anzahl der Tickets: ");
        int anzahl = scan.nextInt();
        if (anzahl < foundEvent.getAnzahlTickets())
        {System.out.println("Tickets wurden gebucht ");
        foundEvent.setAnzahlTickets(foundEvent.getAnzahlTickets() - anzahl);
        }
        zeigeWillkommensMenue(scan);
    }

    private static void starteEventanlage(Scanner scan) {
        System.out.println("Eventanlage wurde gestartet");
        int eventnummer = eventListe.size() + 1;
        System.out.println("Eventname: ");
        String eventname = scan.next();
        System.out.println("Eventdatum: ");
        String eventDatum = scan.next();
        System.out.println("Eventort: ");
        String eventOrt = scan.next();
        System.out.println("Maximale Ticketanzahl: ");
        int ticketAnzahl = scan.nextInt();
        eventListe.add(  new Event(eventnummer, eventname, eventOrt, eventDatum, ticketAnzahl));
        System.out.println(eventListe);

        zeigeWillkommensMenue(scan);
    }

    private static void starteKundenanlage(Scanner scan) {
        System.out.println("Kundenanlage wurde gestartet");
        int kundennummer = kundenListe.size() + 1;
        System.out.println("Vorname: ");
        String vorname = scan.next();
        System.out.println("Nachname: ");
        String nachname = scan.next();
        System.out.println("Email: ");
        String email = scan.next();
      kundenListe.add(  new Kunde(kundennummer, vorname, nachname, email));
      System.out.println(kundenListe);
        zeigeWillkommensMenue(scan);
    }
}
