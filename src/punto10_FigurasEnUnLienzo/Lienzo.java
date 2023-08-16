package punto10_FigurasEnUnLienzo;

class Lienzo {
    private IDibujable[] dibujables;

    public Lienzo(IDibujable[] dibujables) {
        this.dibujables = dibujables;
    }

    public void dibujarTodo() {
        System.out.println("Dibujando en el lienzo:");

        for (IDibujable dibujable : dibujables) {
            dibujable.dibujar();
        }
    }
}
