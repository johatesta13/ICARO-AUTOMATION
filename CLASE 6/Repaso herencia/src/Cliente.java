public class Cliente {
    protected String nombre;
    protected String dni;
    protected double saldo;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depósito realizado. Saldo actual: $" + saldo);
    }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " - DNI: " + dni + " - Saldo: $" + saldo);
    }


}
