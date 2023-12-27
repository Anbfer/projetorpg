package Menu;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Jogar;
import Jogo.Creditos.Creditos;
import Jogo.Instrucao.Instrucoes;

public class Menu implements TempoAnimacao {

    public void menu() {

        int opcaoMenu = 0;
        String escolha = "";
        boolean validaEntradaMenu = false;
        CapturaDeDados input = new CapturaDeDados();

        do {
            do {
                System.out.println("\n\n                                    ████████████████████████");
                System.out.println("                                    ███  Menu Principal  ███");
                tempoPadraoAnimacao(140);
                System.out.println("                                    ████████████████████████");
                tempoPadraoAnimacao(115);
                System.out.println("                                    ██  1 - Instruções    ██");
                tempoPadraoAnimacao(115);
                System.out.println("                                    ██  2 - Jogar         ██");
                tempoPadraoAnimacao(115);
                System.out.println("                                    ██  3 - Céditos       ██");
                tempoPadraoAnimacao(230);
                System.out.println("                                    ██  4 - Sair          ██");
                System.out.println("                                    ████████████████████████\n");
                escolha = input.entradaTexto();

                if (!escolha.matches("[0-9]")) {
                    System.out.println("Opção inválida, tente outra");
                } else {
                    if (escolha.equalsIgnoreCase("1")) {
                        opcaoMenu = 1;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("2")) {
                        opcaoMenu = 2;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("3")) {
                        opcaoMenu = 3;
                        validaEntradaMenu = true;
                    }
                    if (escolha.equalsIgnoreCase("4")) {
                        opcaoMenu = 4;
                        validaEntradaMenu = true;
                    }
                }
            } while (!validaEntradaMenu == true);

            switch (opcaoMenu) {
                case 1:
                    if (new Instrucoes().instucao(opcaoMenu) != 4) {
                        menu(); // exibe as instruções do jogo
                    }
                    break;
                case 2:
                    if (new Jogar().jogar(opcaoMenu) != 4) {
                        menu(); // inicia o jogo
                    }
                    break;
                case 3:
                    if (new Creditos().creditos(opcaoMenu) != 4) {
                        menu(); // acessa os créditos
                    }
                    break;
                case 4:
                    System.out.println("\n||| Saindo |||\n"); // encerra a execução do jogo
                    break;
                default:
                    System.out.println("Opção invalida");// caso seja inserido um valor invalido solicita um novo input
            }
        } while (opcaoMenu != 4);

    }

    @Override
    public void tempoPadraoAnimacao(int intervalo) {
        try {
            Thread.sleep(intervalo);
        } catch (InterruptedException ignored) {
        }
    }

}
