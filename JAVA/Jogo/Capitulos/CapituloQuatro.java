package Jogo.Capitulos;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Alternativas.Alternativas;
import Jogo.Creditos.Creditos;
import Jogo.Mecanicas.Dano;

public class CapituloQuatro implements TempoAnimacao {

        public void capitulo_quatro(String nome_jogador, int vida, int experiencia, int cristais) {
                System.out.println(
                                "\n\nO dia estava se transformando em noite, corujas começaram a chirriar, os ventos ficaram mais fortes, e nossos aventureiros\nforam atingidos também...\npela fome.");
                tempoPadraoAnimacao((300 * 10));
                System.out.println("Eis que derrepente um gólem surge, e os indaga:\n");
                tempoPadraoAnimacao((300 * 10));

                System.out.println("Gólem: RESPONDAM-ME RÁPIDO SE QUISEREM SOBREVIVER!");
                tempoPadraoAnimacao((300 * 10));
                int dano_capitulo_quatro = new Dano().danoAleatorio(30, 70);
                boolean acertou_pergunta4 = false;
                while (!acertou_pergunta4 == true && vida > 0 && cristais > 0) {// Valida a questão enquanto as
                                                                                // condições forem
                                                                                // respeitadas
                        System.out.println("\n\nGólem: QUEM FOI O PAI DA COMPUTAÇÃO?");
                        new Alternativas().alternativa_pergunta_quatro();
                        String reposta_jogador = new CapturaDeDados().entradaTexto();
                        if (reposta_jogador.equalsIgnoreCase("A")) {
                                System.out.println("\nVocê ACERTOU");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Gólem: AH, MUITO BEM, ACEITEM COMO RECOMPENSA PELA RESPOSTA CORRETA");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println("\n\n Ele os entraga uma sacola cheia de comida \n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Golém: Uma pedra não precisa de comida, agora vocês sacos de carne, sim. Inteligentes porém molengas.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "\n\nO Golém vai embora em direção a floresta com um caminhar calmo, enquanto derruba tudo a sua frente");
                                tempoPadraoAnimacao((300 * 10));
                                acertou_pergunta4 = true;
                        } else {
                                System.out.println("\nVOCÊ ERROU!");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println("Golém: VOCÊS ERRARAM.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "\n\n O golém lança uma sacola cheia de comida em direção a vocês\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                vida -= dano_capitulo_quatro;
                                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n",
                                                dano_capitulo_quatro,
                                                vida);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Golém: Vocês são burros, mas eu não preciso disso mesmo, eu não como, nem sei poruqê peguei isso, deve ser piada de um dos devs\n onde já se viu? UMA PEDRA COMER! HAHAHAH!");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println("\n\n O Golém vai embora gargalhando sozinho\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                acertou_pergunta4 = true;
                        }
                }
                // Trecho da história omitido para fins da apresentação
                boolean acertou_pergunta = false;

                while (!acertou_pergunta == true && vida > 0 && cristais > 0) {
                        System.out.println(
                                        "Suponhamos que um jovem comerciante esteja vendendo 5 maçãs e 10 bananas,\nseu cliente compre 6 dessas frutas, a quantidade de frutas que irão\nrestar será correspondente ao valor da tabela verdade do operador lógico 'OR'?");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("RESPONDA COM '0' PARA SIM OU '1' PARA NÃO");
                        int resposta_final = new CapturaDeDados().entradaNumero();

                        boolean sim_ou_nao = new Alternativas().alternativa_pergunta_cinco(resposta_final);
                        if (!sim_ou_nao == true) {
                                System.out.println(
                                                " Ao ter errado a resposta do desafio,\no monstro começa a gargalhar sem fim e sua visão começa a ficar extremamente escura,\nsua barriga continua inchando e ficando subitamente vermelha,\naté que explode e você morre");
                                tempoPadraoAnimacao((300 * 10));
                                acertou_pergunta = true;
                        } else {
                                System.out
                                                .println("Sua barriga começa a borbulhar e transbordar para fora de si. Em outras palavras...");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "\n\nVocê estava vomitando tudo o que estava dentro de si, inclusive o monstro");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Ao terminar de jogá-lo para fora, ele começa a crescer e a tomar uma forma de um ser humano peculiar");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Jeff Bezos: Eu não acredito, eu estou livre... nem sei como agradecer a vocês, prometo que irei recompensá-los no futuro.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Logo após ele tomar forma de um humano, seu corpo e alma foram levados para um outro tempo astral no futuro, deixando um rastro brilhante e radiante pelos céus.\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Olha só, minha cara, parece que você está indo muito bem,\nHawk: fico feliz que esteja seguindo restritamente tudo aquilo que eu leciono para você,\nHawk: dessa forma conseguiremos cumprir nossa missão facilmente, estamos quase chegando la.\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("\n%S: Hawk, o que é lecionar?\n\n", nome_jogador);
                                acertou_pergunta = true;
                        }
                }

                System.out.printf(
                                "\n\nAo dar início a escalada à colina, Hawk começa a deixar de ter uma forma humana e");
                System.out.printf(".");
                tempoPadraoAnimacao(2500);
                System.out.printf(".");
                tempoPadraoAnimacao(2500);
                System.out.printf(".");
                tempoPadraoAnimacao(2500);
                System.out.println("\n\n\n RAIOS EXPLENDIDOS ENVOLVEM HAWK\n\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.println("Ele revela sua verdadeira forma");
                tempoPadraoAnimacao((300 * 10));
                System.out.println("\n\n░ ░ Terry Myerson(vice president da windows) ░ ░\n\n");
                tempoPadraoAnimacao((760 * 10));
                new Creditos().creditos(3);
        }

        @Override
        public void tempoPadraoAnimacao(int intervalo) {
                try {
                        Thread.sleep(intervalo);
                } catch (InterruptedException ignored) {
                }
        }
}
