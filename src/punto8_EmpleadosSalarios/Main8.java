package punto8_EmpleadosSalarios;

import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("\n--- Empleados y salarios ---");
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoAsalariado("Cristian", 3000));
        empleados.add(new EmpleadoPorHoras("Manuela", 20, 18));
        empleados.add(new EmpleadoPorHoras("Alexander", 45, 25));

        System.out.println("\nSalarios de los empleados:");

        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombre + ": $" + empleado.calcularSalario());
        }
    }
}
