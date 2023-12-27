package Menu;

import EntradaDeDados.*;

public class TelaInicial {

    public void telaInicial() {
        /*
         * Matheus && Nery - A tela inicial que permite o usuário iniciar o jogo ou sair
         * ali mesmo
         */
        CapturaDeDados input = new CapturaDeDados();
        Menu menu = new Menu();

        System.out.println("\n                              Digite S para continuar ou N para sair");

        String entrada = input.entradaTexto();
        if (entrada.equalsIgnoreCase("s")) {
            menu.menu();
        } else if (entrada.equalsIgnoreCase("n")) {
            System.exit(0);
        }
    }
}
