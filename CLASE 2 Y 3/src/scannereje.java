import java.util.Scanner;

public class scannereje {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println(nombre);
        System.out.println(edad);

        scanner.close();
    }

}
