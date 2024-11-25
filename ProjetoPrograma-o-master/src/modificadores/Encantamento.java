package modificadores;

import deck.Carta;

public class Encantamento extends Carta {

    public String encantamento;

    public Encantamento( String nomes, int custoMana, String encantamento){
        super(nomes, custoMana);
        this.encantamento = encantamento;
    }
    public String getEncantamento(){
        return this.encantamento;
    }
    
    public void aplicarEncantamento(){}
}
