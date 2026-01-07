public class Vehiculo {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Métodos get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    // Métodos acelerar y frenar
    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando");
    }
}
