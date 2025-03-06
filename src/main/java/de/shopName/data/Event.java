package de.shopName.data;

public class Event {

  private int eventNummer;
  private String name;
  private String ort;
  private String datum;

  private int anzahlTickets;

  public Event(int eventNummer, String name, String ort, String datum, int anzahlTickets) {
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

  public String getDatum() {
    return datum;
  }

  public void setDatum(String datum) {
    this.datum = datum;
  }

  public int getAnzahlTickets() {
    return anzahlTickets;
  }

  public void setAnzahlTickets(int anzahlTickets) {
    this.anzahlTickets = anzahlTickets;
  }
}
