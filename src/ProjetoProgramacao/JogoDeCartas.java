package ProjetoProgramacao;

import java.util.ArrayList;


import deck.Carta;

import individuos.Jogador;

public class JogoDeCartas {
    public static ArrayList<Carta> board; // Agora é estático
    public static int turno;             // Agora é estático

    public JogoDeCartas() {
        board = new ArrayList<>();
        turno = 0;
    }

    public void iniciar(ArrayList<Carta> deck1, ArrayList<Carta> deck2) {
        Jogador.inicializarJogadores(deck1, deck2);
        Jogador.jogador1.statusInicial();
        Jogador.jogador2.statusInicial();
        System.out.println("Jogo iniciado!");
        turnos();
    }

    public void turnos() {
        while (Jogador.jogador1.getVida() > 0 && Jogador.jogador2.getVida() > 0) {
            System.out.println("\n=== Turno " + turno + " ===");

            Jogador jogadorAtual = Jogador.definirJogadorInicial();
            // O jogador atual realiza ações no turno
            assert jogadorAtual != null;
            jogadorAtual.ganharMana();
            jogadorAtual.comprarCarta();
            System.out.println(jogadorAtual.getNome() + " ganhou mana e comprou uma carta!");
            System.out.println(jogadorAtual.getNome() + " está jogando...");
            jogadorAtual.mudarJogador();
            turno++;
        }
        // Finaliza o jogo
        if (Jogador.jogador1.getVida() <= 0) {
            System.out.println(Jogador.jogador2.getNome() + " venceu o jogo!");
        } else {
            System.out.println(Jogador.jogador1.getNome() + " venceu o jogo!");
        }
    }

    public static void main(String[] args) {
        // Exemplo de decks
        ArrayList<Carta> deck1 = new ArrayList<>();
        ArrayList<Carta> deck2 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            deck1.add(new Carta("Carta " + (i + 1), i % 5 + 1));
            deck2.add(new Carta("Carta " + (i + 1), i % 5 + 1));
        }
        JogoDeCartas jogo = new JogoDeCartas();
        jogo.iniciar(deck1, deck2);
    }
}