package punto10_FigurasEnUnLienzo;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("\n--- Figuras en un lienzo ---");
        IDibujable[] figuras = new IDibujable[3];
        figuras[0] = new Circulo("Morado", 10, 20, 5.0);
        figuras[1] = new Rectangulo("Negro", 30, 40, 8.0, 6.0);
        figuras[2] = new Triangulo("Naranja", 50, 60, 7.0, 4.0);

        Lienzo lienzo = new Lienzo(figuras);
        lienzo.dibujarTodo();
    }
}
