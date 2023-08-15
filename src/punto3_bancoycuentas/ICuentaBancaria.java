package punto3_bancoycuentas;

interface ICuentaBancaria {
    void depositar(double cantidad);
    void retirar(double cantidad) throws SaldoInsuficienteException;
    double consultarSaldo();
}