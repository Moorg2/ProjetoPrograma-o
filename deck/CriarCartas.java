package deck;

import individuos.Criatura;
import src.ProjetoProgramacao.Encantamento;
import src.ProjetoProgramacao.Feitico;

public class CriarCartas extends Criatura {
public CriarCartas(String nomes, int custoMana, int dano, int resist, String habilidadeEspecial) {
		super(nomes, custoMana, dano, resist, habilidadeEspecial);
		// TODO Auto-generated constructor stub
	}
// Criaturas
public static Criatura criarCriatura(String nome) {
    switch (nome) {
        case "Pikachu":
            return new Criatura("Pikachu", 3, 10, 6, "Rapidez");
        case "Charizard":
            return new Criatura("Charizard", 5, 15, 10, "Fogo Intenso");
        case "Bulbasaur":
            return new Criatura("Bulbasaur", 2, 8, 5, "Provocar");
        case "Squirtle":
            return new Criatura("Squirtle", 3, 7, 8, "Resistência");
        case "Jigglypuff":
            return new Criatura("Jigglypuff", 2, 5, 4, "Sono");
        case "Gengar":
            return new Criatura("Gengar", 4, 12, 7, "Sombra");
        case "Machamp":
            return new Criatura("Machamp", 5, 14, 12, "Força Bruta");
        case "Alakazam":
            return new Criatura("Alakazam", 4, 11, 6, "Telepatia");
        case "Onix":
            return new Criatura("Onix", 4, 9, 14, "Defesa");
        case "Eevee":
            return new Criatura("Eevee", 2, 6, 5, "Evolução");
        case "Snorlax":
            return new Criatura("Snorlax", 6, 18, 15, "Imunidade");
        case "Mewtwo":
            return new Criatura("Mewtwo", 7, 20, 10, "Poder Psíquico");
        case "Lapras":
            return new Criatura("Lapras", 5, 11, 9, "Navegação");
        case "Scyther":
            return new Criatura("Scyther", 4, 13, 5, "Agilidade");
        case "Dragonite":
            return new Criatura("Dragonite", 6, 16, 14, "Voo Rápido");
            case "Gardevoir":
            return new Criatura("Gardevoir", 5, 13, 8, "Proteção Psíquica");
        case "Lucario":
            return new Criatura("Lucario", 4, 12, 9, "Aura");
        case "Tyranitar":
            return new Criatura("Tyranitar", 6, 16, 14, "Causar Medo");
        case "Metagross":
            return new Criatura("Metagross", 5, 14, 12, "Defesa Robusta");
        case "Zygarde":
            return new Criatura("Zygarde", 7, 18, 15, "Forma Ideal");
        case "Rayquaza":
            return new Criatura("Rayquaza", 8, 20, 12, "Fúria");
        case "Sceptile":
            return new Criatura("Sceptile", 4, 11, 7, "Agilidade Natural");
        case "Gyarados":
            return new Criatura("Gyarados", 6, 17, 10, "Raiva");
        case "Kingdra":
            return new Criatura("Kingdra", 5, 15, 9, "Fúria do Mar");
        case "Cinderace":
            return new Criatura("Gardevoir", 5, 13, 8, "libero");
        case "Umbreon":
            return new Criatura("Umbreon", 3, 10, 12, "Escudo Noturno");
        case "Mimikyu":
            return new Criatura("Mimikyu", 3, 9, 6, "Desgaste");
        case "Ninetales":
            return new Criatura("Ninetales", 4, 12, 8, "Ilusão");
        case "Scrafty":
            return new Criatura("Scrafty", 4, 11, 10, "Intimidação");
        case "Ferrothorn":
            return new Criatura("Ferrothorn", 5, 10, 15, "Espinhos");
            default:
            throw new IllegalArgumentException("Criatura desconhecida: " + nome);
    }
}
// Feitiços
public static Feitico criarFeitico(String nome) {
    switch (nome) {
        case "Raio":
            return new Feitico("Raio", 2, "Causa 5 de dano a uma criatura ou jogador.");
        case "Cura":
            return new Feitico("Cura", 3, "Restaura 10 de vida.");
        case "Explosão":
            return new Feitico("Explosão", 4, "Causa 8 de dano a todas as criaturas.");
        case "Fogo Fátuo":
            return new Feitico("Fogo Fátuo", 3, "Causa 6 de dano ao oponente.");
        case "Gelo":
            return new Feitico("Gelo", 2, "Congela uma criatura por um turno.");
        case "Relâmpago":
            return new Feitico("Relâmpago", 5, "Causa 12 de dano a um alvo.");
        case "Escudo Mágico":
            return new Feitico("Escudo Mágico", 3, "Previne 10 de dano de uma fonte.");
        case "Maldicão":
            return new Feitico("Maldicão", 4, "Causa 4 de dano e reduz a resistência.");
        case "Invisibilidade":
            return new Feitico("Invisibilidade", 3, "Evita que a criatura seja alvo por um turno.");
        case "Tempestade":
            return new Feitico("Tempestade", 6, "Causa 10 de dano a todas as criaturas.");
        case "Drenar Vida":
            return new Feitico("Drenar Vida", 5, "Causa 8 de dano e recupera 4 de vida.");
        case "Aumentar Poder":
            return new Feitico("Aumentar Poder", 2, "Aumenta o dano de uma criatura em 4.");
        case "Destruição":
            return new Feitico("Destruição", 5, "Remove uma criatura do campo de batalha.");
        case "Revitalizar":
            return new Feitico("Revitalizar", 4, "Restaura 15 de vida a um jogador.");
        case "Chuva de Meteoros":
            return new Feitico("Chuva de Meteoros", 6, "Causa 15 de dano a todas as criaturas.");
            case "Ciclone":
            return new Feitico("Ciclone", 4, "Causa 8 de dano e empurra criaturas.");
        case "Selo":
            return new Feitico("Selo", 3, "Impeça uma criatura de atacar.");
        case "Poder do Dragão":
            return new Feitico("Poder do Dragão", 5, "Causa 10 de dano e aumenta o ataque de uma criatura.");
        case "Regeneração":
            return new Feitico("Regeneração", 4, "Restaura 15 de vida a uma criatura.");
        case "Ferro":
            return new Feitico("Ferro", 3, "Aumenta a resistência de uma criatura em 5.");
        case "Chuva de Fogo":
            return new Feitico("Chuva de Fogo", 6, "Causa 20 de dano a um jogador.");
        case "Iluminação":
            return new Feitico("Iluminação", 2, "Revela as cartas do oponente.");
        case "Decaimento":
            return new Feitico("Destruição", 4, "Remove uma criatura e causa 5 de dano ao jogador.");
        case "Paralisia":
            return new Feitico("Paralisia", 3, "Paralisa uma criatura por dois turnos.");
        case "Caminho da Luz":
            return new Feitico("Caminho da Luz", 5, "Restaura 20 de vida ao jogador.");
        case "Sussurros":
            return new Feitico("Sussurros", 4, "Diminui o ataque de uma criatura em 3.");
        case "Meteoro":
            return new Feitico("Meteoro", 6, "Causa 15 de dano a todas as criaturas no campo.");
        case "Cura em Massa":
            return new Feitico("Cura em Massa", 5, "Restaura 10 de vida a todas as criaturas.");
        case "Confusão":
            return new Feitico("Confusão", 3, "Desorganiza o deck do oponente.");
        case "Poder da Terra":
            return new Feitico("Poder da Terra", 4, "Aumenta a defesa do jogador em 5.");
        default:
            throw new IllegalArgumentException("Feitico desconhecido: " + nome);
    }
}
// Encantamentos
public static Encantamento criarEncantamento(String nome) {
    switch (nome) {
        case "Buff de Ataque":
            return new Encantamento("Buff de Ataque", 4, "Aumenta o poder de criaturas em 2.");
        case "Diminuição de Defesa":
            return new Encantamento("Diminuição de Defesa", 4, "Diminui a resistência de criaturas em 2.");
        case "Aumentar Mana":
            return new Encantamento("Aumentar Mana", 5, "Ganha 1 mana adicional por turno.");
        case "Fortaleza":
            return new Encantamento("Fortaleza", 4, "Aumenta a resistência de criaturas em 3.");
        case "Iluminação":
            return new Encantamento("Iluminação", 3, "Revela cartas do oponente.");
        case "Proteção":
            return new Encantamento("Proteção", 3, "Imune a dano por 1 turno.");
        case "Roubo de Poder":
            return new Encantamento("Roubo de Poder", 5, "Rouba 3 de poder de uma criatura.");
        case "Velocidade":
            return new Encantamento("Velocidade", 4, "As criaturas podem atacar no turno em que entram.");
        case "Aumentar Defesa":
            return new Encantamento("Aumentar Defesa", 4, "Aumenta a resistência de criaturas em 2.");
        case "Silêncio":
            return new Encantamento("Silêncio", 3, "Impedir o uso de habilidades especiais.");
        case "Tempo Congelado":
            return new Encantamento("Tempo Congelado", 6, "Impedir o oponente de jogar cartas por 1 turno.");
        case "Recuperação Rápida":
            return new Encantamento("Recuperação Rápida", 4, "Recupera 5 de vida a cada turno.");
        case "Bênção":
            return new Encantamento("Bênção", 5, "Aumenta a vida máxima do jogador em 5.");
        case "Sombra":
            return new Encantamento("Sombra", 4, "Causa 2 de dano a cada turno ao oponente.");
        case "Esperança":
            return new Encantamento("Esperança", 2, "Aumenta a probabilidade de comprar cartas.");
            case "Fortificação":
            return new Encantamento("Fortificação", 5, "Aumenta a resistência de todas as criaturas em 3.");
        case "Dreno de Vida":
            return new Encantamento("Dreno de Vida", 4, "Restaura 2 de vida a cada turno.");
        case "Escudo de Pedra":
            return new Encantamento("Escudo de Pedra", 5, "Reduz todo dano recebido em 2.");
        case "Visão":
            return new Encantamento("Visão", 3, "Revele as duas próximas cartas do deck.");
        case "Ciclo do Tempo":
            return new Encantamento("Ciclo do Tempo", 6, "Permite ao jogador jogar uma carta extra por turno.");
        case "Aura Protetora":
            return new Encantamento("Aura Protetora", 4, "Imune a efeitos de feitiços.");
        case "Chama Eterna":
            return new Encantamento("Chama Eterna", 5, "Causa 1 de dano ao oponente a cada turno.");
        case "Dança das Sombras":
            return new Encantamento("Dança das Sombras", 4, "Permite mover uma criatura de volta para a mão.");
        case "Ecos do Passado":
            return new Encantamento("Ecos do Passado", 5, "Recupera uma carta do cemitério.");
        case "Tempestade Eletromagnética":
            return new Encantamento("Tempestade Eletromagnética", 6, "Causa 3 de dano a cada criatura do oponente.");
        case "Ressurgência":
            return new Encantamento("Ressurgência", 4, "Reanima uma criatura destruída.");
        case "Proteção de Fogo":
            return new Encantamento("Proteção de Fogo", 3, "Aumenta a resistência contra dano de fogo.");
        case "Sussurros da Floresta":
            return new Encantamento("Sussurros da Floresta", 5, "Aumenta o poder de criaturas de tipo planta.");
        case "Ilusão":
            return new Encantamento("Ilusão", 4, "Impeça o oponente de ver sua mão.");
        case "Espírito Guardião":
            return new Encantamento("Espírito Guardião", 6, "Aumenta a vida máxima em 10.");
        case "Caminho Secreto":
            return new Encantamento("Caminho Secreto", 5, "Permite ignorar efeitos de dano.");
        default:
            throw new IllegalArgumentException("Encantamento desconhecido: " + nome);
}
}
}









