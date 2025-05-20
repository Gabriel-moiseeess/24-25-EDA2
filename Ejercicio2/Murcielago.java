public class Murcielago extends Animal implements Volador {
    @Override
    public void hacerSonido() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void volar() {
        System.out.println("El murciélago está volando");
    }
}

