public class Assassino extends Personagem {
    private int furtividade;

    public Assassino(Personagem personagem) {
        super(personagem.getNome(), personagem.getRaca(), personagem.getVidaMax() + 10, personagem.getManaMax() + 20);
        this.furtividade = 3;
        this.habilidades.add("Ataque Furtivo (1 carga)");
        this.habilidades.add("Veneno Mortal (10 mana)");
    }

    public void ataqueFurtivo() {
        if (furtividade > 0) {
            furtividade--;
            System.out.println(nome + " realiza um ataque furtivo mortal! (Cargas restantes: " + furtividade + ")");
        } else {
            System.out.println(nome + " não pode realizar ataque furtivo agora!");
        }
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca silenciosamente com a adaga!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("adaga")) {
            System.out.println(nome + " apunhala o inimigo com a adaga!");
        } else {
            super.atacar(arma);
        }
    }

    public int getFurtividade() {
        return furtividade;
    }
}
