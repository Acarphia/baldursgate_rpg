// Classe Bardo (herda de Personagem)
public class Bardo extends Personagem {
    private int inspiracao;  // Habilidade que pode ser usada por descanso
    public Bardo(Personagem personagem) {
        super(personagem.nome, personagem.raca, personagem.vidaMax + 10, personagem.manaMax + 20);
        this.inspiracao = 3;
        this.habilidades.add("Inspirar Aliados (1 carga)");
        this.habilidades.add("Canção de Batalha (5 mana)");
    }

    // Métodos específicos de classe
    public void inspirar() {
        if (inspiracao > 0) {
            inspiracao--;
            System.out.println(nome + " inspira aliados com sua voz! (Cargas restantes: " + inspiracao + ")");
        } else {
            System.out.println(nome + " está rouco! (Sem cargas de inspiração)");
        }
    }

    // Sobrescritas
    @Override
    public void atacar() {
        System.out.println(nome + " toda os acordes dissonantes do alaúde!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("alaúde")) {
            System.out.println(nome + " canta um agudo estridente que estilhaça vidros e ouvidos!");
        } else {
            super.atacar(arma);
        }
    }

    public int getInspiracao() {
        return inspiracao;
    }
}