package exercicio1;

public class Fluorescente extends FabricaLampada implements Lampada{
    @Override
    public void ligar() {
        System.out.println("Lampada flurescente ligada ");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada flurescente desligada ");
    }
}
