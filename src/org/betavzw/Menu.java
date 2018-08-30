package org.betavzw;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String menuNaam;
    private String[] menu;
    Scanner input = new Scanner(System.in);

    public Menu(String naam, String[] menu) {
        this.menuNaam = naam;
        this.menu = menu;
    }

    public int menuUitvoeren() {
        int keuze;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("--" + menuNaam.toUpperCase() + "--");
            String[] possibilities = new String[menu.length];
            for (int i = 0; i <= possibilities.length - 1; i++) {
                System.out.printf("%d. %s %n", (i + 1), menu[i]);
            }
            keuze = Integer.parseInt(input.nextLine());
        } while (keuze < 1 || keuze > 3);
        return keuze;
    }

    public String[] tweedeNiveau(int keuze) {
        String[] de2eNiveau = new String[4];
        keuze = keuze;
        if (keuze == 1) {
            de2eNiveau[0] = "Film toevoegen";
            de2eNiveau[1] = "Film verwijderen";
            de2eNiveau[2] = "Filmselectie bekijken";
            de2eNiveau[3] = "Terug naar Hoofdmenu";
        } else if (keuze == 2) {
            de2eNiveau[0] = "Audioselectie bekijken";
            de2eNiveau[1] = "Plaat toevoegen";
            de2eNiveau[2] = "Info over plaat tonen";
            de2eNiveau[3] = "Terug naar Hoofdmenu";
        } else if (keuze == 3) {
            de2eNiveau[0] = "Account bekijken";
            de2eNiveau[1] = "Account aanmaken";
            de2eNiveau[2] = "Account opzeggen";
            de2eNiveau[3] = "Terug naar Hoofdmenu";
        } else {

        }
        return de2eNiveau;
    }

    public ArrayList<Film> videoadder(int keuze) {
        ArrayList<Film> films = new ArrayList<>();
        String filmNaam;
        switch (keuze) {
            case 1:
                do {
                    System.out.print("Geef de naam van de film(RETURN om te stoppen): ");
                    filmNaam = input.nextLine();
                    if (filmNaam.length() > 0) {
                        System.out.print("Geef het jaar van de uitgave: ");
                        int uitgaveJaar = Integer.parseInt(input.nextLine());
                        System.out.print("Geef de regisseur: ");
                        String regisseur = input.nextLine();
                        System.out.print("Geef de prijs: ");
                        double prijs = Double.parseDouble(input.nextLine());
                        films.add(new Film(filmNaam, uitgaveJaar, regisseur, prijs));
                    }
                    break;
                } while (filmNaam.length() > 0);
                return films;
            case 2:
                do {
                    System.out.print("Welke film wil je verwijderen(RETURN to stop)? ");
                    filmNaam = input.nextLine();
                    if (filmNaam.length() > 0) {
                        for (int o = 0; o < films.size(); o++) {
                            if (films.get(o).getFilmNaam().equals(filmNaam)) {
                                films.remove(o);
                            }
                        }
                    }
                } while (filmNaam.length() > 0);
                break;
            case 3:
                for (int i = 0; i < films.size(); i++) {
                    System.out.printf("%d: %s%n", (i + 1), films.get(i).getFilmNaam());
                }
                System.out.print("Over welke film wilt u meer weten? ");
                int keuze2 = Integer.parseInt(input.nextLine());
                System.out.printf("%s is geregisseerd door %s, is uitgebracht in het jaar %d en kost %.2f euro.", films.get(keuze2).getFilmNaam(), films.get(keuze2).getRegisseur(), films.get(keuze2).getUitgaveJaar(), films.get(keuze2).getPrijs());
        }
        return films;
    }
}

