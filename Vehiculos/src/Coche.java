public class Coche extends Vehiculo {
    // Propiedad adicional privada
    private int cilindrada;

    // Constructor
    public Coche(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    // Métodos get y set para cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Método acelerar() sobrescrito
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }
}
