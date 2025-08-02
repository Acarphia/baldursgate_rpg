public class Mago extends Personagem {
    private int livrosMagicos;

    public Mago(Personagem personagem) {
        super(personagem.getNome(), personagem.getRaca(), personagem.getVidaMax() + 5, personagem.getManaMax() + 50);
        this.livrosMagicos = 1;
        this.habilidades.add("Lançar Mísseis Mágicos (10 mana)");
    }

    public void lancarMisseis() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(nome + " lança mísseis mágicos!");
        } else {
            System.out.println(nome + " não tem mana suficiente para lançar mísseis!");
        }
    }

    public int getLivros() {
        return livrosMagicos;
    }
}
