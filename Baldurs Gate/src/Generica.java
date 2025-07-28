// Classe [NomeDaClasse] (herda de Personagem)
public class [NomeDaClasse] extends Personagem {
    // Atributo UNICO desta classe, perguntar pra mim ou "Chat GPT qual o atributo da classe [NomeDaClasse] em Baldurs Gate 3?
    private [tipo] [atributoEspecial];
    public [NomeDaClasse](Personagem personagem) {
        super(personagem.nome, personagem.raca,
                personagem.vidaMax + [X], // Ajuste de vida, exemplo, Bardos ganham muita mana mas não tanta vida
                personagem.manaMax + [Y]);// Ajuste de mana
        this.[atributoEspecial] = [valorInicial]; // Inspiração dos bardos são 3 cargas
        // Habilidades ESPECÍFICAS, no mínimo 2
        this.habilidades.add("[Habilidade 1] ([custo] mana/carga)");
        this.habilidades.add("[Habilidade 2] ([custo] mana/carga)");
    }

    // Métodos específicos de classe
    public void [metodoUnico]() {
        if ([atributoEspecial] > 0) {
            [atributoEspecial]--;
            System.out.println(nome + " [descrição do efeito]! (Recurso restante: " + [atributoEspecial] + ")");
        } else {
            System.out.println(nome + " [mensagem de erro temática]!");
        }
    }

    // Sobrescirtas, no mínimo 2
    @Override
    public void atacar() {
        System.out.println(nome + " [descrição do ataque padrão]!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("[arma temática]")) {
            System.out.println(nome + " [descrição do ataque especial]!");
        } else {
            super.atacar(arma);
        }
    }

    // Para mostrar o atributo especial
    public [tipo] get[AtributoEspecial]() {
        return [atributoEspecial];
    }
}
