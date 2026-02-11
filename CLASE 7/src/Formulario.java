import java.util.Scanner;

public class Formulario{

    public static int solicitarEdad(Scanner scanner) {
        int edad = -1;
        boolean edadValida = false;

        while (!edadValida) {
            try {
                System.out.print("Ingrese su edad: ");
                String input = scanner.nextLine();

                // Intenta convertir a número - puede lanzar NumberFormatException
                edad = Integer.parseInt(input);

                // Validar rango
                if (edad < 0) {
                    System.out.println("❌ La edad no puede ser negativa");
                } else if (edad > 120) {
                    System.out.println("❌ La edad no puede ser mayor a 120");
                } else {
                    edadValida = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor ingrese un número válido");
                System.out.println("   (No use letras ni caracteres especiales)");
            }
        }

        return edad;
    }

    public static String solicitarNombre(Scanner scanner) {
        String nombre = "";
        boolean nombreValido = false;

        while (!nombreValido) {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("❌ El nombre no puede estar vacío");
            } else if (nombre.length() < 2) {
                System.out.println("❌ El nombre debe tener al menos 2 caracteres");
            } else {
                nombreValido = true;
            }
        }

        return nombre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FORMULARIO DE REGISTRO ===");
        System.out.println("Este formulario maneja errores sin cerrar la aplicación\n");

        // Solicitar nombre
        String nombre = solicitarNombre(scanner);
        System.out.println("✅ Nombre registrado: " + nombre + "\n");

        // Solicitar edad
        int edad = solicitarEdad(scanner);
        System.out.println("✅ Edad registrada: " + edad + "\n");

        // Confirmar registro
        System.out.println("=================================");
        System.out.println("✅ REGISTRO EXITOSO");
        System.out.println("=================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("=================================");

        scanner.close();

        System.out.println("\n💡 Nota: El programa nunca se cerró por errores del usuario");
        System.out.println("   Esto es lo que hace el manejo de excepciones: robustez");
    }
}
