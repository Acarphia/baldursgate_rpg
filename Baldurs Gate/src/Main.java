//Feito por Luiza Vieira Pavarina - 12411GIN047
//Marcos Paulo Alves - 12311GIN022
//Ana Clara - 

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Personagem personagemAtual;

    public static void main(String[] args) {
        System.out.println("- BALDUR'S GATE 3 -");

        // Carga inicial de personagem base
        Personagem cargaInicial = criarPersonagemInicial();
        personagemAtual = cargaInicial;

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

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

    if (!Personagem.listarRacas().contains(raca)) {
        System.out.println("Raça inválida! Personagem não criado.");
        return;
    }

    personagemAtual = new Personagem(nome, raca, 100, 30);
    System.out.println("Personagem criado com sucesso!");
}

    private static void promoverPersonagem() {
        System.out.println("\n- PROMOÇÃO -");
        System.out.println("Classes disponíveis:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Guerreiro Campeão");
        System.out.println("3. Assassino");
        System.out.println("4. Assassino Sombrio");
        System.out.println("5. Feiticeiro");
        System.out.println("6. Feiticeiro Dracônico");
        System.out.println("7. Mago");
        System.out.println("8. Mago Evocador");
        System.out.println("9. Bardo");
        System.out.println("10. Bardo (Colégio da Sabedoria)");
        System.out.println("11. Clérigo");
        System.out.println("12. Clérigo (Domínio da Luz)");
        System.out.print("Escolha uma classe: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                personagemAtual = new Guerreiro(personagemAtual);
                break;
            case 2:
                if (personagemAtual instanceof Guerreiro) {
                    personagemAtual = new GuerreiroCampeao((Guerreiro) personagemAtual);
                } else {
                    System.out.println("Apenas Guerreiros podem virar Campeões!");
                }
                break;
            case 3:
                personagemAtual = new Assassino(personagemAtual);
                break;
            case 4:
                if (personagemAtual instanceof Assassino) {
                    personagemAtual = new AssassinoSombrio((Assassino) personagemAtual);
                } else {
                    System.out.println("Apenas Assassinos podem virar Sombrio!");
                }
                break;
            case 5:
                personagemAtual = new Feiticeiro(personagemAtual);
                break;
            case 6:
                if (personagemAtual instanceof Feiticeiro) {
                    personagemAtual = new FeiticeiroDraconico((Feiticeiro) personagemAtual);
                } else {
                    System.out.println("Apenas Feiticeiros podem virar Dracônicos!");
                }
                break;
            case 7:
                personagemAtual = new Mago(personagemAtual);
                break;
            case 8:
                if (personagemAtual instanceof Mago) {
                    personagemAtual = new MagoEvocador((Mago) personagemAtual);
                } else {
                    System.out.println("Apenas Magos podem virar Evocadores!");
                }
                break;
            case 9:
                personagemAtual = new Bardo(personagemAtual);
                break;
            case 10:
                if (personagemAtual instanceof Bardo) {
                    personagemAtual = new BardoColegioSabedoria((Bardo) personagemAtual);
                } else {
                    System.out.println("Apenas Bardos podem entrar no Colégio da Sabedoria!");
                }
                break;
            case 11:
                personagemAtual = new Clerigo(personagemAtual);
                break;
            case 12:
                if (personagemAtual instanceof Clerigo) {
                    personagemAtual = new ClerigoDominioLuz((Clerigo) personagemAtual);
                } else {
                    System.out.println("Apenas Clérigos podem seguir o Domínio da Luz!");
                }
                break;
            default:
                System.out.println("Classe inválida!");
        }
    }

    private static void usarHabilidades() {
        System.out.println("\n- HABILIDADES -");

        if (personagemAtual instanceof GuerreiroCampeao) {
            GuerreiroCampeao gCamp = (GuerreiroCampeao) personagemAtual;
            System.out.println("1. Usar Fúria");
            System.out.println("2. Usar Golpe Crítico");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                gCamp.usarFuria();
            } else if (escolha == 2) {
                gCamp.usarGolpeCritico();
            }
        }
        else if (personagemAtual instanceof Guerreiro) {
            Guerreiro g = (Guerreiro) personagemAtual;
            System.out.println("1. Usar Fúria");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                g.usarFuria();
            } else {
                g.atacar();
            }
        }
        else if (personagemAtual instanceof AssassinoSombrio) {
            AssassinoSombrio aS = (AssassinoSombrio) personagemAtual;
            System.out.println("1. Ataque Furtivo");
            System.out.println("2. Dança das Sombras");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                aS.ataqueFurtivo();
            } else {
                aS.dancarSombras();
            }
        }
        else if (personagemAtual instanceof Assassino) {
            Assassino a = (Assassino) personagemAtual;
            System.out.println("1. Ataque Furtivo");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                a.ataqueFurtivo();
            } else {
                a.atacar();
            }
        }
        else if (personagemAtual instanceof FeiticeiroDraconico) {
            FeiticeiroDraconico fD = (FeiticeiroDraconico) personagemAtual;
            System.out.println("1. Conjurar Raio de Caos");
            System.out.println("2. Usar Sopro Dracônico");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                fD.conjurarRaioCaos();
            } else {
                fD.usarSoproDraconico();
            }
        }
        else if (personagemAtual instanceof Feiticeiro) {
            Feiticeiro f = (Feiticeiro) personagemAtual;
            System.out.println("1. Conjurar Raio de Caos");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                f.conjurarRaioCaos();
            } else {
                f.atacar();
            }
        }
        else if (personagemAtual instanceof MagoEvocador) {
            MagoEvocador mE = (MagoEvocador) personagemAtual;
            System.out.println("1. Lançar Mísseis");
            System.out.println("2. Evocar Elemental");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                mE.lancarMisseis();
            } else {
                mE.evocarElemental();
            }
        }
        else if (personagemAtual instanceof Mago) {
            Mago m = (Mago) personagemAtual;
            System.out.println("1. Lançar Mísseis");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            if (escolha == 1) {
                m.lancarMisseis();
            } else {
                m.atacar();
            }
        }
        else if (personagemAtual instanceof ClerigoDominioLuz) {
            ClerigoDominioLuz cL = (ClerigoDominioLuz) personagemAtual;
            System.out.println("1. Invocar Chama Sagrada");
            System.out.println("2. Curar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                cL.invocarChamaSagrada();
            } else {
                cL.curar();
            }
        }
        else if (personagemAtual instanceof Clerigo) {
            Clerigo c = (Clerigo) personagemAtual;
            System.out.println("1. Curar ferimentos");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                c.curar();
            } else {
                c.atacar();
            }
        }
        else if (personagemAtual instanceof BardoColegioSabedoria) {
            BardoColegioSabedoria bC = (BardoColegioSabedoria) personagemAtual;
            System.out.println("1. Palavra Cortante");
            System.out.println("2. Inspiração Superior");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                bC.cortantePalavra();
            } else {
                bC.inspirar();
            }
        }
        else if (personagemAtual instanceof Bardo) {
            Bardo b = (Bardo) personagemAtual;
            System.out.println("1. Inspirar aliados");
            System.out.println("2. Atacar");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                b.inspirar();
            } else {
                b.atacar();
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
        System.out.println("Vida: " + personagemAtual.getVida() + "/" + personagemAtual.getVidaMax());
        System.out.println("Mana: " + personagemAtual.getMana() + "/" + personagemAtual.getManaMax());

        if (personagemAtual instanceof GuerreiroCampeao) {
            System.out.println("Classe: Guerreiro Campeão");
            System.out.println("Fúria restante: " + ((GuerreiroCampeao) personagemAtual).getFuria());
        }
        else if (personagemAtual instanceof Guerreiro) {
            System.out.println("Classe: Guerreiro");
            System.out.println("Fúria restante: " + ((Guerreiro) personagemAtual).getFuria());
        }
        else if (personagemAtual instanceof AssassinoSombrio) {
            System.out.println("Classe: Assassino Sombrio");
            System.out.println("Sombras restantes: " + ((AssassinoSombrio) personagemAtual).getSombras());
        }
        else if (personagemAtual instanceof Assassino) {
            System.out.println("Classe: Assassino");
            System.out.println("Furtividade restante: " + ((Assassino) personagemAtual).getFurtividade());
        }
        else if (personagemAtual instanceof FeiticeiroDraconico) {
            System.out.println("Classe: Feiticeiro Dracônico");
            System.out.println("Mana restante: " + personagemAtual.getMana());
        }
        else if (personagemAtual instanceof Feiticeiro) {
            System.out.println("Classe: Feiticeiro");
            System.out.println("Mana restante: " + personagemAtual.getMana());
        }
        else if (personagemAtual instanceof MagoEvocador) {
            System.out.println("Classe: Mago Evocador");
            System.out.println("Evocações restantes: " + ((MagoEvocador) personagemAtual).getEvocacoes());
        }
        else if (personagemAtual instanceof Mago) {
            System.out.println("Classe: Mago");
            System.out.println("Livros restantes: " + ((Mago) personagemAtual).getLivros());
        }
        else if (personagemAtual instanceof ClerigoDominioLuz) {
            System.out.println("Classe: Clérigo (Domínio da Luz)");
            System.out.println("Divindade: " + ((Clerigo) personagemAtual).getDivindade());
        }
        else if (personagemAtual instanceof Clerigo) {
            System.out.println("Classe: Clérigo");
            System.out.println("Divindade: " + ((Clerigo) personagemAtual).getDivindade());
        }
        else if (personagemAtual instanceof BardoColegioSabedoria) {
            System.out.println("Classe: Bardo (Colégio da Sabedoria)");
            System.out.println("Inspiração superior restante: " + ((BardoColegioSabedoria) personagemAtual).getInspiracaoSuperior());
        }
        else if (personagemAtual instanceof Bardo) {
            System.out.println("Classe: Bardo");
            System.out.println("Inspiração restante: " + ((Bardo) personagemAtual).getInspiracao());
        }
        else {
            System.out.println("Classe: Aventureiro (não especializado)");
        }
    }
}
