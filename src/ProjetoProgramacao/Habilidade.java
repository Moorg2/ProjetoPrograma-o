package src.ProjetoProgramacao;

public class Habilidade extends Criatura{

	
	public Habilidade(String nomes, int custoMana, int dano, int resist, String habilidadeEspecial) {
		super(nomes, custoMana, dano, resist, habilidadeEspecial);
		
	}

	public void telepatia() {
	    setDano(getDano() + 2);
	    setResist(getResist() + 1);
	}

	public void forcaBruta() {
	    setDano(getDano() + 3);
	    setResist(getResist() - 1);
	}

	public void evolucao() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 1);
	}

	public void fogoIntenso() {
	    setDano(getDano() + 2);
	    setResist(getResist() - 1);
	}

	public void resistencia() {
	    setResist(getResist() + 2);
	}

	public void sono() {
	    setResist(getResist() + 3);
	    setDano(getDano() - 1);
	}

	public void sombra() {
	    setDano(getDano() + 2);
	    setResist(getResist() + 1);
	}

	public void defesa() {
	    setResist(getResist() + 3);
	}

	public void imunidade() {
	    setResist(getResist() + 4);
	}

	public void navegacao() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 1);
	}

	public void agilidade() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 1);
	}

	public void vooRapido() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 2);
	}

	public void protecaoPsiquica() {
	    setResist(getResist() + 3);
	}

	public void aura() {
	    setDano(getDano() + 2);
	    setResist(getResist() + 1);
	}

	public void causarMedo() {
	    setDano(getDano() + 2);
	    setResist(getResist() - 1);
	}

	public void defesaRobusta() {
	    setResist(getResist() + 4);
	}

	public void furia() {
	    setDano(getDano() + 3);
	}

	public void agilidadeNatural() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 1);
	}

	public void raiva() {
	    setDano(getDano() + 3);
	    setResist(getResist() - 2);
	}

	public void furiaDoMar() {
	    setDano(getDano() + 2);
	    setResist(getResist() + 1);
	}

	public void libero() {
	    setDano(getDano() + 2);
	}

	public void escudoNoturno() {
	    setResist(getResist() + 3);
	}

	public void desgaste() {
	    setDano(getDano() + 1);
	    setResist(getResist() - 1);
	}

	public void ilusao() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 2);
	}

	public void intimidacao() {
	    setDano(getDano() + 1);
	    setResist(getResist() + 1);
	}

	public void espinhos() {
	    setResist(getResist() + 2);
	}

		public int getDano() {
			return this.dano;
	}

	public void setDano(int dano) {
	    this.dano = dano;
	}

	public int getResist() {
	    return this.resist;
	}

	public void setResist(int resist) {
	    this.resist = resist;
	}


}
