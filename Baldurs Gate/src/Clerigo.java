// Classe Clérigo (herda de Personagem)
public class Clerigo extends Personagem {
    private String divindade; // Divindade do Clérigo, como Selûne, Shar, Lathander
    public Clerigo(Personagem personagem) {
        super(personagem.nome, personagem.raca, personagem.vidaMax + 20, personagem.manaMax + 30);
        this.divindade = "Selûne";
        this.habilidades.add("Curar Ferimentos (10 mana)");
        this.habilidades.add("Proteção Divina (15 mana)");
    }

    // Métodos específicos de classe
    public void curar() {
        if (mana >= 10) {
            mana -= 10;
            vida = Math.min(vida + 25, vidaMax);
            System.out.println(nome + " invoca a luz de " + divindade + " para curar!");
        } else {
            System.out.println("Mana insuficiente para curar!");
        }
    }

    // Sobrescritas
    @Override
    public void atacar() {
        System.out.println(nome + " conjura o símbolo sagrado de " + divindade + "!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("símbolo")) {
            System.out.println(nome + " canaliza " + divindade + " através do símbolo sagrado!");
        } else {
            super.atacar(arma);
        }
    }

    public String getDivindade() {
        return divindade;
    }
}