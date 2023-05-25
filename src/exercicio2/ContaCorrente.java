package exercicio2;

public class ContaCorrente extends Conta implements Tributos{
    double limiteChequeEspecial;

    public ContaCorrente(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        limiteChequeEspecial = 1000;
    }

    @Override
    public double calcularTributos() {
        return (0.01*saldo);
    }
    public void aumentarChequeEspecial(double valor){
        limiteChequeEspecial+=valor;
    }

    @Override
    public String toString() {
        return "Tipo da Conta: Corrente\n"+super.toString()+"Cheque especial: "+limiteChequeEspecial+"\nTributos: "+calcularTributos();
    }
}
