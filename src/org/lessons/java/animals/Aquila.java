package org.lessons.java.animals;

import java.math.BigDecimal;

public class Aquila extends Animale implements Volante{
    private BigDecimal aperturaAli;
    public Aquila(String nome, BigDecimal aperturaAli) {
        super(nome);
        this.aperturaAli = aperturaAli;
    }

    public BigDecimal getAperturaAli() {
        return aperturaAli;
    }

    public void setAperturaAli(BigDecimal aperturaAli) {
        this.aperturaAli = aperturaAli;
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
}
