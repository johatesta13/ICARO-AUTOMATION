public class PagoTransferencia extends Pago {
    private String cuentaBancaria;


    public PagoTransferencia(double monto, String fecha,String cuentaBancaria) {
        super(monto, fecha);
        this.cuentaBancaria= cuentaBancaria;

    }


    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public boolean ProcesarPago() {
        System.out.println("Procesando pago con transferencia bancaria...");
        System.out.println("Monto:  $" + getMonto());
        return true;
    }


}
