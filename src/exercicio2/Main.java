package exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Ana","123.456.789-00","12!3");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carla","444.476.779-00","12!3",500);
        SeguroDeVida seguroDeVida = new SeguroDeVida("João","987.456.123-88");

        contaCorrente.depositar(700);
        System.out.println(contaCorrente.toString());
        System.out.println();
        System.out.println(contaPoupanca.toString());
        System.out.println();
        System.out.println("Tributos Seguro de vida: "+seguroDeVida.calcularTributos());
    }
}
