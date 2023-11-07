package com.example;

public class ClasseVisitor implements Visitor{

    public String exibir(Classe classe){
        return classe.aceitar(this);
    }

    @Override
    public String exibirGuerreiro(Guerreiro guerreiro){
        return "Guerreiro{" +
                "HP: " + guerreiro.getHp() + '\'' +
                "Furia: " + guerreiro.getFuria() + '\'' +
                "Level: " + guerreiro.getNivel() + '}';
    }

    @Override
    public String exibirLadino(Ladino ladino){
        return "Ladino{" +
                "HP: " + ladino.getHp() + '\'' +
                "Vigor: " + ladino.getVigor() + '\'' +
                "Level: " + ladino.getNivel() + '}';
    }

    @Override
    public String exibirMago(Mago mago){
        return "Mago{" +
                "HP: " + mago.getHp() + '\'' +
                "Mana: " + mago.getMana() + '\'' +
                "Level: " + mago.getNivel() + '}';
    }
    
}
