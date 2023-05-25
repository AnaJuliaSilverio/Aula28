package exercicio2;

import java.util.Random;

public class SeguroDeVida implements Tributos{
    private String nome;
    private String cpf;
    private int numeroDeId;

    public SeguroDeVida(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeId = geraNumeroId();
    }
    @Override
    public double calcularTributos() {
        return 42;
    }
    public static int geraNumeroId(){
        Random geradorDoDado = new Random();
        return geradorDoDado.nextInt(1900)+1900;
    }
}
