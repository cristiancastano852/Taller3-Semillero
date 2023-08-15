package punto1_figurasGeometricas;

class Circulo extends FiguraBase {
    private double radio;

    public Circulo(String nombre, double radio) throws MedidaInvalidaException {
        super(nombre);
        verificarMedidaNoValida(radio, "radio");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
}