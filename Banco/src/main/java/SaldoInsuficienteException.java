public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }


    public SaldoInsuficienteException() {
        super("ERROR saldo insuficiente");
    }

    public SaldoInsuficienteException(double saldoactual, double monto){
        super("Saldo insuficiente. Saldo actual: $" + saldoactual + "Monto a retirar: $" + monto);
    }
}
