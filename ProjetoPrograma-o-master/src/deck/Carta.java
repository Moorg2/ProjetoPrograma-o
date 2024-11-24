package deck;

import erro.ManaInsuficienteException;
import individuos.Jogador;
public class Carta {
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
        if (Jogador.getManaDisponivel() < custoMana) {
            throw new ManaInsuficienteException("Você não tem mana suficiente para jogar a carta " + getNome());
        }
    }

    public String getNome() {
        return this.nome;
    }
}
