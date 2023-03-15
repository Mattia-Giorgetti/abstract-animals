package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotante{
    @Override
    void verso() {
        System.out.println("Fischia");
    }

    @Override
    void mangia() {
        System.out.println("Mangia pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
