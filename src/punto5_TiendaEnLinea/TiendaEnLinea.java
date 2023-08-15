package punto5_TiendaEnLinea;

import java.util.ArrayList;
import java.util.List;

class TiendaEnLinea {
    private List<IProducto> productos;

    public TiendaEnLinea() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    public void mostrarCatalogo() {
        for (IProducto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}
