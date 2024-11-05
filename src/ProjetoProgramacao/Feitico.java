package src.ProjetoProgramacao;

public class Feitico extends Cartas {

    private String efeito;

    public Feitico( String nomes, int custoMana, String efeito){
        super(nomes, custoMana);
        this.efeito = efeito;
    }
    public String getEfeito(){
        return this.efeito;
    }
}    






