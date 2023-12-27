package Jogo.Prologo;

import Animacao.TempoAnimacao;
import EntradaDeDados.*;

public class Prologo implements TempoAnimacao {

    public boolean prologo(String nome_jogador) {
        boolean verificaResposta = false;

        System.out.printf(
                "\n%S, sua história começa com um jovem mestre, alguns taberneiros achavam que ele era um charlatão,\nas vezes o confundiam com um mago, e outras com um ser místico, enquanto outras pessoas\napenas o achavam um rapaz louco e bêbado.\n\n",
                nome_jogador);
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(
                "Ele possuía 1,71 de altura, barba rala era calvo.\n\nEra sorridente e bastante engraçado.\n\nSeu nome era lan Hawk.\nlan possuía muito conhecimento em assuntos computacionais, e por esse motivo as pessoas o achavam maluco, por ter conhecimento de assuntos que não faziam sentido naquela época e que ninguém nunca entendia.\n\n");
        tempoPadraoAnimacao((500 * 10));
        System.out.printf(
                "\nMas como estava ficando muito velho decidiu passar sua sabedoria para as próximas gerações.\n\nEle queria plantar a semente do conhecimento naqueles que tinham vontade de aprender.");
        tempoPadraoAnimacao((500 * 10));

        // Se a resposta for verdade continua o jogo
        while (!verificaResposta == true) {
            System.out.println(
                    "\n\nVocê está pronto(a) para se tornar o aprendiz do mestre mago?\n");
            System.out.printf("Responda com S ou N: \n\n");
            String entrada_user = new CapturaDeDados().entradaTexto();

            if (!entrada_user.equalsIgnoreCase("n") && entrada_user != null && entrada_user.matches("^[a-zA-Z]*$")) {
                verificaResposta = true;
                System.out.printf(".");
                tempoPadraoAnimacao(30 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(30 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(30 * 10);
                System.out.printf(".");
                tempoPadraoAnimacao(30 * 10);

            } else if (entrada_user.equalsIgnoreCase("n") && entrada_user != null
                    && entrada_user.matches("^[a-zA-Z]*$")) {
                break;
            } else {
                System.out.println("Opa, parece que você digitou algo errado, lembre-se, responda com S ou N");
            }
        }
        return verificaResposta;
    }

    @Override
    public void tempoPadraoAnimacao(int intervalo) {
        try {
            Thread.sleep(115);/*
                               * Ângelo - intervalo que pausa e execução do código e pode ser modificado
                               * alterando a duração em milisegundos da "animação"
                               */
        } catch (InterruptedException ignored) {
        }
    }
}
