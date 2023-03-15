package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotante{
    private boolean giocoso;
    public Delfino(String nome, boolean giocoso) throws IllegalArgumentException{
        super(nome);
        this.giocoso = giocoso;
    }

    public boolean isGiocoso() {
        return giocoso;
    }
    @Override
    public void verso() {
        System.out.println("Fischia");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

    @Override
    public String toString() {
        return super.toString() + " giocoso: " + (giocoso ? "Si" : "No");
    }
}
