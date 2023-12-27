package Jogo.Alternativas;

import java.util.ArrayList;

public class Alternativas {

    public void alternativa_pergunta_um() {
        // Nery & Alessandro - Perguntas e história a serem usadas no jogo

        ArrayList<String> pergunta_um_alternativas = new ArrayList<String>();
        pergunta_um_alternativas.add("(A) 1310 & 2022");
        pergunta_um_alternativas.add("(B) 1182 & 2022");
        pergunta_um_alternativas.add("(C) 1564 & 2120");
        pergunta_um_alternativas.add("(D) 1296 & 1925");
        pergunta_um_alternativas.add("(E) 1309 & 2000");

        for (String string : pergunta_um_alternativas) {
            System.out.println(string);
        }

    }

    public void alternativa_pergunta_dois() {
        ArrayList<String> pergunta_dois_alternativas = new ArrayList<String>();
        pergunta_dois_alternativas.add("1 - Alternativas II & IV estão corretas");
        pergunta_dois_alternativas.add("2 - Alternativas III & I estão corretas");
        pergunta_dois_alternativas.add("3 - Somente III & I estão corretas");
        pergunta_dois_alternativas.add("4 - Somente II, IV & V estão corretas");
        pergunta_dois_alternativas.add("5 - Alternativas I & III estão corretas");

        for (String string : pergunta_dois_alternativas) {
            System.out.println(string);
        }
    }

    public void alternativa_pergunta_tres() {
        ArrayList<String> pergunta_tres_alternativas = new ArrayList<String>();
        pergunta_tres_alternativas.add("(A) - 0 + 1 + 0 + 1 = 0");
        pergunta_tres_alternativas.add("(B) - 1 + 1 + 1 + 1 = 1");
        pergunta_tres_alternativas.add("(C) - 1 + 1 + 0 + 0 = 1");
        pergunta_tres_alternativas.add("(D) - 0 + 0 + 0 + 1 = 1");

        for (String string : pergunta_tres_alternativas) {
            System.out.println(string);
        }
    }

    public void alternativa_pergunta_quatro() {
        ArrayList<String> pergunta_quatro_alternativas = new ArrayList<String>();
        pergunta_quatro_alternativas.add("(A) Alan Turin");
        pergunta_quatro_alternativas.add("(B) Elon Musk");
        pergunta_quatro_alternativas.add("(C) Grace Hopper");
        pergunta_quatro_alternativas.add("(D) Ada Lovelace");

        for (String string : pergunta_quatro_alternativas) {
            System.out.println(string);
        }
    }

    public boolean alternativa_pergunta_cinco(int sim_nao) {
        boolean certo_errado = false;
        if (sim_nao == 0) {
            certo_errado = true;
        } else if (sim_nao == 1) {
            return certo_errado;
        }

        return certo_errado;
    }
}
