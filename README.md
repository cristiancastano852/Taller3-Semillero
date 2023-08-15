## TALLER 3

REALIZADO POR: CRISTIAN ALEXANDER CASTAÑO MONTOYA

EMPRESA: SOFTLOND

TALLER 3 - SEMILLERO

## PUNTOS TALLER:

1. Figuras geométricas: Crea una jerarquía de clases que representan diferentes figuras geométricas, como círculos, triángulos y cuadrados. Utiliza una interfaz para definir métodos comunes como cálculo de área y perímetro. Cada figura debe tener su propia implementación de estos métodos.

2. Sistema de notificaciones: Diseña un sistema de notificaciones que pueda manejar varios tipos de notificaciones, como correos electrónicos, mensajes de texto y notificaciones push. Crea una interfaz que defina un método enviar y clases abstractas para cada tipo de notificación. Luego, implementa las clases concretas para cada tipo de notificación.

3. Banco y cuentas: Desarrolla un sistema bancario que incluya una interfaz para representar cuentas bancarias y métodos para depositar y retirar dinero. Crea una clase abstracta que implemente parte de la lógica común de las cuentas, y luego implementa clases concretas para diferentes tipos de cuentas, como cuentas de ahorro y cuentas corrientes.

4. Juego de cartas: Crea un juego de cartas en el que puedas representar diferentes tipos de cartas (por ejemplo, cartas de póker) utilizando una jerarquía de clases y una interfaz. La interfaz podría definir métodos como mostrarCarta y valorNumerico. Luego, implementa clases para los diferentes tipos de cartas y para la baraja.

5. Tienda en línea: Construye un sistema básico para una tienda en línea. Crea una interfaz para representar productos y métodos como calcularPrecio y mostrarDetalles. Luego, implementa clases abstractas para diferentes categorías de productos (electrónica, ropa, libros, etc.) y clases concretas para productos específicos en cada categoría.

6. Animales y sonidos: Crea una jerarquía de clases que representen diferentes tipos de animales, como perros, gatos y pájaros. Cada clase de animal debe tener un método hacerSonido() que imprima el sonido característico del animal. Luego, crea un array de animales y recorre el array llamando al método hacerSonido() en cada uno. Esto demuestra cómo el polimorfismo permite tratar objetos de diferentes clases de manera uniforme.

7. Formas geométricas y áreas: Utiliza la jerarquía de clases de formas geométricas que creaste en el ejercicio anterior (con interfaces y clases abstractas). Agrega un método calcularArea() a la interfaz de las formas y luego implementa este método en las clases concretas. Crea un array de formas y calcula el área de cada una utilizando polimorfismo.

8. Empleados y salarios: Crea una jerarquía de clases para representar diferentes tipos de empleados, como asalariados y por horas. Cada clase debe tener un método para calcular el salario. Utiliza el polimorfismo para calcular el salario de diferentes tipos de empleados en un array.

9. Instrumentos musicales: Diseña una jerarquía de clases para instrumentos musicales, como guitarras, pianos y violines. Cada instrumento debe tener un método tocar() que imprima cómo suena. Luego, crea un método que acepte un arreglo de instrumentos y los haga tocar a todos utilizando polimorfismo.

10. Figuras en un lienzo: Crea una interfaz llamada Dibujable que tenga un método dibujar() y una clase abstracta Figura que implemente esta interfaz. Luego, implementa diferentes clases de figuras (círculos, rectángulos, etc.) que extiendan la clase Figura. Crea una clase Lienzo que tenga un arreglo de objetos Dibujable y, utilizando polimorfismo, llama al método dibujar() en cada objeto.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
