package punto3_bancoycuentas;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("\n---Banco y cuentas---");

        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000, 0.05);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);

        try {
            cuentaAhorro.depositar(500);
            cuentaAhorro.retirar(300);
            
            System.out.println("Saldo cuenta de ahorro: " + cuentaAhorro.consultarSaldo());
            System.out.println("Tasa de interés: " + cuentaAhorro.getTasaInteres());

            cuentaCorriente.depositar(300);
            cuentaCorriente.retirar(700);
            System.out.println("Saldo cuenta corriente: " + cuentaCorriente.consultarSaldo());
            System.out.println("Límite de crédito: " + cuentaCorriente.getLimiteCredito());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
