package Atv1;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mingal");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
