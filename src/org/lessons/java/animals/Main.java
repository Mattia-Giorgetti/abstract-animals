package org.lessons.java.animals;

public class Main {

    public static void main(String[] args) {

//        Esercizio 1
        Cane cane = new Cane();
        System.out.println("Il cane: ");
        cane.mangia();
        cane.verso();
        cane.dormi();
        System.out.println();

        Passerotto passerotto = new Passerotto();
        System.out.println("Il passerotto: ");
        passerotto.mangia();
        passerotto.verso();
        passerotto.dormi();
        System.out.println();

        Delfino delfino = new Delfino();
        System.out.println("Il delfino:");
        delfino.mangia();
        delfino.verso();
        delfino.dormi();
        System.out.println();

        Aquila aquila = new Aquila();
        System.out.println("L'aquila:");
        aquila.mangia();
        aquila.verso();
        aquila.dormi();
        System.out.println();

//        Esercizio 2

        faiVolare(passerotto);
        faiNuotare(delfino);


    }

    public static void faiVolare(Volante animale){
        animale.vola();
    }
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
