public class PantallaEntrelazada {

    private final int ancho;
    private final int alto;
    private final ListaCircularFrames listaFrames;

    public PantallaEntrelazada(Resolucion resolucion) {
        this.ancho = resolucion.obtenerAncho();
        this.alto = resolucion.obtenerAlto();
        listaFrames = new ListaCircularFrames(2, new Resolucion(ancho / 2, alto));
    }

    public void renderizar() {
        for (int fila = 0; fila < alto; fila++) {
            for (int i = 0; i < listaFrames.tamaño(); i++) {
                Frame unFrame = listaFrames.obtenerActual();
                for (int columna = 0; columna < ancho / 2; columna++) {
                    Coordenada coordenada = new Coordenada(columna, fila);
                    Pixel pixel = unFrame.obtenerPixel(coordenada);
                    System.out.print(pixel.obtenerColor() + "|");
                }
            }
            System.out.println();
        }
    }

    public void establecerPixel(Coordenada coordenada, int color) {
        int mitad = ancho / 2;
        int indiceFrame = coordenada.obtenerX() >= mitad ? 1 : 0;
        int xRelativo = coordenada.obtenerX() - (mitad * indiceFrame);
        Coordenada coordenadaRelativa = new Coordenada(xRelativo, coordenada.obtenerY());
        Frame frame = listaFrames.obtenerFrame(indiceFrame);
        frame.establecerPixel(coordenadaRelativa, color);
    }
}

