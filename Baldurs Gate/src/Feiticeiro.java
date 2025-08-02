public class Feiticeiro extends Personagem {
    public Feiticeiro(Personagem personagem) {
        super(personagem.getNome(), personagem.getRaca(), personagem.getVidaMax() + 5, personagem.getManaMax() + 40);
        this.habilidades.add("Conjurar Raio de Caos (15 mana)");
        this.habilidades.add("Ataque Mágico (5 mana)");
    }

    public void conjurarRaioCaos() {
        if (mana >= 15) {
            mana -= 15;
            System.out.println(nome + " conjura um poderoso Raio de Caos!");
        } else {
            System.out.println(nome + " não tem mana suficiente para conjurar Raio de Caos!");
        }
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara um ataque mágico!");
    }

    public int getMana() {
        return mana;
    }
}
