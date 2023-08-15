package punto4_juegoDeCartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        // Agrega cartas a la baraja (puedes personalizar esto según el juego)
        // Por ejemplo, para un juego de póker:
        String[] simbolos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String simbolo : simbolos) {
            for (String valor : valores) {
                cartas.add(new CartaPoker(simbolo, valor));
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() throws OperacionInvalidaException {
        if (cartas.isEmpty()) {
            throw new OperacionInvalidaException("No quedan cartas en la baraja.");
        }
        return cartas.remove(0);
    }
}
