package punto10_FigurasEnUnLienzo;

class Circulo extends Figura {
    private double radio;

    public Circulo(String color, int posX, int posY, double radio) {
        super(color, posX, posY);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio + " en posición (" + getPosX() + ", " + getPosY() + ") y color " + getColor());
    }
}
