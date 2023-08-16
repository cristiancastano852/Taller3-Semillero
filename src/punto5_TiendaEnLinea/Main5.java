package punto5_TiendaEnLinea;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("\n---Tienda en línea---");

        Electronica categoriaElectronica = new Electronica();
        Ropa categoriaRopa = new Ropa();
        Libros categoriaLibros = new Libros();

        TiendaEnLinea tienda = new TiendaEnLinea();
        System.out.println("Bienvenido a la tienda en linea");
        System.out.println("Agregando productos al catalogo...");
        try {
            IProducto televisor = new Televisor("Televisor SMART TV", 999, 52, categoriaElectronica);
            IProducto Chaqueta = new Chaqueta("Chaqueta negra", 49, "L", categoriaRopa);
            IProducto libro = new Libro("Building Microservices", 19, "Sam Newman", categoriaLibros);

            tienda.agregarProducto(televisor);
            tienda.agregarProducto(Chaqueta);
            tienda.agregarProducto(libro);

            System.out.println("Mostrando productos del catalogo...");
            tienda.mostrarCatalogo();

            // Esto lanzará la excepción CategoriaInvalidaException
            //IProducto pantalon = new Libro("Jean slim", 29, "Sam Newman", categoriaElectronica);

        } catch (CategoriaInvalidaException e) {
            System.out.println("Tenemos un error: " + e.getMessage());
        }
    }
}
