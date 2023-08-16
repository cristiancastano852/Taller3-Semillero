package punto10_FigurasEnUnLienzo;

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String color, int posX, int posY, double base, double altura) {
        super(color, posX, posY);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de base " + base + ", altura " + altura + " en posición (" + getPosX() + ", " + getPosY() + ") y color " + getColor());
    }
}
