package punto8_EmpleadosSalarios;

class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String calcularSalario() {
        return "Trabajó " + horasTrabajadas + " horas, "+ "a una tarifa de "+tarifaPorHora+ ". Su salario es de $" + (horasTrabajadas * tarifaPorHora);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
}