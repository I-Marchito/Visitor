package com.example;

public class Ladino implements Classe {

    private int hp;
    private int vigor;
    private int nivel;
    
    public Ladino(int hp, int vigor, int nivel){
        this.hp = hp;
        this.vigor = vigor;
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public int getVigor() {
        return vigor;
    }

    public int getNivel() {
        return nivel;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirLadino(this);
    }
    
}
