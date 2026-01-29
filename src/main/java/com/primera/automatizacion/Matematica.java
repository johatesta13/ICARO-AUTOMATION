package com.primera.automatizacion;

public class Matematica {

    /**
     * Suma dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la suma de a + b
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return la resta de a - b
     */
    public static int resta(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros
     * @param a primer número
     * @param b segundo número
     * @return el producto de a × b
     */
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros
     * @param a dividendo
     * @param b divisor
     * @return el cociente de a / b como double
     * @throws ArithmeticException si b es cero
     */
    public static double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
