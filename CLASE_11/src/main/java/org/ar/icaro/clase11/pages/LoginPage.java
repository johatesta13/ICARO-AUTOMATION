package org.ar.icaro.clase11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-container");

    // URL de la página de login (constante)
    private static final String URL = "https://www.saucedemo.com";

    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public LoginPage(WebDriver driver){
        super(driver);
    }

    // ============================================================
    // MÉTODOS DE NAVEGACIÓN
    // ============================================================

    public LoginPage goTo() {
        // driver.get() abre la URL en el navegador
        driver.get(URL);

        // Retornamos this para poder encadenar métodos
        return this;
    }

    // ============================================================
    // MÉTODOS DE INTERACCIÓN
    // Usan los métodos heredados de BasePage
    // ============================================================

    public LoginPage enterUsername(String username){
        type(usernameField,username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(passwordField,password);
        return this;
    }

    public InventoryPage clickLogin(){
        click(loginButton);
        return new InventoryPage(driver);

    }

    public InventoryPage loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLogin();
    }

    public LoginPage loginExpectingError(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        click(loginButton);
        return this;
    }
    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================

    public boolean isErrorDisplayed() {
        return isElementVisible(errorMessage);
    }

    public boolean isUsernameFieldDisplayed() {
        return isElementVisible(usernameField);
    }

    public boolean isPasswordFieldDisplayed() {
        return isElementVisible(passwordField);
    }

    public boolean isLoginButtonDisplayed() {
        return isElementVisible(loginButton);
    }
}




