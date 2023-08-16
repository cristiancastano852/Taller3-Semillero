import java.util.Scanner;

import punto10_FigurasEnUnLienzo.Main10;
import punto1_figurasGeometricas.Main1;
import punto1_figurasGeometricas.MedidaInvalidaException;
import punto2_sistemaDeNotificaciones.Main2;
import punto3_bancoycuentas.Main3;
import punto4_juegoDeCartas.Main4;
import punto5_TiendaEnLinea.Main5;
import punto6_animalesYsonidos.Main6;
import punto7_FormasGeometricasAreas.Main7;
import punto8_EmpleadosSalarios.Main8;
import punto9_InstrumentosMusicales.Main9;

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
                    exit=againMain();
                    break;
                case 2:
                    point2();
                    exit=againMain();
                    break;
                case 3:
                    point3();
                    exit=againMain();
                    break;
                case 4:
                    point4();
                    exit=againMain();
                    break;

                case 5:
                    point5();
                    exit=againMain();
                    break;
                case 6:
                    point6();
                    exit=againMain();
                    break;
                case 7:
                    point7();
                    break;
                case 8:
                    point8();
                    exit=againMain();
                    break;
                case 9:
                    point9();
                    exit=againMain();
                    break;
                case 10:
                    point10();
                    exit=againMain();
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
        //Figuras Geométricas
        Main1 punto1 = new Main1();
        punto1.main(null);
    }

    public static void point2() {
        //Sistemas de Notificaciones
        Main2 punto2 = new Main2();
        punto2.main(null);
    }

    public static void point3() {
        //Banco y cuentas
        Main3 punto3 = new Main3();
        punto3.main(null);
    }

    public static void point4() {
        //Juego de cartas
        Main4 punto4 = new Main4();
        punto4.main(null);
    }

    public static void point5() {
        //Tienda en línea
        Main5 punto5 = new Main5();
        punto5.main(null);

    }

    public static void point6() {
        //Animales y sonidos
        Main6 punto6 = new Main6();
        punto6.main(null);
        

    }

    public static void point7() {
        //Formas geométricas y áreas
        Main7 punto7 = new Main7();
        try {
            punto7.main(null);
        } catch (MedidaInvalidaException e) {
            e.printStackTrace();
        }
    }

    public static void point8() {
        //Empleados y salarios
        Main8 punto8 = new Main8();
        punto8.main(null);

    }

    public static void point9() {
        //Instrumentos musicales
        Main9 punto9 = new Main9();
        punto9.main(null);

    }

    public static void point10() {
        //Figuras en un lienzo
        Main10 punto10 = new Main10();
        punto10.main(null);

    }

    
    public static boolean againMain() {
        Scanner scanner = new Scanner(System.in);
        boolean end=false;
        System.out.println("\nDesea regresar al menú principal: ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        int opcion = scanner.nextInt();
        if(opcion!=1){
            end=true;
        }
        return end;
}
}