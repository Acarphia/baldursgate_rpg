import java.util.ArrayList;

public class Guerreiro extends Personagem {
    private int furia;

    public Guerreiro(Personagem personagem) {
        super(personagem.getNome(), personagem.getRaca(), personagem.getVidaMax() + 20, personagem.getManaMax() + 10);
        this.furia = 3;
        this.habilidades.add("Fúria (1 carga)");
        this.habilidades.add("Ataque Poderoso (10 mana)");
    }

    public void usarFuria() {
        if (furia > 0) {
            furia--;
            System.out.println(nome + " entra em fúria, aumentando o dano causado! (Cargas restantes: " + furia + ")");
        } else {
            System.out.println(nome + " está cansado e não pode usar fúria!");
        }
    }

    @Override
    public void atacar() {
        System.out.println(nome + " desfere um golpe poderoso com a espada!");
    }

    @Override
    public void atacar(String arma) {
        if (arma.equalsIgnoreCase("espada")) {
            System.out.println(nome + " golpeia com a espada flamejante!");
        } else {
            super.atacar(arma);
        }
    }

    public int getFuria() {
        return furia;
    }
}
