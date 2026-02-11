public class Errorcompilacion {
    public static void main(String[] args) {
        // Error 1: Falta punto y coma
        int numero = 10;

        // Error 2: Variable no declarada
        //resultado1 = numero * 2;

        // Error 3: Tipo incorrecto
        //String texto = 123;

        // Error 4: Método que no existe
        // System.out.imprimirTexto("Hola");

        // Código correcto:
        int numero2 = 10;
        int resultado = numero * 2;
        System.out.println("Resultado: " + resultado);
    }
}
