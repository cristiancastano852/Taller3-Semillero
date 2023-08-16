package punto10_FigurasEnUnLienzo;

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(String color, int posX, int posY, double ancho, double alto) {
        super(color, posX, posY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo de ancho " + ancho + ", alto " + alto + " en posición (" + getPosX() + ", " + getPosY() + ") y color " + getColor());
    }
}
