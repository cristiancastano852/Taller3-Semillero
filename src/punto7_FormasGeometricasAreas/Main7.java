package punto7_FormasGeometricasAreas;

import punto1_figurasGeometricas.*;

public class Main7 {
    public void main(String[] args) throws MedidaInvalidaException {

        /*Para este punto usamos lo que tenimos el el punto 1, el metodo carlcularArea() ya lo teniamos implementado,
         * solo tuvimos que convertir las clases publicas para poder importarlas desde acá. con esto, creamos el array de
         * IFiguraGeometricas y usamos el polimorfismo para poder usar el metodo calcularArea() de cada una de las clases
        */

        // Crear un array de 3 figuras geométricas (2 círculos y 1 cuadrado) y mostrar el área de cada una de ellas.
        IFiguraGeometrica[] formas = new IFiguraGeometrica[3];
        formas[0] = new Circulo("Círculo", 5);
        formas[1] = new Cuadrado("Cuadrado", 3);
        formas[2] = new Triangulo("Triángulo", 6, 4);

        System.out.println("Áreas de las figuras geométricas, usando POLIMORFISMO:");
        for (IFiguraGeometrica forma : formas) {
            System.out.println(forma.getNombre() + ", Área: " + forma.calcularArea());
        }
    }
}
