package org.ar.icaro.clase9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class primertestselenium {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        //descargamos automaticamente el driver del navegador
        WebDriverManager.chromedriver().setup();


        //Creamos una instancia de chrome driver
        //va a abrir una ventana de chrome
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @Test
    public void navegarASauceDemo() {
        driver.get("https://www.saucedemo.com");
        // obtener el titulo de la pagina

        String titulo = driver.getTitle();


        //assert para validar el titulo de la pagina

        Assert.assertEquals(titulo, "Swag Labs", "El titulo no es el esperado");

        System.out.println("Navegamos exitosamente a SauceDemo");
        System.out.println("Titulo de la pagina: " + titulo);

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


