package org.ar.icaro.clase10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


/**
 * ============================================================
 * LOGIN PAGE - Page Object para la página de login
 * ============================================================
 *
 * URL: https://www.saucedemo.com
 *
 * Esta clase encapsula todos los elementos y acciones
 * de la página de login de SauceDemo.
 * ============================================================
 */
public class LoginPage {

    // ============================================================
    // ATRIBUTOS
    // ============================================================

    private WebDriver driver;
    private WebDriverWait wait;

    // ============================================================
    // LOCALIZADORES
    // Privados - Si cambia un ID, solo se modifica AQUÍ
    // ============================================================

    private By usernameField=By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-container");

    private static final String URL="https://www.saucedemo.com";


    // ============================================================
    // CONSTRUCTOR
    // ============================================================
    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    // ============================================================
    // MÉTODOS DE NAVEGACIÓN
    // ============================================================

    /**
     * Navega a la página de login.
     * @return this para method chaining
     */
    public LoginPage goTo(){
        driver.get(URL);
        return this;
    }

    // ============================================================
    // MÉTODOS DE INTERACCIÓN
    // ============================================================

    /**
     * Ingresa el nombre de usuario.
     * @return this para method chaining (Diapositiva 12)
     */
    public LoginPage enterUsername(String username){
        //EXPECTED CONDITIONS - DIAPOSITIVAS( 17-23)
        WebElement element=wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        );
        element.sendKeys((username));
        return this;
    }


    /**
     * Ingresa la contraseña.
     * @return this para method chaining (Diapositiva 12)
     */
    public LoginPage enterPassword(String password) {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordField)
        );
        element.sendKeys(password);
        return this;
    }


    /**
     * Hace click en el botón de login.
     * @return InventoryPage - la página siguiente (Diapositiva 11)
     */
    public InventoryPage clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new InventoryPage(driver);
    }


    // ============================================================
    // METODO DE ALTO NIVEL
    // ============================================================

    /**
     * Realiza el login completo en una sola llamada.
     * Combina enterUsername + enterPassword + clickLogin
     */
    public InventoryPage loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLogin();
    }

    /**
     * Intenta hacer login esperando un error.
     * Útil para tests de credenciales inválidas.
     */
    public LoginPage loginExpectingError(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return this;
    }


    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================

    public boolean isErrorDisplayed() {
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(errorMessage)
            ).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isUsernameFieldDisplayed() {
        try {
            return driver.findElement(usernameField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordFieldDisplayed() {
        try {
            return driver.findElement(passwordField).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginButtonDisplayed() {
        try {
            return driver.findElement(loginButton).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
