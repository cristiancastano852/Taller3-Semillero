package punto5_TiendaEnLinea;

abstract class ProductoBase implements IProducto {
    protected String nombre;
    protected double precio;
    protected CategoriaProducto categoria;

    public ProductoBase(String nombre, double precio, CategoriaProducto categoria) throws CategoriaInvalidaException {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    protected abstract boolean esCategoriaValida(CategoriaProducto categoria);
}
