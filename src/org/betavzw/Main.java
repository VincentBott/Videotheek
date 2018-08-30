package org.betavzw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom in de kleinste videotheek ter wereld !");
        Menu hoofdM = new Menu("hoofdmenu", new String[]{"Filmselectie", "Audioselectie", "Account", "Stoppen"});
        int keuze;
        keuze = hoofdM.menuUitvoeren();
        if (keuze < 4) {
            String[] de2eNiveau = hoofdM.tweedeNiveau(keuze);
            Menu videoM = new Menu("filmselectie", de2eNiveau);
            videoM.menuUitvoeren();
            ArrayList<Film> films = videoM.videoadder(keuze);
            videoM.menuUitvoeren();
        }
    }
}



