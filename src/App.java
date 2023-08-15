import java.util.Scanner;

import punto1_figurasGeometricas.Main1;
import punto2_sistemaDeNotificaciones.Main2;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("       \nMenú Principal");
            System.out.println("1. punto 1: Figuras Geométricas");
            System.out.println("2. punto 2: Sistemas de Notificaciones");
            System.out.println("3. punto 3: Banco y cuentas");
            System.out.println("4. punto 4: Juego de cartas");
            System.out.println("5. punto 5: Tienda en línea");
            System.out.println("6. punto 6: Animales y sonidos");
            System.out.println("7. punto 7: Formas geométricas y áreas");
            System.out.println("8. punto 8: Empleados y salarios");
            System.out.println("9. punto 9: Instrumentos musicales");
            System.out.println("10. punto 10: Figuras en un lienzo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int point = scanner.nextInt();

            switch (point) {
                case 1:
                    point1();
                    break;
                case 2:
                    point2();
                    break;
                case 3:
                    point3();
                    break;
                case 4:
                    point4();
                    break;

                case 5:
                    point5();
                    break;
                case 6:
                    point6();
                    break;
                case 7:
                    point7();
                    break;
                case 8:
                    point8();
                    break;
                case 9:
                    point9();
                    break;
                case 10:
                    point10();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

        }
        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    public static void point1() {
        Main1 punto1 = new Main1();
        punto1.main(null);
    }

    public static void point2() {
        Main2 punto1 = new Main2();
        punto1.main(null);
    }

    public static void point3() {

    }

    public static void point4() {

    }

    public static void point5() {

    }

    public static void point6() {

    }

    public static void point7() {

    }

    public static void point8() {

    }

    public static void point9() {

    }

    public static void point10() {

    }
}