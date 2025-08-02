// Classe Feiticeiro (herda de Personagem)
public class Feiticeiro extends Personagem {

    public Feiticeiro(Personagem personagem) {
        super(personagem.nome, personagem.raca, personagem.vidaMax + 5, personagem.manaMax + 40);
        this.habilidades.add("Conjurar Raio de Caos (15 mana)");
        this.habilidades.add("Ataque Mágico (5 mana)");
    }

    // Métodos específicos de classe
    public void conjurarRaioCaos() {
        if (mana >= 15) {
            mana -= 15;
            System.out.println(nome + " conjura um poderoso Raio de Caos!");
        } else {
            System.out.println(nome + " não tem mana suficiente para conjurar Raio de Caos!");
        }
    }

    // Sobrescritas
    @Override
    public void atacar() {
        System.out.println(nome + " dispara um ataque mágico!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("varinha")) {
            System.out.println(nome + " canaliza magia pela varinha!");
        } else {
            super.atacar(arma);
        }
    }

    public int getMana() {
        return mana;
    }
}
