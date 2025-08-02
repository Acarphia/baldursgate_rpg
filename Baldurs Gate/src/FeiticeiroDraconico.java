// Subclasse Feiticeiro Dracônico (herda de Feiticeiro)
public class FeiticeiroDraconico extends Feiticeiro {
    private int cargasDraconicas; // Cargas do Sopro Dracônico

    public FeiticeiroDraconico(Feiticeiro feiticeiro) {
        super(feiticeiro);
        this.cargasDraconicas = 1; // Inicia com 1 carga
        this.habilidades.add("Sopro Dracônico (1 carga)");
    }

    // Método único de subclasse
    public void usarSoproDraconico() {
        if (cargasDraconicas > 0 && mana >= 20) {
            cargasDraconicas--;
            mana -= 20;
            System.out.println(nome + " libera um devastador sopro dracônico!");
        } else if (mana < 20) {
            System.out.println(nome + " não tem mana suficiente para usar o sopro dracônico!");
        } else {
            System.out.println(nome + " já usou o sopro dracônico e precisa recarregar!");
        }
    }

    // Sobrescrita
    @Override
    public void conjurarRaioCaos() {
        if (cargasDraconicas > 0 && mana >= 15) {
            cargasDraconicas--;
            mana -= 15;
            System.out.println(nome + " conjura um Raio de Caos dracônico poderoso!");
        } else if (mana < 15) {
            System.out.println(nome + " não tem mana suficiente para conjurar o Raio de Caos dracônico!");
        } else {
            System.out.println(nome + " já usou o Raio de Caos dracônico e precisa recarregar!");
        }
    }

    public int getCargasDraconicas() {
        return cargasDraconicas;
    }
}

