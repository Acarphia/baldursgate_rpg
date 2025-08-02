public class FeiticeiroDraconico extends Feiticeiro {
    public FeiticeiroDraconico(Feiticeiro feiticeiro) {
        super(feiticeiro);
        this.habilidades.add("Sopro Dracônico (1 carga)");
    }

    public void usarSoproDraconico() {
        if (mana >= 20) {
            mana -= 20;
            System.out.println(nome + " libera um devastador sopro dracônico!");
        } else {
            System.out.println(nome + " não tem mana suficiente para usar o sopro dracônico!");
        }
    }
}
