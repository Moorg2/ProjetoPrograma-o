package src.ProjetoProgramacao;

import java.util.ArrayList;
import java.util.Random;

public class JogoDeCartas {
    public Jogador jogador1;
    public Jogador jogador2;
    public Jogador jogadorAtual;
    ArrayList<Cartas> board;
    private int turno;

    public JogoDeCartas(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.board = new ArrayList<>();
        this.turno = 0;
    }

    public void definirJogadorInicial() {
        Random random = new Random();
        if (random.nextBoolean()) {
            jogadorAtual = jogador1;
        } else {
            jogadorAtual = jogador2;
        }
    }

    public void comprar() {
        jogadorAtual.comprarCarta();
    }

    public void comprarMaoInicial() {
        for (int i = 0; i < 5; i++) {
            jogador1.comprarCarta();
            jogador2.comprarCarta();
        }
    }

    public void mudarJogador() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
        turno++;
    }

    public void iniciar() {
        definirJogadorInicial();
        statusInicial();
        turnos();
    }

    public void turnos() {
        while (jogador1.getVida()>0 && jogador2.getVida()>0) {  
            if (turno == 0) {
                statusInicial();
                // Implementar lógica para jogar cartas
            } else {
                comprar();
                jogadorAtual.ganharMana();
                // Implementar lógica de turno aqui (jogar cartas, habilidades, etc.)
            }
            mudarJogador();
        }
    }

    public void jogarCarta(Cartas carta) {
        if (jogadorAtual.mao.contains(carta)) {
            jogadorAtual.mao.remove(carta);
            jogadorAtual.jogada();
            board.add(carta);
            // Adicione a lógica para usar a carta, como gastar mana
        }
    }

    public void statusInicial() {
        comprarMaoInicial();
        jogador1.ganharMana();
        jogador2.ganharMana();
    }
   
    public void escolherAlvo(Object alvo) {
        if (alvo instanceof Jogador) {
            Jogador jogadorAlvo = (Jogador) alvo;
            Jogador.danoVida();
        } else if (alvo instanceof Criatura) {
            Criatura criaturaAlvo = (Criatura) alvo;
            Criatura.ataque();
        }
    }

    public static void main(String[] args) {
        new Screen();
        Jogador jogador1 = new JogadorConcreto("Jogador 1");
        Jogador jogador2 = new JogadorConcreto("Jogador 2");
        JogoDeCartas jogo = new JogoDeCartas(jogador1, jogador2);
        jogo.iniciar();
    }
}