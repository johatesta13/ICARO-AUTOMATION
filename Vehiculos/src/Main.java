public class Main {
    public static void main(String[] args) {
        // Crear instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);

        // Crear instancia de Coche
        Coche coche = new Coche("Ford", "Mustang", 2021, 5000);

        // Imprimir detalles del vehículo
        System.out.println("=== VEHÍCULO ===");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Año: " + vehiculo.getAño());
        vehiculo.acelerar();

        System.out.println();

        // Imprimir detalles del coche
        System.out.println("=== COCHE ===");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Cilindrada: " + coche.getCilindrada());
        coche.acelerar();
    }
}
