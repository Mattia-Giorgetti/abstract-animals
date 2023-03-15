package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{
    @Override
    void verso() {
        System.out.println("Cinguetta");
    }

    @Override
    void mangia() {
        System.out.println("Mangia insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
