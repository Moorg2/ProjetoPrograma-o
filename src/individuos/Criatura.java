package individuos;


import deck.Carta;
import ProjetoProgramacao.JogoDeCartas;


public class Criatura extends Carta {
    private int dano;
    private int resist;
    private String habilidadeEspecial;

    public Criatura(String nome, int custoMana, int dano, int resist, String habilidadeEspecial) {
        super(nome, custoMana);
        this.dano = dano;
        this.resist = resist;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public int getDano() {
        return this.dano;
    }

    public int getResist() {
        return this.resist;
    }

    public void setResist(int resist) {
        this.resist = resist;
    }

    public String getHabilidade() {
        return this.habilidadeEspecial;
    }

    public void aplicarHabilidade() {
        // Lógica para a habilidade especial
        System.out.println(getNome() + " usou a habilidade especial: " + habilidadeEspecial);
    }

    public void ataque(Criatura outraCriatura) {
        System.out.println(getNome() + " está atacando " + outraCriatura.getNome());

        // Reduz a resistência de ambas as criaturas
        outraCriatura.setResist(outraCriatura.getResist() - this.dano);
        this.setResist(this.resist - outraCriatura.getDano());

        // Verifica se a criatura atacada foi destruída
        if (outraCriatura.getResist() <= 0) {
            System.out.println(outraCriatura.getNome() + " foi destruída!");
            JogoDeCartas.board.remove(outraCriatura); // Remove do tabuleiro
            Jogador.cemiterio.add(outraCriatura); // Adiciona ao cemitério
        }

        // Verifica se a criatura atacante foi destruída
        if (this.getResist() <= 0) {
            System.out.println(this.getNome() + " foi destruída!");
            JogoDeCartas.board.remove(this); // Remove do tabuleiro
            Jogador.cemiterio.add(this); // Adiciona ao cemitério
        }
    }
}