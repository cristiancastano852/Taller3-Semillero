package punto5_TiendaEnLinea;

class CategoriaInvalidaException extends Exception {
    public CategoriaInvalidaException(String mensaje) {
        super(mensaje);
    }
}