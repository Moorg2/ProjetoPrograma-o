package modificadores;

import deck.Carta;

public class Feitico extends Carta {

    private String efeito;

    public Feitico( String nomes, int custoMana, String efeito){
        super(nomes, custoMana);
        this.efeito = efeito;
    }
    public String getEfeito(){
        return this.efeito;
    }

}








