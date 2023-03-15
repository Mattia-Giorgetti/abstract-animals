package org.lessons.java.animals;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        Esercizio 1
        Cane cane = new Cane("Fido", "Boxer");
        System.out.println("Il cane " + cane.getNome() + " è un " + cane.getRazza());
        cane.mangia();
        cane.verso();
        cane.dormi();
        System.out.println();

        Passerotto passerotto = new Passerotto("Otto", "Rosso");
        System.out.println("Il passerotto " + passerotto.getNome() + " ha le piume di colore: " + passerotto.getColorePiume());
        passerotto.mangia();
        passerotto.verso();
        passerotto.dormi();
        System.out.println();

        Delfino delfino = new Delfino("Gino", true);
        System.out.println("Il delfino " + delfino.getNome() + " ha un carattere: " + (delfino.isGiocoso() ? "molto giocoso" : "poco giocoso"));
        delfino.mangia();
        delfino.verso();
        delfino.dormi();
        System.out.println();

        Aquila aquila = new Aquila("Sara", new BigDecimal("1.50"));
        System.out.println("L'aquila " + aquila.getNome() + " ha una apertura alare di: " + aquila.getAperturaAli());
        aquila.mangia();
        aquila.verso();
        aquila.dormi();
        System.out.println();

//        Esercizio 2


        System.out.println(passerotto.getNome() + " dice: ");
        faiVolare(passerotto);
        System.out.println();

        System.out.println(delfino.getNome() + " dice: ");
        faiNuotare(delfino);


    }

    public static void faiVolare(Volante animale){
        animale.vola();
    }
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
