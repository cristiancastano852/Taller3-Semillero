package punto5_TiendaEnLinea;

class Chaqueta extends ProductoBase {
    private String talla;

    public Chaqueta(String nombre, double precio, String talla, Ropa categoria) throws CategoriaInvalidaException {
        super(nombre, precio, categoria);
        this.talla = talla;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Categoría: " + categoria.getNombreCategoria() +
                           ", Precio: $" + precio + ", Talla: " + talla);
    }

    @Override
    protected boolean esCategoriaValida(CategoriaProducto categoria) {
        return categoria instanceof Ropa;
    }
}
