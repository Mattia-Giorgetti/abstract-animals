package org.lessons.java.animals;

public class Cane extends Animale{
    private String nome;
    @Override
    void verso() {
        System.out.println("Abbaia");
    }

    @Override
    void mangia() {
        System.out.println("Mangia crocchette");
    }
}
