package Jogo.Creditos;

import EntradaDeDados.CapturaDeDados;

public class Creditos {

    public int creditos(int opcao) {
        // Nery - exibe os créditos do jogo
        CapturaDeDados input = new CapturaDeDados();
        try {
            System.out.println("\n|| Créditos ||\n");
            System.out.println("Direção, Criação, Roteiro, Programação:\n");
            System.out.println("== Alessandro O. Rocha ==\n");
            System.out.println("== Ângelo Baracho ==\n");
            System.out.println("== Matheus Henrique ==\n");
            System.out.println("== João Vitor Nery ==\n");
            System.out.println("** Pressione 4 para retornar ao menu principal **\n");
            opcao = input.entradaNumero();
        } catch (Exception e) {
            System.out.println("Entre com um valor válido");// caso seja inserido um valor inválido exibe a seguinte
                                                            // mensagem de erro e solicita um novo input
            input.entradaNumero();
        }
        return opcao;
    }
}
