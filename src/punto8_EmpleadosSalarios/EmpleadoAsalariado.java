package punto8_EmpleadosSalarios;

class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String calcularSalario() {
        String salario=String.valueOf(salarioMensual);
        return salario + " mensuales";
    }
}

