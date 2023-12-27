package Jogo.Instrucao;

import EntradaDeDados.CapturaDeDados;

public class Instrucoes {

    public int instucao(int opcao) {
        // Matheus && Ângelo - Função que contém as instruções
        CapturaDeDados input = new CapturaDeDados();
        try {
            System.out.println("\n|| Você está nas instruções ||\n");
            System.out.printf(
                    " Para jogar tenha em mãos um papel de rescunho,lápis e uma borracha, confie em mim, você vai precisar!\n-Como parte fundamental do jogo, você precisa responder a algumas perguntas para progredir na história.\n-Sua vida é restaurada após cada resposta correta\n-Suas respostas influenciarão o fim do jogo");
            System.out.println("**Pressione 4 para retornar ao menu principal**\n");
            opcao = input.entradaNumero();
        } catch (Exception e) { // caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                                // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.entradaNumero();
        }
        return opcao; // retorna a opção escolhida
    }
}
