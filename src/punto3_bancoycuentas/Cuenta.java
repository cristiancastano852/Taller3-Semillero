package punto3_bancoycuentas;

abstract class Cuenta implements ICuentaBancaria {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron " + cantidad + " unidades. Saldo actual: " + saldo);
        }else{
            System.out.println("No se puede depositar una cantidad negativa");
        }	
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
