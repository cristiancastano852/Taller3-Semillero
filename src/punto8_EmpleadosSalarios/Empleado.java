package punto8_EmpleadosSalarios;

abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract String calcularSalario();
}
