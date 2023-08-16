package punto1_figurasGeometricas;

public class Main1 {
    public void main(String[] args) {
        System.out.println("\n---Figuras Geométricas---");

        try {

            Circulo circulo = new Circulo("Círculo", 5);
            System.out.println(circulo.getNombre() + " - Radio: " + circulo.getRadio() +
                               ", Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());

            Triangulo triangulo = new Triangulo("Triángulo", 6, 4);
            System.out.println(triangulo.getNombre() + " - Base: " + triangulo.getBase() +
                               ", Altura: " + triangulo.getAltura() + ", Área: " + triangulo.calcularArea());
            try {
                System.out.println(triangulo.getNombre() + " - Área: " + triangulo.calcularArea() +
                                   ", Perímetro: " + triangulo.calcularPerimetro());
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }

            Cuadrado cuadrado = new Cuadrado("Cuadrado", 3);
            System.out.println(cuadrado.getNombre() + " - Lado: " + cuadrado.getLado() +
                               ", Área: " + cuadrado.calcularArea() + ", Perímetro: " + cuadrado.calcularPerimetro());
        } catch (MedidaInvalidaException e) {
            System.out.println("Error al crear la figura: " + e.getMessage());
        }
    }
}

