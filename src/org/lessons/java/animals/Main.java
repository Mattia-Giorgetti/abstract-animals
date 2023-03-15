package org.lessons.java.animals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

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

        Aquila aquila = new Aquila("Sara", 150);
        System.out.println("L'aquila " + aquila.getNome() + " ha una apertura alare di: " + aquila.getAperturaAli() + "cm");
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
        System.out.println();
        System.out.println();

//        BONUS

        Scanner scan = new Scanner(System.in);
        Animale[] animals = new Animale[3];

        System.out.println("Puoi inserire 3 animali");


        try {
            for (int i = 0; i < animals.length; i++) {
                boolean validInput = false;

                while (!validInput) {
                    System.out.println("Premi 1 per cane, Premi 2 per aquila, Premi 3 per passerotto, Premi 4 per delfino");
                    int sceltaUtente = Integer.parseInt(scan.nextLine());
                    String nome = "";
                    switch (sceltaUtente){
                        case 1 :
                            validInput = true;
                            System.out.print("Nome: ");
                            nome = scan.nextLine();
                            System.out.print("Razza: ");
                            String razza = scan.nextLine();
                            animals[i] = new Cane(nome, razza);
                            break;
                        case 2:
                            validInput = true;
                            System.out.print("Nome: ");
                            nome = scan.nextLine();
                            System.out.print("Apertura alare (in centimetri): ");
                            int aperturaAli = 0;
                            try {
                                aperturaAli = Integer.parseInt(scan.nextLine());
                            } catch (IllegalArgumentException e) {
                            }
                            animals[i] = new Aquila(nome, aperturaAli);
                            break;
                        case 3:
                            validInput = true;
                            System.out.print("Nome: ");
                            nome = scan.nextLine();
                            System.out.print("Colore piume: ");
                            String colorePiume = scan.nextLine();
                            animals[i] = new Passerotto(nome, colorePiume);
                            break;
                        case 4:
                            validInput = true;
                            System.out.print("Nome: ");
                            nome = scan.nextLine();
                            System.out.print("Gli piace giocare? (Si/No) ");
                            boolean giocoso = scan.nextLine().equalsIgnoreCase("si") ? true : false;
                            animals[i] = new Delfino(nome, giocoso);
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scan.close();

//        SCRIVO DATI con try-with-resources

        try(FileWriter writer = new FileWriter("./animals.txt", true)) {

            for (Animale animal: animals) {
                if(animal != null){
                    writer.write(animal + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        LEGGO DATI con try-with-resources

        try(Scanner readingScan = new Scanner(new FileReader("./animals.txt"))){
            System.out.println();
            System.out.println("Ecco la lista:");
            while (readingScan.hasNext()){
                System.out.println(readingScan.nextLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void faiVolare(Volante animale){
        animale.vola();
    }
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
