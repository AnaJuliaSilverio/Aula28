package exercicio1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        FabricaLampada fabricaLampada = new FabricaLampada();
        Lampada lampadaCriadaUsuario;

        lampadaCriadaUsuario = fabricaLampada.construir();
        lampadaCriadaUsuario.ligar();

    }
}