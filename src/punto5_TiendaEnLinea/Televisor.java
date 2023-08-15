package punto5_TiendaEnLinea;

class Televisor extends ProductoBase {
    private int pulgadas;

    public Televisor(String nombre, double precio, int pulgadas, Electronica categoria)  throws CategoriaInvalidaException{
        super(nombre, precio, categoria);
        this.pulgadas = pulgadas;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Categoría: " + categoria.getNombreCategoria() +
                           ", Precio: $" + precio + ", Pulgadas: " + pulgadas);
    }

    @Override
    protected boolean esCategoriaValida(CategoriaProducto categoria) {
        return categoria instanceof Electronica;
    }
}
