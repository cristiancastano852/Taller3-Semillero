package punto5_TiendaEnLinea;

class Libro extends ProductoBase {
    private String autor;

    public Libro(String nombre, double precio, String autor, Libros categoria) throws CategoriaInvalidaException {
        super(nombre, precio, categoria);
        this.autor = autor;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Categoría: " + categoria.getNombreCategoria() +
                           ", Precio: $" + precio + ", Autor: " + autor);
    }

    @Override
    protected boolean esCategoriaValida(CategoriaProducto categoria) {
        return categoria instanceof Libros;
    }
}
