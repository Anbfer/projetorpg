package Jogo.Mecanicas;

import java.util.Random;

public class Dano {

    public int danoAleatorio(int dano_minimo, int dano_maximo) {
        Random aleatorio = new Random();
        int dano_sofrido = 0;

        dano_minimo = 1;
        dano_maximo = 2;

        dano_sofrido = aleatorio.nextInt(dano_maximo - dano_minimo) + dano_minimo;

        return dano_sofrido;
    }
}
