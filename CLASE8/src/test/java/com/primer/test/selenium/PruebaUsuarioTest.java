package com.primer.test.selenium;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PruebaUsuarioTest {
    private Usuario usuarioStandard;
    private Usuario usuarioInvalido;


    @BeforeMethod
    public void setUp(){
        usuarioStandard=new Usuario("standar_user", "secret_sauce");
        usuarioInvalido=new Usuario("","123");
    }


    // =========================================================
    //                    TESTS DE LOGIN
    // =========================================================

    /**
     * Test: Login exitoso con password correcto
     */
    @Test
    public void loginExitoso(){
        boolean resultado=usuarioStandard.login("secret_sauce");
        Assert.assertTrue(resultado,"El login deberia ser exitoso");
        Assert.assertTrue(usuarioStandard.estaLogueado(),"El usuario deberia estár logueado despues de un login exitoso");
    }

    /**
     * Test: Login fallido con password incorrecto
     */
    @Test
    public void loginFallido() {
        boolean resultado = usuarioStandard.login("password_incorrecto");

        Assert.assertFalse(resultado, "El login debería fallar");
        Assert.assertFalse(usuarioStandard.estaLogueado(),
                "El usuario NO debería estar logueado después de login fallido");
    }

    public void usuarioNoLogueadoInicialmente(){
        Assert.assertFalse(usuarioStandard.estaLogueado(),"Un usuario nuevo nunca deberia estár logueado");
    }


    // =========================================================
    //                     TESTS DE LOGOUT
    // =========================================================

    /**
     * Test: Logout después de login exitoso
     */
    @Test
    public void logoutDespuesDeLogin() {
        // Primero hacemos login
        usuarioStandard.login("secret_sauce");
        Assert.assertTrue(usuarioStandard.estaLogueado(), "Precondición: debe estar logueado");

        // Luego hacemos logout
        usuarioStandard.logout();
        Assert.assertFalse(usuarioStandard.estaLogueado(),
                "Después de logout, el usuario no debería estar logueado");
    }

    // =========================================================
    //                     TESTS DE VALIDACION
    // =========================================================

        /**
     * Test: Usuario con credenciales válidas
     */
    @Test
    public void usuarioConCredencialesValidas() {
        Assert.assertTrue(usuarioStandard.esValido(), 
            "Usuario con username y password >= 4 caracteres debería ser válido");
    }

    /**
     * Test: Usuario con username vacío no es válido
     */
    @Test
    public void usuarioConUsernameVacioNoEsValido() {
        Assert.assertFalse(usuarioInvalido.esValido(), 
            "Usuario con username vacío no debería ser válido");
    }

    /**
     * Test: Usuario con password corto no es válido
     */
    @Test
    public void usuarioConPasswordCortoNoEsValido() {
        Usuario usuarioPasswordCorto = new Usuario("usuario", "123");
        Assert.assertFalse(usuarioPasswordCorto.esValido(), 
            "Usuario con password < 4 caracteres no debería ser válido");
    }

    // =========================================================
    //                     TEST DE GETTER
    // =========================================================

    /**
     * Test: Verificar que getUsername funciona correctamente
     */
    @Test
    public void verificarGetUsername() {
        Assert.assertEquals(usuarioStandard.getUsername(), "standard_user",
            "getUsername debería retornar el username correcto");
    }

}
