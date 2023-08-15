package punto1_figurasGeometricas;

public abstract class FiguraBase implements IFiguraGeometrica{
    protected String nombre;

    public FiguraBase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método para verificar medidas no válidas
    protected void verificarMedidaNoValida(double medida, String tipoMedida) throws MedidaInvalidaException {
        if (medida <= 0) {
            System.out.println("La " + medida + " debe ser mayor que cero.");
            throw new MedidaInvalidaException("La " + tipoMedida + " debe ser mayor que cero.");
        }
    }
}
