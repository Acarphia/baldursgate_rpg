// Subclasse Bardo do Colegio da Sabedoria (herda de Bardo)
public class BardoColegioSabedoria extends Bardo {
    private int inspiracaoSuperior; // Habilidade que pode ser usada por descanso
    public BardoColegioSabedoria(Bardo bardo) {
        super(bardo);
        this.inspiracaoSuperior = 1; // Inicia com 1 carga
        this.habilidades.add("Palavra Cortante (15 mana)");
        this.habilidades.add("Inspiração Superior (1 carga)");
    }

    // Método único de subclasse
    public void cortantePalavra() {
        if (mana >= 15) {
            mana -= 15;
            System.out.println(nome + " usa Palavra Cortante, desestabilizando o inimigo e reduzindo seu próximo ataque em 50%!");
        } else {
            System.out.println(nome + " gagueja! (Sem mana para Palavra Cortante)");
        }
    }

    // Sobrescrita
    @Override
    public void inspirar() {
        if (inspiracaoSuperior > 0) {
            inspiracaoSuperior--;
            System.out.println(nome + " usa inspiração superior! Todos os aliados ganham +3 em ataques e defesa até o próximo descanso.");
        } else {
            System.out.println(nome + " está rouco! (Sem cargas de inspiração superior)");
        }
    }

    public int getInspiracaoSuperior() {
        return inspiracaoSuperior;
    }
}
