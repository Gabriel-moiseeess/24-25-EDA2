public class Frame {

    private final Pixel[][] pixeles;
    private final Resolucion resolucion;

    public Frame(Resolucion resolucion) {
        this.resolucion = resolucion;
        int ancho = resolucion.obtenerAncho();
        int alto = resolucion.obtenerAlto();

        pixeles = new Pixel[ancho][alto];
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < alto; y++) {
                pixeles[x][y] = new Pixel();
                pixeles[x][y].establecerColor(0);                
            }
        }        
    }

    public Pixel obtenerPixel(Coordenada coordenada) {
        return pixeles[coordenada.obtenerX()][coordenada.obtenerY()];
    }

    public void establecerPixel(Coordenada coordenada, int color) {
        pixeles[coordenada.obtenerX()][coordenada.obtenerY()].establecerColor(color);
    }

    public Resolucion obtenerResolucion() {
        return resolucion;
    }
}

