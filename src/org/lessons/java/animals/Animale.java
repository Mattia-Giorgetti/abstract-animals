package org.lessons.java.animals;

public abstract class Animale {
    private String nome;

    public Animale(String nome) throws IllegalArgumentException {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome non valido");
        }
    }

    public String getNome() {
        return nome;
    }
    public void dormi(){
        System.out.println("Zzz");
    }
    abstract void verso();
    abstract void mangia();

    @Override
    public String toString() {
        return "nome: " + nome;
    }
}
