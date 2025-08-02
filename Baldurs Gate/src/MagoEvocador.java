public class MagoEvocador extends Mago {
    private int evocacoes;

    public MagoEvocador(Mago mago) {
        super(mago);
        this.evocacoes = 2;
        this.habilidades.add("Evocar Elemental (2 cargas)");
    }

    public void evocarElemental() {
        if (evocacoes > 0) {
            evocacoes--;
            System.out.println(nome + " evoca um elemental para a batalha!");
        } else {
            System.out.println(nome + " não tem evocação suficiente!");
        }
    }

    public int getEvocacoes() {
        return evocacoes;
    }
}
