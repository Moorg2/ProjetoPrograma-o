package src.ProjetoProgramacao;

public class Criatura extends Cartas {
    public int dano;
    public int resist;
    public String habilidadeEspecial;

    public  Criatura(String nomes, int custoMana, int dano, int resist, String habilidadeEspecial){
        super(nomes, custoMana);
        this.dano = dano;
        this.resist= resist;
    }
    
    public int getDano() {
        return this.dano;
    }

    public int ataque(int dano, int resist) {
        // Se o dano recebido for maior que a resistência, a criatura é destruída
        if (dano >= resist) {
            return 0; // Criatura destruída
            board.remove(carta);
            cemiterio.add(carta);
        } else {
            return resist - dano; // Vida restante
        }
    }
    
    public String getHabilidade(){
        return this.habilidadeEspecial;
    }
}
