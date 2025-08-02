// Subclasse Guerreiro Campeão (herda de Guerreiro)
public class GuerreiroCampeão extends Guerreiro {
    private int golpesCriticos; // Cargas da habilidade Golpe Crítico

    public GuerreiroCampeão(Guerreiro guerreiro) {
        super(guerreiro);
        this.golpesCriticos = 1; // Inicia com 1 carga
        this.habilidades.add("Golpe Crítico (1 carga)");
    }

    // Método único de subclasse
    public void usarGolpeCritico() {
        if (golpesCriticos > 0) {
            golpesCriticos--;
            System.out.println(nome + " executa um golpe crítico devastador!");
        } else {
            System.out.println(nome + " não tem golpes críticos restantes!");
        }
    }

    // Sobrescrita
    @Override
    public void usarFuria() {
        if (golpesCriticos > 0) {
            golpesCriticos--;
            System.out.println(nome + " canaliza a fúria em um golpe crítico inigualável!");
        } else {
            System.out.println(nome + " tenta se enfurecer, mas não tem energia para um golpe decisivo!");
        }
    }

    public int getGolpesCriticos() {
        return golpesCriticos;
    }
}
