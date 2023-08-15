package punto5_TiendaEnLinea;

abstract class CategoriaProducto {
    protected String nombreCategoria;

    public CategoriaProducto(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }
}
