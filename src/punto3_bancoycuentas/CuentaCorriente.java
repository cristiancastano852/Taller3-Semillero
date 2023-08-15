package punto3_bancoycuentas;

class CuentaCorriente extends Cuenta {
    private double limiteCredito;

    public CuentaCorriente(double saldoInicial, double limiteCredito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo + limiteCredito) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad + " unidades.");
        }
        saldo -= cantidad;
        System.out.println("Se retiraron " + cantidad + " unidades. Saldo actual: " + saldo);
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
