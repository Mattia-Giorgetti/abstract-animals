package org.lessons.java.animals;

public class Cane extends Animale{
    private String razza;

    public Cane(String nome, String razza) throws IllegalArgumentException{
        super(nome);
        if (!razza.isEmpty()){
            this.razza = razza;
        } else {
            throw new IllegalArgumentException("Razza non valida");
        }
    }

    public String getRazza() {
        return razza;
    }
    @Override
    public void verso() {
        System.out.println("Abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia crocchette");
    }

    @Override
    public String toString() {
        return super.toString() + " razza: " + razza;
    }
}
