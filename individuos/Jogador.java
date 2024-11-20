package individuos;

import java.util.ArrayList;

import deck.Carta;

abstract class Jogador extends Carta {
    String nome;
    public int vida;
    public int mana;
    private int turno;
    public Jogador jogador1;
    public Jogador jogador2;
    public Jogador jogadorAtual;

    
    ArrayList<Carta> deck;
    ArrayList<Carta> mao;
    ArrayList<Carta> cemiterio;

    public Jogador(String nome, int vida, int mana, int turno) {
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
            Carta carta = deck.remove(0);
            mao.add(carta);
        } else {
            jogadorAtual.setVida(0);
        }
    }
}
