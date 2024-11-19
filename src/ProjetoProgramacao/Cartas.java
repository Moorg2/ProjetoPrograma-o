package src.ProjetoProgramacao;

abstract class Carta extends Exception {

    public String nome;
    public int custoMana;

    public Carta(String nome, int custoMana) {
        this.nome = nome;
        this.custoMana = custoMana;
    }
    
    public int getcustoMana(){
        return this.custoMana;
    }

   public void jogada() {
	   if(getcustoMana()< this.custoMana) {
		   try {
            throw new ManaInsuficienteException("Você não tem mana suficiente para jogar a carta"+ getNome());
        } catch (ManaInsuficienteException e) {
            e.printStackTrace();
        }
	   } 
   }
    
   public void setNome(String nome) {
       this.nome = nome;
   }
   
   public String getNome() {
       return this.nome;
   }
}
