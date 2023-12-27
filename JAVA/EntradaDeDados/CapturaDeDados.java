package EntradaDeDados;

import java.util.Scanner;

public class CapturaDeDados {
    Scanner input = new Scanner(System.in);

    public String entradaTexto() {// Ângelo - Método para a entrada tipo String;
        String entradaUsuarioTexto = input.next();
        return entradaUsuarioTexto;
    }

    public int entradaNumero() {
        int entradaUsuarioNumero = input.nextInt();
        return entradaUsuarioNumero;
    }
}
