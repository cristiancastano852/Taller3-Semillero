package punto4_juegoDeCartas;

public class Main4 {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        System.out.println("\nMezclando el mazo...");
        baraja.mezclar();

        try {
            System.out.println("Repartiendo 5 cartas...");
            System.out.println("Tu mano es: ");

            for (int i = 0; i < 5; i++) {
                Carta carta = baraja.repartirCarta();
                carta.mostrarCarta();
            }
        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
