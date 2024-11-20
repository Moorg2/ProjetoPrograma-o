package modificadores;

import deck.Carta;

public class Encantamento extends Carta {

    public String encantar;

    public Encantamento( String nomes, int custoMana, String encantar){
        super(nomes, custoMana);
        this.encantar = encantar;
    }
    public String getEncantamento(){
        return this.encantar;
    }
    
    public void aplicarEncantamento(){
        if (getEncantamento().equals(/* nome Encantamento base 1 */)){
            /*aplica Encantamento 1 */
        } else if (getEncantamento().equals(/*nome Encantamento base 2 */)){
            /*aplica Encantamento 2 */
        } else if (getEncantamento().equals(/*nome Encantamento base 3 */)){
             /*aplica Encantamento 2 */
        }
}
