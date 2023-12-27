package Jogo.Capitulos;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Alternativas.Alternativas;
import Jogo.Mecanicas.Dano;

public class CapituloUm implements TempoAnimacao {

        public void capitulo_um(String nome_jogador, int vida, int experiencia, int cristais) {
                CapturaDeDados entrada = new CapturaDeDados();

                int dano_capitulo_um = new Dano().danoAleatorio(1, 5);
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "\n\nHawk: Olá %S lhe garanto que se você desejar de fato, obter a consciência que estou disposto a ensinar,",
                                nome_jogador);
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\nvocê poderá atravessar fronteiras e desbravar o mundo com tal compreensão.");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "\nPara conquistar esta clareza mental que vos falo, precisaremos nos aventurar por um lugar chamado 'Floresta das almas'.");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "\nOnde haverão desafios e indagações para a minha pessoa, e para ti também, aceita correr esse risco para despertar sua consciência?");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\n\nGaranto que será útil em breve. Muito bem, então vamos lá.");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "\nVocês caminham até a floresta e o mago lan Hawk descreve como funcionarão as coisas:\n");
                // tempoPadraoAnimacao((550 * 10));
                System.out.printf(
                                "\nHawk: Pois bem, %S, nós caminharemos por esta floresta e surgirão monstros que farão perguntas sobre alguns assuntos.",
                                nome_jogador, nome_jogador);
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "\nQuando isto acontecer, eu irei parar o tempo com um cristal mágico e iremos conversar");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "\nsobre o assunto, eu posso usar até 10 cristais para lhe ajudar, sendo apenas 1 por desafio,");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\ne você tem a liberdade de querer parar nossa jornada com o");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "\nuso de no mínimo 5 cristais. lembrando que eu irei lhe ajudar, mas sem lhe dar a resposta correta.");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\n\nO nosso futuro está nas suas mãos %S!", nome_jogador);
                tempoPadraoAnimacao((300 * 10));

                System.out.println("\n\nVocês entram na Florestas das Almas e começam a caminhar\n\n");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".\n");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(
                                "\n\nHawk: Há uma coisa que eu não lhe falei, suas escolhas definem o final desta nossa aventura, então tome cuidado no que decidir.");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf("\n\nVocês caminham por mais alguns minutos\n");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".\n");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf("\nVocê se depara com uma imagem de si mesmo a sua frente, semelhante a um espelho");
                tempoPadraoAnimacao((600 * 10));
                System.out.printf(
                                "\nPorém, não se parece com você, é um reflexo acinzentado, com uma aura assustadora e algo marcante ");
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf(".\n");
                tempoPadraoAnimacao((30 * 10));
                System.out.printf("\nA criatura sussurrava repetidas vezes:\n");
                tempoPadraoAnimacao((600 * 10));
                System.out.printf(
                                "\n-um zero um zero zero zero um um um um zero (10100011110)\n\n-A criatura medonha fez uma pausa e então continuou.\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\n- um um um um um um zero zero um um zero (1111 1100 110).\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("\nHawk: O que é isso? Ah %S, este é seu primeiro desafio.", nome_jogador);
                tempoPadraoAnimacao((500 * 10));
                System.out.printf(
                                "\nHawk: Para convertermos um número 'binário' para decimal, basta multiplicarmos essa ordem: 1010 0011 110 pelas potências do número 2.\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "\nComo por exemplo: 1x210 0x29 1x28 0x27 0x26 0x25 1x24 1x23 1x22 1x21 0x2°. Utilizando a ordem do 1° número binário (10100011110)\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "Conhece os valores de 2? Para relembrarmos, vou lhe dar uma pequena dica de cálculo: 2x11 = 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2.\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf(
                                "O resultado de uma multiplicação, você multiplica pelo próximo número e assim sucessivamente.");
                tempoPadraoAnimacao((300 * 10));
                boolean acertou = false;

                // primeira questão

                while (!acertou == true && vida > 0 && cristais > 0) {// Valida a questão enquanto as condições forem
                                                                      // respeitadas
                        System.out.printf("\n\nExperimente realizar o cálculo e selecionar a alternativa correta:\n");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.printf("\nRESPONDA! - GRITA A BESTA:\n");
                        new Alternativas().alternativa_pergunta_um();
                        String resposta_jogador = entrada.entradaTexto();
                        if (resposta_jogador.equalsIgnoreCase("A")) {
                                System.out.println("\nVocê ACERTOU");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("\n\n- O que é isso que está acontecendo??\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "O monstro começa irradiar uma energia que seus olhos mal conseguem observar\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Olá, meu nome é Bill Gates.\nVocê garantiu que no futuro eu pudesse existir e revolucionar não só uma geração de tecnologia, mas sim a vida de várias pessoas, Obrigado\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("- O que acabou de acontecer?\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "Hawk: Oh %S eu acabei me esquecendo de lhe alertar.\nA cada desafio cumprido com sucesso, o monstro que nós nos depararmos irá ser libertado e enviado de volta para o seu devido lugar no futuro.\nEntão de vez em quando podemos nos deparar com pessoas que para você podem ser estranhas, mas eu lhe garanto, você estará fazendo a diferença.\n",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                acertou = true;
                        } else {
                                System.out.println("\nVOCÊ ERROU!");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "\n\nO monstro anda em direção a você e pega no seu braço, marcando você\ncom o que aparenta ser um símbolo magico e depois se esvai junto com os ventos da natureza...\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println("Isso não é um bom sinal...");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "Hawk: Isso %S, é a representatividade da marca da Álgebra Booleana, no qual quer dizer “O Inversor”.\nA cada pergunta respondida de forma errada fará você receber uma parte deste símbolo\nE o que acontece se você deixar esse símbolo se completar?\nBem...\nO jogo acaba, e o futuro tecnológico da humanidade estará perdido.",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("\nEntão concentre-se nos desafios e garanto que dará tudo certo");
                                tempoPadraoAnimacao((300 * 10));
                                vida -= dano_capitulo_um;
                                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n",
                                                dano_capitulo_um,
                                                vida);
                                tempoPadraoAnimacao((300 * 10));
                                acertou = true;
                        }
                }
        }

        @Override
        public void tempoPadraoAnimacao(int intervalo) {
                try {
                        Thread.sleep(intervalo);
                } catch (InterruptedException ignored) {

                }
        }

}
