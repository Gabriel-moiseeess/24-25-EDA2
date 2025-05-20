public class DemoPolimorfismo {
    public static void main(String[] args) {

        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Animal a3 = new Lobo();
        Animal a4 = new Murcielago();

        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();
        a4.hacerSonido();

        if (a1 instanceof Perro) {
            ((Perro) a1).moverCola();
        }

        if (a2 instanceof Gato) {
            ((Gato) a2).ronronear();
        }

        Animal[] animales = new Perro[2];
        animales[0] = new Perro();

        Animal otroPerro = new Perro();
        System.out.println(a1.equals(otroPerro));

        if (a4 instanceof Volador) {
            ((Volador) a4).volar();
        }
    }
}
