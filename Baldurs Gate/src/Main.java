import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Personagem personagemAtual;

    public static void main(String[] args) {
        System.out.println("- BALDUR'S GATE 3 -");

        // Carga inicial de personagens
        Personagem cargaInicial = criarPersonagemInicial();
        personagemAtual = cargaInicial;

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    criarNovoPersonagem();
                    break;
                case 2:
                    promoverPersonagem();
                    break;
                case 3:
                    usarHabilidades();
                    break;
                case 4:
                    listarInformacoes();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    // Metodo para criar personagem inicial
    private static Personagem criarPersonagemInicial() {
        System.out.println("\nCriando personagem inicial (carga do sistema)...");
        return new Personagem("Impulso Sombrio", "Draconiano", 110, 40);
    }

    private static void exibirMenu() {
        System.out.println("\n- MENU PRINCIPAL -");
        System.out.println("1. Criar novo personagem");
        System.out.println("2. Promover personagem");
        System.out.println("3. Usar habilidades");
        System.out.println("4. Listar informações do personagem");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarNovoPersonagem() {
        System.out.println("\n- NOVO PERSONAGEM -");
        System.out.println("Raças disponíveis: " + Personagem.listarRacas());

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        personagemAtual = new Personagem(nome, raca, 100, 30);
        System.out.println("Personagem criado com sucesso!");
    }

    private static void promoverPersonagem() {
        System.out.println("\n- PROMOÇÃO -");
        System.out.println("Classes disponíveis:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Barbáro");
        System.out.println("3. Assassino");
        System.out.println("4. Clérigo");
        System.out.println("5. Mago");
        System.out.println("6. Feiticeiro");
        System.out.println("7. Bruxo");
        System.out.println("8. Bardo");
        System.out.print("Escolha uma classe: ");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        switch (escolha) {
            case 1:
                personagemAtual = personagemAtual.promoverParaGuerreiro();
                break;
            case 2:
                personagemAtual = personagemAtual.promoverParaBarbaro();
                break;
            case 3:
                personagemAtual = personagemAtual.promoverParaAssassino();
                break;
            case 4:
                personagemAtual = personagemAtual.promoverParaClerigo();
                break;
            case 5:
                personagemAtual = personagemAtual.promoverParaMago();
                break;
            case 6:
                personagemAtual = personagemAtual.promoverParaFeiticeiro();
                break;
            case 7:
                personagemAtual = personagemAtual.promoverParaBruxo();
                break;
            case 8:
                personagemAtual = personagemAtual.promoverParaBardo();
                break;
            default:
                System.out.println("Classe inválida!");
        }
    }

    private static void usarHabilidades() {
        System.out.println("\n- HABILIDADES -");
        if (personagemAtual instanceof Clerigo) {
            Clerigo clerigo = (Clerigo) personagemAtual;
            System.out.println("1. Curar ferimentos");
            System.out.println("2. Atacar com símbolo");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                clerigo.curar();
            } else {
                clerigo.atacar("símbolo");
            }
        }
        else if (personagemAtual instanceof Bardo) {
            Bardo bardo = (Bardo) personagemAtual;
            System.out.println("1. Inspirar aliados");
            System.out.println("2. Atacar com alaúde");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                bardo.inspirar();
            } else {
                bardo.atacar("alaúde");
            }
        }
        else {
            System.out.println("1. Atacar");
            System.out.println("2. Atacar com arma");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                personagemAtual.atacar();
            } else {
                System.out.print("Digite a arma: ");
                String arma = scanner.nextLine();
                personagemAtual.atacar(arma);
            }
        }
    }

    private static void listarInformacoes() {
        System.out.println("\n- INFORMAÇÕES DO PERSONAGEM -");
        System.out.println("Nome: " + personagemAtual.getNome());
        System.out.println("Raça: " + personagemAtual.getRaca());
        System.out.println("Vida: " + personagemAtual.getVida());
        System.out.println("Mana: " + personagemAtual.getMana());

        if (personagemAtual instanceof Clerigo) {
            System.out.println("Classe: Clérigo");
            System.out.println("Divindade: " + ((Clerigo) personagemAtual).getDivindade());
        }
        else if (personagemAtual instanceof Bardo) {
            System.out.println("Classe: Bardo");
            System.out.println("Inspirações: " + ((Bardo)personagemAtual).getInspiracao());
        }
        else {
            System.out.println("Classe: Aventureiro (não especializado)");
        }
    }
}