package com.example;

public class Guerreiro implements Classe {

    private int hp;
    private int furia;
    private int nivel;
    
    public Guerreiro(int hp, int furia, int nivel){
        this.hp = hp;
        this.furia = furia;
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public int getFuria() {
        return furia;
    }

    public int getNivel() {
        return nivel;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirGuerreiro(this);
    }
    
}
