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

    public void aplicarEfeito(){
        if (getEfeito().equals(/* nome efeito base 1 */)){
            /*aplica efeito 1 */
        } else if (getEfeito().equals(/*nome efeito base 2 */)){
            /*aplica efeito 2 */
        } else if (getEfeito().equals(/*nome efeito base 3 */)){
             /*aplica efeito 2 */
        }

        }
}  







