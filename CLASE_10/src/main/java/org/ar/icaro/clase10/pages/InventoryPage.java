package org.ar.icaro.clase10.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


/**
 * ============================================================
 * INVENTORY PAGE - Page Object para la página de productos
 * ============================================================
 *
 * URL: https://www.saucedemo.com/inventory.html
 *
 * Esta página aparece después de un login exitoso.
 * ============================================================
 */
public class InventoryPage {

    // ============================================================
    // ATRIBUTOS
    // ============================================================

    @SuppressWarnings("unused")
    private WebDriver driver;
    private WebDriverWait wait;

    // ============================================================
    // LOCALIZADORES
    // ============================================================

    private By pageTitle= By.className("title");

    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public InventoryPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ============================================================
    // METODO DE VERIFICACION
    // ============================================================

    /**
     * Verifica si estamos en la página de inventario.
     * @return true si la URL contiene "inventory"
     */
    public boolean isOnInventoryPage(){
        try{
            wait.until(ExpectedConditions.urlContains("inventory"));
            return true;
        }catch(Exception e){
            return false;
        }
    }


    /**
     * Obtiene el título de la página (normalmente "Products").
     * @return Texto del título
     */
    public String getInventoryTitle(){
        WebElement title=wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
        return title.getText();
    }

}
