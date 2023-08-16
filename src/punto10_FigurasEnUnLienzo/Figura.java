package punto10_FigurasEnUnLienzo;

abstract class Figura implements IDibujable {
    private String color;
    private int posX;
    private int posY;

    public Figura(String color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    // Implementación del método dibujar de la interfaz Dibujable
    @Override
    public abstract void dibujar();
}
