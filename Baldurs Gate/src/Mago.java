// Classe Mago (herda de Personagem)
public class Mago extends Personagem {
    private int livrosMagicos; // Quantidade de grimórios mágicos

    public Mago(Personagem personagem) {
        super(personagem.nome, personagem.raca, personagem.vidaMax + 5, personagem.manaMax + 50);
        this.livrosMagicos = 1; // Inicia com 1 grimório
        this.habilidades.add("Lançar Mísseis Mágicos (10 mana)");
        this.habilidades.add("Barreira Arcana (15 mana)");
    }

    // Métodos específicos de classe
    public void lancarMisseis() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(nome + " lança mísseis mágicos com precisão arcana!");
        } else {
            System.out.println(nome + " não tem mana suficiente para lançar mísseis!");
        }
    }

    public void barreiraArcana() {
        if (mana >= 15) {
            mana -= 15;
            System.out.println(nome + " ergue uma barreira arcana protetora!");
        } else {
            System.out.println(nome + " falha ao conjurar a barreira (mana insuficiente)!");
        }
    }

    // Sobrescritas
    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma rajada de energia arcana!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("cajado")) {
            System.out.println(nome + " canaliza magia através do cajado!");
        } else {
            super.atacar(arma);
        }
    }

    public int getLivros() {
        return livrosMagicos;
    }
}
