package com.example;

public class Mago implements Classe {

    private int hp;
    private int mana;
    private int nivel;
    
    public Mago(int hp, int mana, int nivel){
        this.hp = hp;
        this.mana = mana;
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getNivel() {
        return nivel;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirMago(this);
    }
    
}
