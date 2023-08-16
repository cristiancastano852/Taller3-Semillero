package punto1_figurasGeometricas;

public class Triangulo extends FiguraBase {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) throws MedidaInvalidaException {
        super(nombre);
        verificarMedidaNoValida(base, "base");
        verificarMedidaNoValida(altura, "altura");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // No todos los triángulos tienen un cálculo simple de perímetro, aquí se podría lanzar una excepción
        throw new UnsupportedOperationException("El cálculo del perímetro para este triángulo no está definido.");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}