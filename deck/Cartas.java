package deck;

import erro.ManaInsuficienteException;

public abstract class Carta {
    public String nome;
    public int custoMana;

    public Carta(String nome, int custoMana) {
        this.nome = nome;
        this.custoMana = custoMana;
    }

    public int getCustoMana() {
        return this.custoMana;
    }

    public void jogar() throws ManaInsuficienteException {
        if (getManaDisponivel() < custoMana) {
            throw new ManaInsuficienteException("Você não tem mana suficiente para jogar a carta " + getNome());
        }
        // Lógica para jogar a carta
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
