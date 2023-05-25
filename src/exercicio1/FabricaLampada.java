package exercicio1;

import java.util.Scanner;

public class FabricaLampada {

    public Lampada construir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de lampada você deseja criar?");
        String tipoLampada = sc.next();
        Lampada lampadaCriada;
        return switch (tipoLampada.toLowerCase()) {
            case "incandescente" -> new Incandescente();
            case "fluorescente" -> new Fluorescente();
            default -> null;
        };
    }
}
