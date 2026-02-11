package com.primeros.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Clase de pruebas para Matematica
 * Contiene 24 tests que cubren todos los escenarios de las 4 operaciones
 */
public class MatematicaTest {

    // =======================================
    // TESTS PARA SUMA (11 tests)
    // =======================================

    /**
     * Test 1: Sumar dos números positivos
     * Escenario: 5 + 3
     * Resultado esperado: 8
     */
    @Test
    public void validarSumarDosPositivos() {
        int resultado = Matematica.suma(5, 3);
        Assert.assertEquals(resultado, 8, "5 + 3 debería ser 8");
    }

    /**
     * Test 2: Sumar números grandes
     * Escenario: 1000 + 2000
     * Resultado esperado: 3000
     */
    @Test
    public void validarSumarNumerosGrandes() {
        int resultado = Matematica.suma(1000, 2000);
        Assert.assertEquals(resultado, 3000, "1000 + 2000 debería ser 3000");
    }

    /**
     * Test 3: Sumar dos números negativos
     * Escenario: -5 + (-3)
     * Resultado esperado: -8
     */
    @Test
    public void validarSumarDosNegativos() {
        int resultado = Matematica.suma(-5, -3);
        Assert.assertEquals(resultado, -8, "-5 + (-3) debería ser -8");
    }

    /**
     * Test 4: Sumar positivo con negativo
     * Escenario: 10 + (-3)
     * Resultado esperado: 7
     */
    @Test
    public void validarSumarPositivoConNegativo() {
        int resultado = Matematica.suma(10, -3);
        Assert.assertEquals(resultado, 7, "10 + (-3) debería ser 7");
    }

    /**
     * Test 5: Sumar negativo con positivo
     * Escenario: -10 + 5
     * Resultado esperado: -5
     */
    @Test
    public void validarSumarNegativoConPositivo() {
        int resultado = Matematica.suma(-10, 5);
        Assert.assertEquals(resultado, -5, "-10 + 5 debería ser -5");
    }

    /**
     * Test 6: Sumar positivo con cero (elemento neutro)
     * Escenario: 1 + 0
     * Resultado esperado: 1
     */
    @Test
    public void validarSumarPositivoConCero() {
        int resultado = Matematica.suma(1, 0);
        Assert.assertEquals(resultado, 1, "Sumar 0 no debería cambiar el número");
    }

    /**
     * Test 7: Sumar negativo con cero
     * Escenario: -7 + 0
     * Resultado esperado: -7
     */
    @Test
    public void validarSumarNegativoConCero() {
        int resultado = Matematica.suma(-7, 0);
        Assert.assertEquals(resultado, -7, "Sumar 0 no debería cambiar el número");
    }

    /**
     * Test 8: Sumar cero con cero
     * Escenario: 0 + 0
     * Resultado esperado: 0
     */
    @Test
    public void validarSumarCeroConCero() {
        int resultado = Matematica.suma(0, 0);
        Assert.assertEquals(resultado, 0, "0 + 0 debería ser 0");
    }

    /**
     * Test 9: Sumar números que se neutralizan
     * Escenario: 7 + (-7)
     * Resultado esperado: 0
     */
    @Test
    public void validarSumarNumerosQueSeNeutralizan() {
        int resultado = Matematica.suma(7, -7);
        Assert.assertEquals(resultado, 0, "7 + (-7) debería ser 0");
    }

    /**
     * Test 10: Verificar propiedad conmutativa (a + b = b + a)
     * Escenario: 5 + 3 vs 3 + 5
     * Resultado esperado: ambos dan 8
     */
    @Test
    public void validarPropiedadConmutativa() {
        int resultado1 = Matematica.suma(5, 3);
        int resultado2 = Matematica.suma(3, 5);
        Assert.assertEquals(resultado1, resultado2, "a + b debería ser igual a b + a");
    }

    /**
     * Test 11: Verificar propiedad asociativa ((a + b) + c = a + (b + c))
     * Escenario: (2 + 3) + 4 vs 2 + (3 + 4)
     * Resultado esperado: ambos dan 9
     */
    @Test
    public void validarPropiedadAsociativa() {
        int resultado1 = Matematica.suma(Matematica.suma(2, 3), 4);
        int resultado2 = Matematica.suma(2, Matematica.suma(3, 4));
        Assert.assertEquals(resultado1, resultado2, "(a + b) + c debería ser igual a a + (b + c)");
    }

    // =======================================
    // TESTS PARA RESTA (3 tests)
    // =======================================

    /**
     * Test 12: Restar dos números positivos con resultado positivo
     * Escenario: 10 - 3
     * Resultado esperado: 7
     */
    @Test
    public void validarRestarDosPositivos() {
        int resultado = Matematica.resta(10, 3);
        Assert.assertEquals(resultado, 7, "10 - 3 debería ser 7");
    }

    /**
     * Test 13: Restar con resultado negativo
     * Escenario: 3 - 10
     * Resultado esperado: -7
     */
    @Test
    public void validarRestarResultadoNegativo() {
        int resultado = Matematica.resta(3, 10);
        Assert.assertEquals(resultado, -7, "3 - 10 debería ser -7");
    }

    /**
     * Test 14: Restar números iguales
     * Escenario: 5 - 5
     * Resultado esperado: 0
     */
    @Test
    public void validarRestarNumerosIguales() {
        int resultado = Matematica.resta(5, 5);
        Assert.assertEquals(resultado, 0, "5 - 5 debería ser 0");
    }

    // =======================================
    // TESTS PARA MULTIPLICACIÓN (5 tests)
    // =======================================

    /**
     * Test 15: Multiplicar dos números positivos
     * Escenario: 4 × 5
     * Resultado esperado: 20
     */
    @Test
    public void validarMultiplicarDosPositivos() {
        int resultado = Matematica.multiplicacion(4, 5);
        Assert.assertEquals(resultado, 20, "4 × 5 debería ser 20");
    }

    /**
     * Test 16: Multiplicar por cero
     * Escenario: 100 × 0
     * Resultado esperado: 0
     */
    @Test
    public void validarMultiplicarPorCero() {
        int resultado = Matematica.multiplicacion(100, 0);
        Assert.assertEquals(resultado, 0, "Cualquier número × 0 debería ser 0");
    }

    /**
     * Test 17: Multiplicar por uno (elemento neutro)
     * Escenario: 7 × 1
     * Resultado esperado: 7
     */
    @Test
    public void validarMultiplicarPorUno() {
        int resultado = Matematica.multiplicacion(7, 1);
        Assert.assertEquals(resultado, 7, "Multiplicar por 1 no debería cambiar el número");
    }

    /**
     * Test 18: Multiplicar negativo por negativo da positivo
     * Escenario: -3 × -4
     * Resultado esperado: 12
     */
    @Test
    public void validarMultiplicarNegativoPorNegativo() {
        int resultado = Matematica.multiplicacion(-3, -4);
        Assert.assertEquals(resultado, 12, "Negativo × Negativo debería dar Positivo");
    }

    /**
     * Test 19: Multiplicar positivo por negativo da negativo
     * Escenario: 5 × -3
     * Resultado esperado: -15
     */
    @Test
    public void validarMultiplicarPositivoPorNegativo() {
        int resultado = Matematica.multiplicacion(5, -3);
        Assert.assertEquals(resultado, -15, "Positivo × Negativo debería dar Negativo");
    }

    // =======================================
    // TESTS PARA DIVISIÓN (5 tests)
    // =======================================

    /**
     * Test 20: Dividir dos números con resultado entero
     * Escenario: 10 / 2
     * Resultado esperado: 5.0
 @Test
    public void ValidarSumarDosPositivos(){
        int resultado = Matematica.suma(5,3);
        Assert.assertEquals(resultado,8,"El resultado es correcto porque es ocho");

    }     */
    @Test
    public void validarDividirDosNumeros() {
        double resultado = Matematica.division(10, 2);
        Assert.assertEquals(resultado, 5.0, 0.001, "10 / 2 debería ser 5.0");
    }

    /**
     * Test 21: Dividir con resultado decimal
     * Escenario: 10 / 4
     * Resultado esperado: 2.5
     */
    @Test
    public void validarDividirConDecimales() {
        double resultado = Matematica.division(10, 4);
        Assert.assertEquals(resultado, 2.5, 0.001, "10 / 4 debería ser 2.5");
    }

    /**
     * Test 22: Dividir por cero lanza excepción
     * Escenario: 10 / 0
     * Resultado esperado: ArithmeticException
     */
    @Test(expectedExceptions = ArithmeticException.class)
    public void validarDividirPorCeroLanzaExcepcion() {
        Matematica.division(10, 0);
    }

    /**
     * Test 23: Dividir negativo entre positivo da negativo
     * Escenario: -10 / 2
     * Resultado esperado: -5.0
     */
    @Test
    public void validarDividirNegativoEntrePositivo() {
        double resultado = Matematica.division(-10, 2);
        Assert.assertEquals(resultado, -5.0, 0.001, "-10 / 2 debería ser -5.0");
    }

    /**
     * Test 24: Dividir negativo entre negativo da positivo
     * Escenario: -10 / -2
     * Resultado esperado: 5.0
     */
    @Test
    public void validarDividirNegativoEntreNegativo() {
        double resultado = Matematica.division(-10, -2);
        Assert.assertEquals(resultado, 5.0, 0.001, "-10 / -2 debería ser 5.0");
    }
}
