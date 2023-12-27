package Jogo;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Capitulos.CapituloDois;
import Jogo.Capitulos.CapituloQuatro;
import Jogo.Capitulos.CapituloTres;
import Jogo.Capitulos.CapituloUm;
import Jogo.Mecanicas.Personalizar;
import Jogo.Prologo.Prologo;

public class Jogar implements TempoAnimacao {

    public int jogar(int opcao) {
        // Matheus && Ângelo - Função que inicia o jogo após escolha no menu
        CapturaDeDados input = new CapturaDeDados();
        int vida = 100;
        int experiencia = 0;
        int cristais = 10;

        try {
            System.out.println("\n██ Inciando o Jogo... ██\n");
            tempoPadraoAnimacao(250);
            System.out.printf(".");
            tempoPadraoAnimacao(250);
            System.out.printf(".");
            tempoPadraoAnimacao(250);
            System.out.printf(".\n");
            tempoPadraoAnimacao(250);
            String jogador_nome = new Personalizar().personalizar_personagem();
            boolean prologo = new Prologo().prologo(jogador_nome);
            if (!prologo == true) {
                System.out.println("\n**Pressione 4 para retornar ao menu principal**\n");
                opcao = input.entradaNumero();
            } else {
                new CapituloUm().capitulo_um(jogador_nome, vida, experiencia, cristais);
                new CapituloDois().capitulo_dois(jogador_nome, vida, experiencia, cristais);
                new CapituloTres().capitulo_tres(jogador_nome, vida, experiencia, cristais);
                new CapituloQuatro().capitulo_quatro(jogador_nome, vida, experiencia, cristais);
            }
        } catch (Exception e) {// caso seja inserido um valor inválido exibe a seguinte mensagem de erro e
                               // solicita um novo input
            System.out.println("Entre com um valor válido");
            input.entradaNumero();
        }
        return opcao;
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
