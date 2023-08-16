package punto1_figurasGeometricas;

public class Cuadrado extends FiguraBase {
    private double lado;

    public Cuadrado(String nombre, double lado) throws MedidaInvalidaException {
        super(nombre);
        verificarMedidaNoValida(lado, "lado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
}