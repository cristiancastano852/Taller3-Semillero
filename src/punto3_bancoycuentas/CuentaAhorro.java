package punto3_bancoycuentas;


class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException{
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad + " unidades.");
        }
        saldo -= cantidad;
        System.out.println("Se retiraron " + cantidad + " unidades. Saldo actual: " + saldo);
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}
