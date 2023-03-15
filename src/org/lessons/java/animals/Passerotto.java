package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{
    private String colorePiume;
    public Passerotto(String nome, String colorePiume) {
        super(nome);
        this.colorePiume = colorePiume;
    }

    public String getColorePiume() {
        return colorePiume;
    }

    public void setColorePiume(String colorePiume) {
        this.colorePiume = colorePiume;
    }

    @Override
    public void verso() {
        System.out.println("Cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
