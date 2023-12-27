package Jogo.Mecanicas;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;

public class Personalizar implements TempoAnimacao {
    public String personalizar_personagem() {
        /*
         * Função que modifica o personagem principal ao gosto e as opções dispostas ao
         * jogador
         */
        String entradaUser;
        int entradaUserInt;
        boolean verificaCase = false, verificaRaca = false, verificaIdade = false, confirmaEscolhaNome = false;
        String viajante_nome = "";
        String viajante_raca = "";
        int viajante_idade = 0;
        String confirmaEscolha = "";

        // Escolha de nome
        while (verificaCase == false) {
            tempoPadraoAnimacao(250);
            System.out.printf("Olá viajante, qual o seu nome?: ");
            entradaUser = new CapturaDeDados().entradaTexto();

            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$")) {
                /* Utilizo de expressão regular para validar a entrada do campo */
                viajante_nome = entradaUser;
                // Valida nome
                while (!confirmaEscolhaNome == true) {
                    // confirma o nome escolhido
                    System.out.printf("\nSeu nome é %S correto?\n", viajante_nome);
                    System.out.println("Confirme com S ou N");
                    entradaUser = new CapturaDeDados().entradaTexto();
                    if (entradaUser.equalsIgnoreCase("S")) {
                        confirmaEscolhaNome = true;
                    } else {
                        System.out.println("\nEntão qual é o seu nome?");
                        entradaUser = new CapturaDeDados().entradaTexto();
                        viajante_nome = entradaUser;
                        confirmaEscolhaNome = true;
                    }
                }

                // tempoPadraoAnimacao(250);
                System.out.printf("\nPrazer em conhece-lo %S!\n", viajante_nome);
                tempoPadraoAnimacao(250);
                verificaCase = true;
            } else {
                // tempoPadraoAnimacao(250);
                System.out.println("\nViajante, existe algo de errado com seu nome, tente novamente\n");
            }
        }

        // Escolha de raça
        while (verificaRaca == false) {
            // tempoPadraoAnimacao(250);
            System.out.printf("\nAgora, me diga %S qual é a sua raça?:\n", viajante_nome);
            // tempoPadraoAnimacao(500);
            System.out.println("\nA) Humano - Ambicioso, Audaz e Diverso");

            System.out.println("B) Elfo - Místico, Belo e Saudosista");

            System.out.println("C) Anão - Robusto, Teimoso e Rabugento");

            System.out.println("D) Halfling - Bravos, Ágeis e Sortudos!\n");

            entradaUser = new CapturaDeDados().entradaTexto();

            // Confirma a escolha da raça
            if (!entradaUser.equals("") && entradaUser != null && entradaUser.matches("^[a-zA-Z]*$")) {
                switch (entradaUser.toUpperCase()) {
                    case "A":
                        // tempoPadraoAnimacao(500);
                        System.out.println("Você escolheu Humano, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Humano";
                        confirmaEscolha = new CapturaDeDados().entradaTexto();
                        // tempoPadraoAnimacao(500);

                        // tempoPadraoAnimacao(500);
                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "B":
                        System.out.println("Você escolheu Elfo, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Elfo";
                        // tempoPadraoAnimacao(500);
                        confirmaEscolha = new CapturaDeDados().entradaTexto();
                        // tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "C":
                        System.out.println("Você escolheu Anão, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Anão";
                        // tempoPadraoAnimacao(500);
                        confirmaEscolha = new CapturaDeDados().entradaTexto();
                        // tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    case "D":
                        System.out.println("Você escolheu Halfling, correto?");
                        System.out.println("Responda com S ou N");
                        viajante_raca = "Halfling";
                        // tempoPadraoAnimacao(500);
                        confirmaEscolha = new CapturaDeDados().entradaTexto();
                        // tempoPadraoAnimacao(500);

                        if (confirmaEscolha.equalsIgnoreCase("S")) {
                            verificaRaca = true;
                        }
                        break;
                    default:
                        System.out.println("Parece que você não escolheu uma das opções válidas");
                        break;
                }
            } else {
                // tempoPadraoAnimacao(250);
                System.out.println("\nViajante, existe algo de errado com seu nome, tente novamente\n");
                // tempoPadraoAnimacao(250);
            }
        }
        // Pede a idade e confirma a idade;
        while (verificaIdade == false) {
            tempoPadraoAnimacao(500);
            System.out.printf("Agora me diga %S, o(a) %S, qual é a sua idade?\n", viajante_nome, viajante_raca);
            entradaUserInt = new CapturaDeDados().entradaNumero();
            if (entradaUserInt > 0) {
                viajante_idade = entradaUserInt;
                verificaIdade = true;
            } else {
                System.out.println("Você informou algum valor inválido, tente novamente");
                // tempoPadraoAnimacao(500);
            }
        }

        System.out.printf(
                "\nCerto, então você é um %S e seu nome é %S, você tem %d anos\n-Prepare-se para os desafios que vem adiante %S, o(a) %S e muito cuidado! \n-Todas as suas decisões tem consequências!\n",
                viajante_raca, viajante_nome, viajante_idade, viajante_nome, viajante_raca);
        tempoPadraoAnimacao((450 * 10));

        return viajante_nome;
    }

    @Override
    public void tempoPadraoAnimacao(int intervalo) {
        try {
            Thread.sleep(intervalo);/*
                                     * Ângelo - intervalo que pausa e execução do código e pode ser modificado
                                     * alterando a duração em milisegundos da "animação"
                                     */
        } catch (InterruptedException ignored) {
        }
    }
}
