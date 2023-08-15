package punto4_juegoDeCartas;

abstract class Carta implements ICarta {
    protected String simbolo;
    protected String valor;

    public Carta(String simbolo, String valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        System.out.println(valor + " de " + simbolo);
    }
}
