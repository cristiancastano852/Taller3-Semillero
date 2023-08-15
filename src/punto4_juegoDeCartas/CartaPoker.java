package punto4_juegoDeCartas;

class CartaPoker extends Carta {
    public CartaPoker(String palo, String valor) {
        super(palo, valor);
    }

    @Override
    public int valorNumerico() {
        if (valor.equals("J")) {
            return 11;
        } else if (valor.equals("Q")) {
            return 12;
        } else if (valor.equals("K")) {
            return 13;
        } else if (valor.equals("A")) {
            return 14; // As puede tener el valor más alto en algunos juegos
        } else {
            return Integer.parseInt(valor); // Convertir otros valores numéricos a entero
        }
    }
}
