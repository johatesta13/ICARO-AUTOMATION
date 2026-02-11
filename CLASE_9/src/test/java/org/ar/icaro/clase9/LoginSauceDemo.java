package org.ar.icaro.clase9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSauceDemo {


    private WebDriver driver;

    private static final String BASE_URL = "https://www.saucedemo.com/";

    private static final String USUARIO_STANDARD = "standard_user";
    private static final String USUARIO_BLOQUEADO = "locked_out_user";
    private static final String PASSWORD_CORRECTO = "secret_sauce";
    private static final String PASSWORD_INCORRECTO = "password_malo";


    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @BeforeMethod
    public void irALogin() {
        driver.get(BASE_URL);
    }

    @Test
    public void LoginExitoso() {
        WebElement campousuario = driver.findElement(By.id("user-name"));
        campousuario.sendKeys(USUARIO_STANDARD);


        WebElement campoPassword = driver.findElement(By.id("password"));
        campoPassword.sendKeys(PASSWORD_CORRECTO);


        WebElement botonlogin = driver.findElement(By.id("login-button"));
        botonlogin.click();

        String urlActual = driver.getCurrentUrl();

        Assert.assertNotNull(urlActual);
        Assert.assertTrue(urlActual.contains("inventory.html"), "Después del login deberia estár en inventory.html");

        System.out.println("Login exitoso - URL actual: " + urlActual);


    }

    /**
     * TEST 2: Login con Usuario Bloqueado
     * Usuario: locked_out_user
     * Password: secret_sauce
     * Verificar: Aparece mensaje de error con "locked out"
     */
    @Test
    public void loginUsuarioBloqueado() {
        // 1. Escribir usuario bloqueado
        driver.findElement(By.id("user-name")).sendKeys(USUARIO_BLOQUEADO);

        // 2. Escribir password correcto
        driver.findElement(By.id("password")).sendKeys(PASSWORD_CORRECTO);

        // 3. Click en Login
        driver.findElement(By.id("login-button")).click();

        // 4. Verificar que aparece el mensaje de error
        WebElement mensajeError = driver.findElement(By.cssSelector("[data-test='error']"));
        String textoError = mensajeError.getText();

        Assert.assertTrue(textoError.contains("locked out"),
                "Debería aparecer un mensaje indicando que el usuario está bloqueado");

        // 5. Verificar que NO navegó a inventory
        String urlActual = driver.getCurrentUrl();
        Assert.assertFalse(urlActual.contains("inventory"),
                "No debería haber navegado a inventory");
    }

    /**
     * TEST 3: Login con Credenciales Inválidas
     * Usuario: usuario_falso
     * Password: password_malo
     * Verificar: Aparece error, NO navega a inventory
     */
    @Test
    public void loginCredencialesInvalidas() {
        // 1. Escribir usuario inválido
        WebElement campousuario = driver.findElement(By.id("user-name"));
        campousuario.sendKeys(USUARIO_STANDARD);

        // 2. Escribir password inválido
        WebElement campoPassword = driver.findElement(By.id("password"));
        campoPassword.sendKeys(PASSWORD_INCORRECTO);
        // 3. Click en Login
        WebElement botonlogin = driver.findElement(By.id("login-button"));
        botonlogin.click();


        // 4. Verificar que aparece mensaje de error
        WebElement mensajeError = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(mensajeError.isDisplayed(),
                "Debería aparecer un mensaje de error");

        String textoError = mensajeError.getText();
        Assert.assertTrue(textoError.contains("Username and password dont match"),
                "El mensaje debería indicar que las credenciales no coinciden");

        // 5. Verificar que NO navegó a inventory
        String urlActual = driver.getCurrentUrl();
        Assert.assertFalse(urlActual.contains("inventory"),
                "No debería haber navegado a inventory con credenciales inválidas");
    }



    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
            System.out.println("Navegador cerrado correctamente");
        }
    }
}
