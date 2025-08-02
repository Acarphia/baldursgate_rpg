public class AssassinoSombrio extends Assassino {
    private int sombras;

    public AssassinoSombrio(Assassino assassino) {
        super(assassino);
        this.sombras = 2;
        this.habilidades.add("Dança das Sombras (2 cargas)");
    }

    public void dancarSombras() {
        if (sombras > 0) {
            sombras--;
            System.out.println(nome + " desaparece nas sombras e ataca de surpresa!");
        } else {
            System.out.println(nome + " está visível demais para usar a dança das sombras!");
        }
    }

    public int getSombras() {
        return sombras;
    }
}
