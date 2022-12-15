package de.shopName.data;

import java.util.Date;

public class Event {

    private int eventNummer;
    private  String name;
    private String ort;
    private Date datum;

    private int anzahlTickets;

    public Event(int eventNummer, String name, String ort, Date datum, int anzahlTickets) {
        this.eventNummer = eventNummer;
        this.name = name;
        this.ort = ort;
        this.datum = datum;
        this.anzahlTickets = anzahlTickets;
    }

    public int getEventNummer() {
        return eventNummer;
    }

    public void setEventNummer(int eventNummer) {
        this.eventNummer = eventNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getAnzahlTickets() {
        return anzahlTickets;
    }

    public void setAnzahlTickets(int anzahlTickets) {
        this.anzahlTickets = anzahlTickets;
    }
}
