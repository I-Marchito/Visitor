package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasseVisitorTest {

    @Test
    void deveExibirGuerreiro(){
        Guerreiro guerreiro = new Guerreiro(1134, 110, 25);
        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Guerreiro{HP: 1134'Furia: 110'Level: 25}", visitor.exibirGuerreiro(guerreiro));
    }

    @Test
    void deveExibirLadino(){
        Ladino ladino = new Ladino(512, 100, 25);
        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Ladino{HP: 512'Vigor: 100'Level: 25}", visitor.exibirLadino(ladino));
    }

    @Test
    void deveExibirMago(){
        Mago mago = new Mago(200, 1525, 25);
        ClasseVisitor visitor = new ClasseVisitor();
        assertEquals("Mago{HP: 200'Mana: 1525'Level: 25}", visitor.exibirMago(mago));
    }
}
