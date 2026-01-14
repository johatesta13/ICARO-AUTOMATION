public class ClienteVip extends Cliente {
    private double tasaPreferencial;

    public ClienteVip(String nombre, String dni) {
        super(nombre, dni); // Llama al constructor del padre
        this.tasaPreferencial = 0.05; // 5% extra
    }

    // Sobrescritura del método depositar
    @Override
    public void depositar(double monto) {
        double montoConBonificacion = monto + (monto * tasaPreferencial);
        this.saldo += montoConBonificacion;
        System.out.println("Depósito VIP realizado con bonificación del " +
                (tasaPreferencial * 100) + "%");
        System.out.println("Saldo actual: $" + saldo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("CLIENTE VIP");
        super.mostrarInfo(); // Llama al método del padre
        System.out.println("Tasa preferencial: " + (tasaPreferencial * 100) + "%");
    }
}
