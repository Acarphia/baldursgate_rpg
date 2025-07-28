//Subclasse Clerigo do Dominio da Luz (herda de Clerigo)
public class ClerigoDominioLuz extends Clerigo {
    private int chamaSagrada; // Cargas de Chama Sagrada

    public ClerigoDominioLuz(Clerigo clerigo) {
        super(clerigo);
        this.chamaSagrada = 1;
        this.habilidades.add("Chama Sagrada (1 carga)");
        this.habilidades.add("Curar com Luz (10 mana)");
    }

    // Método único de subclasse
    public void invocarChamaSagrada() {
        if (chamaSagrada > 0) {
            chamaSagrada--;
            System.out.println(nome + " invoca a Chama Sagrada de " + divindade + ", queimando inimigos com luz divina!");
        } else {
            System.out.println(nome + " tenta conjurar a chama e se queima! (Sem cargas de chama sagrada)");
        }
    }

    // Sobrescrita
    @Override
    public void curar() {
        if (mana >= 10) {
            mana -= 10;
            vida = Math.min(vida + 30, vidaMax); // Cura melhorada (+30)
            System.out.println(nome + " canaliza a luz de " + divindade + ", curando ferimentos com brilho intenso!");
        } else {
            System.out.println("A luz se apaga sem que o ferimento se cure! (Sem mana para curar com luz)");
        }
    }
}
