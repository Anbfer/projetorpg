package Jogo.Capitulos;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Alternativas.Alternativas;
import Jogo.Mecanicas.Dano;

public class CapituloTres implements TempoAnimacao {
        public void capitulo_tres(String nome_jogador, int vida, int experiencia, int cristais) {
                System.out.println(
                                "Vocês começam a correr e se esquivar dos galhos das árvores e obstáculos no caminho.\nMas, em um dos momentos de se esquivar de uma árvore, ela toma forma de uma criatura com braços em forma de galhos, e suas raízes sendo suas pernas.\nO monstro agarra você pelo braço e o aperta, causando dor na sua marca (se você tiver errado alguma questão, é claro),\nlançando você para longe de seu caminho.");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "\n\nArvoroto: Hurh, nem mais um passo.\n\nHawk: Essa não... não imaginei que o nível fosse ficar mais alto logo agora... Tenho pessimas notícias.\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "Arvoroto: Só irão passar de mim se conseguirem entender e responder ao meu desafio.\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("Hawk: O ritmo das perguntas mudou agora %S coisas inesperadas podem aconte-\n",
                                nome_jogador);
                tempoPadraoAnimacao((300 * 10));
                System.out
                                .println("Arvoroto: ENTÃO VAMOS COMEÇAR: \n\nO monstro avança até você enquanto grita a pergunta\n\n");

                int dano_capitulo_tres = new Dano().danoAleatorio(10, 50);
                boolean acertou = false;
                while (!acertou == true && vida > 0 && cristais > 0) {// Valida a questão enquanto as condições forem
                                                                      // respeitadas
                        System.out.println("ME DÊ 1 EXEMPLO DO OPERADOR AND:\n");
                        new Alternativas().alternativa_pergunta_tres();
                        String reposta_jogador = new CapturaDeDados().entradaTexto();
                        if (reposta_jogador.equalsIgnoreCase("B")) {
                                System.out.println("\nVocê ACERTOU");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "\n\nO monstro de árvore começa a se contorcer até virar um ser de luz radiante...\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "Elon Musk: Olá %S,você me conhece?\nEu estou construindo um foguete la no futuro, e irei levar todos nós até a lua, obrigado por me libertar.\n\n",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Muito bem meu rapaz! Você está indo realmente muito bem, estou muito orgulhoso.\nAcredito que daqui em diante não haverá mais monstros até a colina, estamos prestes a chegar ao fim de nossa aventura,\nmas deixa eu te perguntar,\n\nVocê conhece o Elon Musk...?\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                acertou = true;
                        } else {
                                System.out.println("\nVOCÊ ERROU!");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "O arvoroto retira um de seus braços de madeira e lança-o até você, perfurando a lateral do seu abdômen.\nLogo após ele se torna parte da própria terra e desaparece.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Essa não, nosso plano está desmoronando...\nHawk: Olhe para o seu abdômen.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Seu abdômen começa a sangrar e seu antebraço completa a marca do Inversor.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Não podemos errar mais nenhum desafio daqui em diante\nHawk: caso contrário tudo estará perdido.");
                                tempoPadraoAnimacao((300 * 10));
                                vida -= dano_capitulo_tres;
                                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n",
                                                dano_capitulo_tres,
                                                vida);
                                tempoPadraoAnimacao((300 * 10));
                                acertou = true;
                        }
                }
                System.out.println(
                                "Após você fazer um curativo para o dano causado pelo último monstro, vocês e Hawk começam a caminhar para o destino final, a colina.");
                tempoPadraoAnimacao((300 * 10));
        }

        @Override
        public void tempoPadraoAnimacao(int intervalo) {
                try {
                        Thread.sleep(intervalo);
                } catch (InterruptedException ignored) {
                }
        }
}
