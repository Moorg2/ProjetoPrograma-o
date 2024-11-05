package src.ProjetoProgramacao;

import java.util.ArrayList;

abstract class Jogador {
    String nome;
    public int vida;
    public int mana;
    private int turno;
    ArrayList<Cartas> deck;
    ArrayList<Cartas> mao;
    ArrayList<Cartas> cemiterio;

    public Jogador(String nome) {
        this.nome = nome;
        this.vida = 200; // Vida inicial
        this.mana = 0;
        this.turno = 0;
        this.deck = new ArrayList<>();
        this.mao = new ArrayList<>();
        this.cemiterio = new ArrayList<>();
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public int danoVida(int dano, int vida) {
        if (dano >= vida) {
            return 0; 
        } else {
            return this.vida = vida - dano; 
        }
    }
    public int getTurno() {
        return turno;
    }

    // Método para ganhar mana no início do turno
    public void ganharMana() {
        if (turno == 0) {
            mana = 3;
        } else {
            mana = Math.min(mana + 1, 10);
        }
        turno++;
    }

    public void comprarCarta() {
        if (!deck.isEmpty()) {
            Cartas carta = deck.remove(0);
            mao.add(carta);
        } else {
            jogadorAtual.setVida(0);
        }
    }
}
