// Subclasse Mago Evocador (herda de Mago)
public class MagoEvocador extends Mago {
    private int evocacoes; // Cargas da habilidade Evocar Elemental

    public MagoEvocador(Mago mago) {
        super(mago);
        this.evocacoes = 2; // Inicia com 2 cargas
        this.habilidades.add("Evocar Elemental (2 cargas)");
    }

    // Método único da subclasse
    public void evocarElemental() {
        if (evocacoes > 0) {
            evocacoes--;
            System.out.println(nome + " evoca um elemental para a batalha!");
        } else {
            System.out.println(nome + " não tem evocação suficiente!");
        }
    }

    // Sobrescrita
    @Override
    public void lancarMisseis() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(nome + " lança mísseis mágicos com poder redobrado!");
        } else {
            System.out.println(nome + " não tem mana suficiente para lançar mísseis!");
        }
    }

    public int getEvocacoes() {
        return evocacoes;
    }
}
