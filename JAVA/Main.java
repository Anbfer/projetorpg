import Menu.TelaInicial;
import Animacao.TelaBoasVindas;

public class Main {

    // ------------------- ANIMAÇÃO -------------------------//
    // ------------------- INSTRUÇÕES -----------------------//
    // ------------------- MÉTODO QUE INICIA O JOGO ---------//
    // ------------------- MÉDOTO DOS CRÉDITOS --------------//
    // ----- MÉTODOS DE CAPTURA DE ENTRADA DO JOGADOR -------//
    // ------------------- PARTE DAS PERGUNTAS---------------//
    // ------------------- PARTE DE PERSONALIZAÇÃO-----------//
    // ------------------- Menu principal -------------------//
    // ------------------- Tela de abertura do jogo ---------//
    // ------------------- Capitulo 1 -----------------------//
    // ------------------- Capitulo 2 -----------------------//
    // ------------------- Capitulo 3 -----------------------//
    // ------------------- Prologo --------------------------//

    public static void main(String[] args) {
        TelaBoasVindas bemVindo = new TelaBoasVindas();
        TelaInicial tela = new TelaInicial();
        bemVindo.imprimeBoasVindas();// animação de boas vindas ao jogo
        tela.telaInicial();// tela inicial que da a opção de continuar ou sair do jogo
    }
}