package modificadores;

public class CriarHabilidades extends Habilidade {
    public CriarHabilidades(String nomes, int custoMana, int dano, int resist, String habilidadeEspecial) {
		super(nomes, custoMana, dano, resist, habilidadeEspecial);
		
	}
    public void aplicarHabilidade(String habilidade) {
        switch (habilidade.toLowerCase()) {
            case "telepatia":
                telepatia();
                break;
            case "forca bruta":
                forcaBruta();
                break;
            case "evolucao":
                evolucao();
                break;
            case "fogo intenso":
                fogoIntenso();
                break;
            case "resistencia":
                resistencia();
                break;
            case "sono":
                sono();
                break;
            case "sombra":
                sombra();
                break;
            case "defesa":
                defesa();
                break;
            case "imunidade":
                imunidade();
                break;
            case "navegacao":
                navegacao();
                break;
            case "agilidade":
                agilidade();
                break;
            case "voo rapido":
                vooRapido();
                break;
            case "protecao psiquica":
                protecaoPsiquica();
                break;
            case "aura":
                aura();
                break;
            case "causar medo":
                causarMedo();
                break;
            case "defesa robusta":
                defesaRobusta();
                break;
            case "furia":
                furia();
                break;
            case "agilidade natural":
                agilidadeNatural();
                break;
            case "raiva":
                raiva();
                break;
            case "furia do mar":
                furiaDoMar();
                break;
            case "libero":
                libero();
                break;
            case "escudo noturno":
                escudoNoturno();
                break;
            case "desgaste":
                desgaste();
                break;
            case "ilusao":
                ilusao();
                break;
            case "intimidacao":
                intimidacao();
                break;
            case "espinhos":
                espinhos();
                break;
            default:
                System.out.println("Habilidade não encontrada: " + habilidade);
        }
    }
}
