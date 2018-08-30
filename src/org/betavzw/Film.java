package org.betavzw;

import java.util.ArrayList;

public class Film {
    private String filmNaam;
    private int uitgaveJaar;
    private String regisseur;
    private double prijs;


    public Film(String filmNaam, int uitgaveJaar, String regisseur, double prijs) {
this.filmNaam = filmNaam;
this.uitgaveJaar = uitgaveJaar;
this.regisseur = regisseur;
this.prijs = prijs;
    }

    public String getFilmNaam() {
        return filmNaam;
    }

    public int getUitgaveJaar() {
        return uitgaveJaar;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public double getPrijs() {
        return prijs;
    }
}