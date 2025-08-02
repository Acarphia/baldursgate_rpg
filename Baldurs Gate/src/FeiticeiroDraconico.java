public class FeiticeiroDraconico extends Feiticeiro {
    private int cargasDraconicas;

    public FeiticeiroDraconico(Feiticeiro feiticeiro) {
        super(feiticeiro);
        this.cargasDraconicas = 1;
        this.habilidades.add("Sopro Dracônico (1 carga)");
    }

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

    public int getCargasDraconicas() {
        return cargasDraconicas;
    }
}
