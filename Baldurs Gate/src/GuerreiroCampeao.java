public class GuerreiroCampeão extends Guerreiro {
    private int golpesCriticos;

    public GuerreiroCampeão(Guerreiro guerreiro) {
        super(guerreiro);
        this.golpesCriticos = 1;
        this.habilidades.add("Golpe Crítico (1 carga)");
    }

    public void usarGolpeCritico() {
        if (golpesCriticos > 0) {
            golpesCriticos--;
            System.out.println(nome + " executa um golpe crítico devastador!");
        } else {
            System.out.println(nome + " não tem golpes críticos restantes!");
        }
    }

    public int getGolpesCriticos() {
        return golpesCriticos;
    }
}
