package exercicio1;

public class Incandescente extends FabricaLampada implements Lampada{

        @Override
        public void ligar() {
                System.out.println("Lampada incadescente ligada ");
        }

        @Override
        public void desligar() {
                System.out.println("Lampada incadescente desligada ");
        }

}
