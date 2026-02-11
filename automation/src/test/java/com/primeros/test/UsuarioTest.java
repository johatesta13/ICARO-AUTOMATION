package com.primeros.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class UsuarioTest {

    private Usuario usuarioStandard;
    private Usuario usuarioInvalido;

    @BeforeMethod
    public void setUp() {
        // Se ejecuta ANTES de cada @Test
        usuarioStandard = new Usuario("admin", "pass1234");
        usuarioInvalido = new Usuario("", "123");  // username vacío, password corto
    }

    @Test
    public void loginExitoso() {
        boolean resultado = usuarioStandard.login("pass1234");
        Assert.assertTrue(resultado, "Login con password correcta debería ser exitoso");
        Assert.assertTrue(usuarioStandard.estaLogueado(), "Usuario debería estar logueado");
    }

    @Test
    public void loginFallido() {
        boolean resultado = usuarioStandard.login("wrongpass");
        Assert.assertFalse(resultado, "Login con password incorrecta debería fallar");
        Assert.assertFalse(usuarioStandard.estaLogueado(), "Usuario NO debería estar logueado");
    }

    @Test
    public void usuarioNoLogueadoInicialmente() {
        Assert.assertFalse(usuarioStandard.estaLogueado(),
                "Un usuario nuevo no debería estar logueado");
    }

    @Test
    public void logoutDespuesDeLogin() {
        usuarioStandard.login("pass1234");
        boolean resultado = usuarioStandard.logout();

        Assert.assertTrue(resultado, "Logout debería retornar true");
        Assert.assertFalse(usuarioStandard.estaLogueado(),
                "Usuario debería estar deslogueado después de logout");
    }

    @Test
    public void usuarioConCredencialesInvalidas() {
        Assert.assertFalse(usuarioInvalido.esValido(),
                "Usuario con credenciales inválidas no debería ser válido");
    }

    @Test
    public void usuarioConUsernameVacioNoEsValido() {
        Usuario usuario = new Usuario("", "pass1234");
        Assert.assertFalse(usuario.esValido(),
                "Usuario con username vacío no debería ser válido");
    }

    @Test
    public void usuarioConPasswordCortoNoEsValido() {
        Usuario usuario = new Usuario("admin", "123");
        Assert.assertFalse(usuario.esValido(),
                "Usuario con password menor a 4 caracteres no debería ser válido");
    }

    @Test
    public void verificarGetUsername() {
        Assert.assertEquals(usuarioStandard.getUsername(), "admin",
                "El username debería ser 'admin'");
    }
}