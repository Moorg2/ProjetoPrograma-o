package individuos;


import deck.Carta;
import ProjetoProgramacao.JogoDeCartas;


public class Criatura extends Carta {
    private int dano;
    private int resist;
    private String habilidade; 

    public Criatura(String nome, int custoMana, int dano, int resist, String habilidade) {
        super(nome, custoMana);
        this.dano = dano;
        this.resist = resist;
        this.habilidade = habilidade;
    }

    public int getDano() {
        return this.dano;
    }

    public int getResist() {
        return this.resist;
    }

    public void setResist(int resist) {
        this.resist = resist;
    }

    public String getHabilidade() {
        return this.habilidade;
    }

    public class Habilidade {
        
    }
    		public void executarHabilidade(int indice) {
    	        switch (indice) {
    	            case 0:
    	                this.dano = dano++;
    	                System.out.println("Queimadura!");
    	                break;
    	                
    	            case 1:
    	            	System.out.println("Medo!");
    	            	this.resist = resist--;
    	            	break;
    	            	
    	            case 2:
    	                System.out.println("Final dance!");
    	                if (this.resist <= 5) {
    	                    this.dano *= 1.2; // Aumenta o dano em 20%
    	                }
    	                break;
    	                public void escolhaHabilidade() {
    	                    
    	                    switch (habilidade) {
    	                        case 0:
    	                           
    	                            executarHabilidade(0);
    	                            break;
    	                        case 1:
    	                            
    	                            executarHabilidade(1);
    	                            break;
    	                        case 2:
    	                            
    	                            executarHabilidade(2);
    	                            break;
    	                        default:
    	                            System.out.println("Habilidade inválida.");
    	                    }
    	                }
    	        		}
    	        		
    	        	}
    	        }
    	        
    	        }
    	            	
    	     
    	            	
    	            	
    	            	
    	}
    	
    	
    
    
    
   

    public void ataque(Criatura outraCriatura) {
        System.out.println(getNome() + " está atacando " + outraCriatura.getNome());

        // Reduz a resistência de ambas as criaturas
        outraCriatura.setResist(outraCriatura.getResist() - this.dano);
        this.setResist(this.resist - outraCriatura.getDano());

        // Verifica se a criatura atacada foi destruída
        if (outraCriatura.getResist() <= 0) {
            System.out.println(outraCriatura.getNome() + " foi destruída!");
            JogoDeCartas.board.remove(outraCriatura); // Remove do tabuleiro
            Jogador.cemiterio.add(outraCriatura); // Adiciona ao cemitério
        }

        // Verifica se a criatura atacante foi destruída
        if (this.getResist() <= 0) {
            System.out.println(this.getNome() + " foi destruída!");
            JogoDeCartas.board.remove(this); // Remove do tabuleiro
            Jogador.cemiterio.add(this); // Adiciona ao cemitério
        }
    }
}