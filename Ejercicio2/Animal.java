public class Animal {
    public void hacerSonido() {
        System.out.println("Animal hace un sonido genérico");
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Animal) {
            return this.getClass().equals(obj.getClass());
        }
        return false;
    }
}
