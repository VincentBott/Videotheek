package org.betavzw;

import java.util.ArrayList;

public class Film {
    private String filmNaam;
    private int uitgaveJaar;
    private ArrayList<String> acteurs;
    private double prijs;


    public Film(String filmNaam, int uitgaveJaar, ArrayList<String> acteurs) {
this.filmNaam = filmNaam;
this.uitgaveJaar = uitgaveJaar;
this.acteurs = acteurs;
    }

    public String getFilmNaam() {
        return filmNaam;
    }

    public int getUitgaveJaar() {
        return uitgaveJaar;
    }

    public ArrayList<String> getActeurs() {
        return acteurs;
    }

    public double getPrijs() {
        return prijs;
    }
}