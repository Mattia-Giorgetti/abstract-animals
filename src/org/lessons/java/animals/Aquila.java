package org.lessons.java.animals;

public class Aquila extends Animale implements Volante{
    @Override
    void verso() {
        System.out.println("Stride");
    }

    @Override
    void mangia() {
        System.out.println("Mangia carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
