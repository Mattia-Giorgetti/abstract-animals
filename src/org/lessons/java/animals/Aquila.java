package org.lessons.java.animals;

import java.math.BigDecimal;

public class Aquila extends Animale implements Volante{
    private int aperturaAli;
    public Aquila(String nome, int aperturaAli) throws IllegalArgumentException {
        super(nome);
        if (aperturaAli > 0){
            this.aperturaAli = aperturaAli;
        } else {
            throw new IllegalArgumentException("Apertura alare non valida");
        }
    }

    public int getAperturaAli() {
        return aperturaAli;
    }
    @Override
    public void verso() {
        System.out.println("Stride");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    public String toString() {
        return super.toString() + " apertura ali:" + aperturaAli;

    }
}
