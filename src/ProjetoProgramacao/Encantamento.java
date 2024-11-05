package src.ProjetoProgramacao;

public class Encantamento extends Cartas {

    public String encantar;

    public Encantamento( String nomes, int custoMana, String encantar){
        super(nomes, custoMana);
        this.encantar = encantar;
    }
    public String getEncantamento(){
        return this.encantar;
    }
}
