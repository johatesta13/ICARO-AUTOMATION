//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PagoTarjeta pagoTarje = new PagoTarjeta(150.50,"2025-01-07","435353563632636","123");

    PagoTransferencia pagoTransfe = new PagoTransferencia(200.00, "2025-01-07", "3930912021030919393");

    System.out.println("Procesando pagos");

    boolean resultado1 = pagoTarje.ProcesarPago();

    System.out.println("Resultado:   "+ (resultado1 ? "Existoso" : "Falló"));

    boolean resultado2 = pagoTransfe.ProcesarPago();

    System.out.println("Resultado:   "+ (resultado2 ? "Existoso" : "Falló"));


    Pago pago1 = new PagoTarjeta(150.50,"2025-01-07","435353563632636","123");
    Pago pago2 =  new PagoTransferencia(200.00, "2025-01-07", "3930912021030919393");

    pago1.ProcesarPago();

    System.out.println();

    pago2.ProcesarPago();
}
