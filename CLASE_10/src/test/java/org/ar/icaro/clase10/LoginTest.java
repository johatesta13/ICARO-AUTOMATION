package org.ar.icaro.clase10;

import org.ar.icaro.clase10.pages.LoginPage;
import org.ar.icaro.clase10.pages.InventoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        // Creamos LoginPage y navegamos

        loginPage=new LoginPage(driver);
        loginPage.goTo();
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginExitosoConPOM() {
        InventoryPage inventoryPage = loginPage.loginAs("standard_user", "secret_sauce");

        Assert.assertTrue(inventoryPage.isOnInventoryPage(),
                "Debería estar en la página de inventario");
        Assert.assertEquals(inventoryPage.getInventoryTitle(), "Products",
                "El título debería ser Products");
    }

    @Test
    public void loginCredencialesInvalidasConPOM() {
        loginPage.loginExpectingError("usuario_falso", "password_malo");

        Assert.assertTrue(loginPage.isErrorDisplayed(),
                "Debería mostrarse un mensaje de error");
    }

    @Test
    public void verificarElementosLoginConPOM() {
        Assert.assertTrue(loginPage.isUsernameFieldDisplayed(),
                "Campo de usuario debería ser visible");
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed(),
                "Campo de password debería ser visible");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(),
                "Botón de login debería ser visible");
    }


    @Test
    public void loginConMethodChaining(){
        InventoryPage inventoryPage=loginPage
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();

        Assert.assertTrue(inventoryPage.isOnInventoryPage(),
                "Deberia estar en la página de inventario");
    }
}
