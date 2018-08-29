package org.betavzw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welkom in de kleinste videotheek ter wereld !");
        hoofdMenu();

    }
    public static int hoofdMenu(){
        int keuze;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("--HOOFDMENU--");
            String[] possibilities = new String[5];
                for (int i = 1; i < possibilities.length+1; i++) {
                    System.out.printf("%d. %n", i);
            }
            keuze = Integer.parseInt(input.nextLine());
        } while (keuze < 1 || keuze > 5);
return keuze;
    }
}
