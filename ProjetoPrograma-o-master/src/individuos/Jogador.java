package individuos;

import java.util.ArrayList;
import java.util.Random;
import deck.Carta;
import erro.ManaInsuficienteException;
import individuos.Criatura.Habilidade;
import ProjetoProgramacao.JogoDeCartas;

public class Jogador {
    public static Jogador jogador1;
    public static Jogador jogador2;
  
    private String nome;
    private int vida;
    private static int mana;
    public ArrayList<Carta> deck;
    public ArrayList<Carta> mao;
    public static ArrayList<Carta> cemiterio;
    private static Jogador jogadorAtual;

    // Construtor
    public Jogador(String nome, ArrayList<Carta> deckInicial) {
        this.nome = nome;
        this.vida = 200;
        mana = 0;
        this.deck = new ArrayList<>(deckInicial);
        this.mao = new ArrayList<>();
        this.cemiterio = new ArrayList<>();
        
    }

    
   
    
    // Inicialização dos jogadores estáticos
    public static void inicializarJogadores(ArrayList<Carta> deck1, ArrayList<Carta> deck2) {
        jogador1 = new Jogador("Jogador 1", deck1) {};
        jogador2 = new Jogador("Jogador 2", deck2) {};
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {return vida;}

    public static int getManaDisponivel() {
        return mana;
    }

    public void danoVida(int dano) {
        this.vida = Math.max(0, this.vida - dano);

        if (this.vida == 0) {
            System.out.println(nome + " foi derrotado!");
        } else {
            System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
        }
    }

    public String getNome() {
        return nome;
    }

    public void statusInicial() {
        comprarMaoInicial();
        jogador1.ganharMana();
        jogador2.ganharMana();
    }

    public void ganharMana() {
        if (JogoDeCartas.turno == 0) {
            mana = 3;
        } else {
            mana = Math.min(mana + 1, 10);
        }
    }

    public void comprarCarta() {
        if (!deck.isEmpty()) {
            Carta carta = deck.remove(0);
            mao.add(carta);
        } else {
            setVida(0); // Jogador perde se o deck acabar
        }
    }

    public void comprar() {
        jogadorAtual.comprarCarta();
        System.out.println("Comprando cartas!");
    }

    public static Jogador definirJogadorInicial() {
        Random random = new Random();
        jogadorAtual = random.nextBoolean() ? jogador1 : jogador2;
        System.out.println("Jogador inicial: " + jogadorAtual.getNome());
        return null;
    }


    public void mudarJogador() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
        System.out.println("Agora é a vez de " + jogadorAtual.getNome());
    }

    public void jogarCarta(Carta carta) {
        try {
            if (!mao.contains(carta)) {
                System.out.println("A carta " + carta.getNome() + " não está na mão do jogador.");
                return;
            }
            carta.jogar();
            mao.remove(carta);
            mana -= carta.getCustoMana();
            JogoDeCartas.board.add(carta);

            System.out.println(nome + " jogou a carta: " + carta.getNome());
        } catch (ManaInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void comprarMaoInicial() {
        for (int i = 0; i < 5; i++) {
            jogador1.comprarCarta();
            jogador2.comprarCarta();
        }
    }
}
