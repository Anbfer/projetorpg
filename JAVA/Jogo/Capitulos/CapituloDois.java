package Jogo.Capitulos;

import Animacao.TempoAnimacao;
import EntradaDeDados.CapturaDeDados;
import Jogo.Alternativas.Alternativas;
import Jogo.Mecanicas.Dano;

public class CapituloDois implements TempoAnimacao {
        public void capitulo_dois(String nome_jogador, int vida, int experiencia, int cristais) {
                String escolha_jogador;
                System.out.println(
                                "\nApós o 1° desafio ter sido concluído, vocês e o mestre Ian continuam a explorar a floresta\n");
                do {
                        System.out.println("1 - Perguntar sobre seu passado");
                        System.out.println("2 - Continuar andando em silêncio");
                        System.out.println("3 - Perguntar sobre a marca");
                        escolha_jogador = new CapturaDeDados().entradaTexto();
                        if (escolha_jogador.equalsIgnoreCase("1")) {
                                System.out.printf("\n%S: Eu ouvi falar dos rumores sobre sua pessoa, é verdade?\n",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Qual parte? Que eu não passo de um bêbado e descontrolado e que vivo contando mentiras?");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("\n%S Não exatamente...", nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Você viu com seus próprios olhos, eu não sou louco.\nEssas criaturas que vamos enfrentar desafiam a todo momento o destino da humanidade,\ne francamente já estou ficando velho demais para combater eles sozinho.");
                                System.out.printf("\n%S: O que aconteceu para você se tornar... isso?\n", nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Argh, desde criança fui abençoado com o poder da curiosidade, sabe o que é isso minha cara?");
                                System.out.printf("\n%S: Não...\n", nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: É uma vontade escondida e poderosa que todos nós temos dentro de si.\nUma vontade de desbravar e descobrir os segredos do nosso mundo.\nuanto mais os anos se passavam, mais eu estudei e procurei entender as coisas que nos rodeiam,\ne consequentemente me tornei essa pessoa que vos fala.\nUm dos mais sábios da atualidade, porém o denominado 'louco' pelas pessoas comuns em nossa sociedade contemporânea.\n\n");
                        }
                        if (escolha_jogador.equalsIgnoreCase("2")) {
                                break;
                        }
                        if (escolha_jogador.equalsIgnoreCase("3")) {
                                System.out.printf("\n%S: Pode me dizer mais sobre essa marca no meu braço?\n",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Hawk: Não há muito a dizer além daquilo que já falei.\nApenas peço que se concentre nos desafios e pense muito bem sobre sua próxima alternativa de resposta do desafio,\nse tudo der certo quero que você seja meu sucessor, então se esforce.\n\n");
                                break;
                        }
                } while (escolha_jogador.equalsIgnoreCase("1") || escolha_jogador.equalsIgnoreCase("2")
                                || escolha_jogador.equalsIgnoreCase("3"));

                System.out.println(
                                "\n\nMinutos se passam e vocês encontram uma ponte com lamaçal em suas laterais, correndo um risco de ecorregarem e não conseguir voltar para o topo.\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.println("Hawk: Não se assuste, esse caminho não é perigoso, vá com calma e seja cuidadoso.");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "Ao dar os primeiros passos na ponte ela começa a soltar um rangido\nUm monstro de lama surge dentre as entradas das tábuas\nfalando em um tom entendível a seguinte mensagem:\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "Lamacento: A realidade é que o conceito de álgebra booleana se dá ao fato\nde existirem apenas uma verdade e uma informação falsa, sendo representada pelo número 1 e 0\nDiga me então seu humano asqueroso (disse o monstro cheio de lama e coberto por fezes animais)\n\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.printf("Calma %S , antes de ficar preocupado deixe-me introduzir este assunto complexo:\n\n",
                                nome_jogador);
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "A ideia da Álgebra Booleana é a de que existem apenas duas teorias em determinada situação/problemas, se é VERDADEIRO ou FALSO\n");
                tempoPadraoAnimacao((300 * 10));
                System.out.println(
                                "Nessa Álgebra podemos encontrar funções e portas lógicas\nseguidas de suas “Tabelas Verdades” (que são os verdadeiros valores para determinadas funções,\ne nunca serão alteradas).\nAs portas lógicas não funcionam apenas com valores numéricos, mas também com circuitos de chaveamento,\nquando algo está ligado ou desligado, por exemplo.");
                tempoPadraoAnimacao((300 * 10));

                int dano_capitulo_dois = new Dano().danoAleatorio(1, 7);
                boolean acertou = false;

                while (!acertou == true && vida > 0 && cristais > 0) {// Valida a questão enquanto as condições forem
                                                                      // respeitadas
                        System.out.println("\n\nLamacento: Me diga quais afirmativas são verdadeiras e falsas:\n");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println(
                                        "A álgebra booleana usa funções e variáveis, como na álgebra convencional, que podem assumir apenas um dentre dois valores:\n");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("I - {Não, Sim} – Resposta óbvia");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("II - {Falso, Verdadeiro} - Raciocínio humano");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("III - {True, False} – Raciocínio humano composto ");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("IV - {Desligado, Ligado} - Circuitos de chaveamento");
                        tempoPadraoAnimacao((300 * 10));
                        System.out.println("V - {0, 1} - Sistema binário\n\n");
                        new Alternativas().alternativa_pergunta_dois();
                        String resposta_jogador = new CapturaDeDados().entradaTexto();
                        if (resposta_jogador.equalsIgnoreCase("4")) {
                                System.out.println("\nVocê ACERTOU");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "A lama do monstro começa a escorrer cada vez mais e ele solta um enorme estrondo\nseguido daquela mesma luz que enalteceu o primeiro monstro.\n\nEle irradia uma energia pura e libertadora.\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "Olá meus jovens, eu me chamo Steve Jobs,\nmuito obrigado por conseguir me libertar e me permitir estar presente em nosso mundo nos próximos anos, vejo vocês do outro lado.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "\n\nLogo depois do “lamacento” ser libertado e sua marca da AB ser preservada,\no mestre mago seguiu com a sua companhia pela floresta das almas.\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "Hawk: Ora ora ora, parece que você está pegando o jeito %S, meu pequeno gafanhoto,\ndesse jeito nenhum tipo de desafio será páreo para nós dois.\nContinue prestando atenção e sendo cuidadoso na hora de responder",
                                                nome_jogador);
                                tempoPadraoAnimacao((300 * 10));

                                acertou = true;
                        } else {
                                System.out.println("\nVOCÊ ERROU!");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "O “lamacento”, com seus braços gigantescos, estica-os por baixo da ponte\npega um punhado de lama, criando assim uma espécie de bola e a arremessa em sua direção.");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf("Hawk: %S NÃÃÃÃOOOO....", nome_jogador);
                                tempoPadraoAnimacao((300 * 10));
                                System.out.println(
                                                "A lama atinge em cheio o símbolo do “Inversor” no seu antebraço,\ndeixando-o irritado e grudento.\nO lamacento voltar para debaixo da ponte dando altos grunhidos.\n\n");
                                tempoPadraoAnimacao((300 * 10));
                                System.out.printf(
                                                "Hawk: Eu nem sei o que dizer %S...\nVocê precisa ter mais calma, leia e reflita atentamente sobre meus ensinamentos e as questões abordadas pelos monstros\nque eu tenho certeza de que essa marca irá sumir no fim dessa aventura.",
                                                nome_jogador);
                                vida -= dano_capitulo_dois;
                                System.out.printf("\nVocê sofre %d de dano. Agora você tem %d de vida restante\n",
                                                dano_capitulo_dois,
                                                vida);
                                acertou = true;
                                tempoPadraoAnimacao((300 * 10));
                        }
                }
                System.out.println(
                                "Hawk: Olha meu jovem, sei que está ficando cansado (a), mas não desanime.\nA partir de agora faremos uma maratona! Nosso tempo está ficando apertado e não podemos permanecer nesta floresta a noite toda.\nTudo bem? Precisamos chegar pelo menos no topo daquela colina para termos um lugar para acampar e ficar um pouco mais seguro.\nEntão se apresse.\n\n");
        }

        @Override
        public void tempoPadraoAnimacao(int intervalo) {
                try {
                        Thread.sleep(intervalo);
                } catch (InterruptedException ignored) {

                }
        }
}
