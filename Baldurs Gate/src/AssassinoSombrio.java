// Subclasse Assassino Sombrio (herda de Assassino)
public class AssassinoSombrio extends Assassino {
    private int sombras; // Cargas da habilidade Dança das Sombras

    public AssassinoSombrio(Assassino assassino) {
        super(assassino);
        this.sombras = 2; // Inicia com 2 cargas
        this.habilidades.add("Dança das Sombras (2 cargas)");
    }

    // Método único de subclasse
    public void dancarSombras() {
        if (sombras > 0) {
            sombras--;
            System.out.println(nome + " desaparece nas sombras e ataca de surpresa!");
        } else {
            System.out.println(nome + " está visível demais para usar a Dança das Sombras!");
        }
    }

    // Sobrescrita
    @Override
    public void ataqueFurtivo() {
        if (sombras > 0) {
            sombras--;
            System.out.println(nome + " usa as sombras para um ataque furtivo devastador! (Sombras restantes: " + sombras + ")");
        } else {
            System.out.println(nome + " precisa se esconder melhor antes de atacar furtivamente!");
        }
    }

    public int getSombras() {
        return sombras;
    }
}
