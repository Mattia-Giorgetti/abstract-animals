package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{
    private String colorePiume;
    public Passerotto(String nome, String colorePiume) throws IllegalArgumentException {
        super(nome);
        if (!colorePiume.isEmpty()){
            this.colorePiume = colorePiume;
        } else {
            throw new IllegalArgumentException("il campo 'colore' non è valido");
        }
    }

    public String getColorePiume() {
        return colorePiume;
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

    @Override
    public String toString() {
        return super.toString() + " colore piume: " + colorePiume;
    }
}
