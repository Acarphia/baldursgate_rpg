import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Classe que gerencia atributos de todas as classes (raça, vida, mana, etc)
public class Personagem {
    // Atributos base
    private static final List<String> RACAS = Arrays.asList(
            "Humano", "Elfo", "Meio-Elfo", "Anão",
            "Tiefling", "Drow", "Gnomo", "Orc", "Draconiano"
    );
    protected String nome;
    protected String raca;
    protected int vida;
    protected int vidaMax;
    protected int mana;
    protected int manaMax;
    protected List<String> habilidades;

    // Construtor principal
    public Personagem(String nome, String raca, int vidaMax, int manaMax) {
        if (!RACAS.contains(raca)) {
            throw new IllegalArgumentException("Raça inválida! As raças permitidas são: " + RACAS);
        }

        this.nome = nome;
        this.raca = raca;
        this.vidaMax = vidaMax;
        this.vida = vidaMax;
        this.manaMax = manaMax;
        this.mana = manaMax;
        this.habilidades = new ArrayList<>();
        habilidades.add("Ataque Básico");
    }

    public static String listarRacas() {
        return String.join(", ", RACAS);
    }

    // Metodos genéricos
    public void atacar() {
        System.out.println(nome + " ataca com um golpe simples!");
    }

    // Metodo para atacar com arma
    public void atacar(String arma) {
        System.out.println(nome + " ataca com " + arma + "!");
    }

    // Metodo para recuperar mana
    public void recuperarMana(int quantidade) {
        mana = Math.min(mana + quantidade, manaMax);
        System.out.println(nome + " recuperou " + quantidade + " de mana!");
    }

    // Promoção para classes

    public Guerreiro promoverParaGuerreiro() {
        System.out.println(nome + " agora é um Guerreiro!");
        return new Guerreiro(this);
    }

    public Assassino promoverParaAssassino() {
        System.out.println(nome + " agora é um Assassino!");
        return new Assassino(this);
    }

    public Clerigo promoverParaClerigo() {
        System.out.println(nome + " agora é um Clérigo!");
        return new Clerigo(this);
    }

    public Mago promoverParaMago() {
        System.out.println(nome + " agora é um Mago!");
        return new Mago(this);
    }

    public Feiticeiro promoverParaFeiticeiro() {
        System.out.println(nome + " agora é um Feiticeiro!");
        return new Feiticeiro(this);
    }

    public Bardo promoverParaBardo() {
        System.out.println(nome + " agora é um Bardo!");
        return new Bardo(this);
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getVida() { return vida; }
    public int getMana() { return mana; }
    public int getVidaMax() { return vidaMax; }
    public int getManaMax() { return manaMax; }

}

