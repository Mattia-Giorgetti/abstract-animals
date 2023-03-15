package org.lessons.java.animals;

public class Cane extends Animale{
    private String razza;

    public Cane(String nome, String razza) {
        super(nome);
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    @Override
    public void verso() {
        System.out.println("Abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia crocchette");
    }
}
