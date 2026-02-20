package org.ar.icaro.clase11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InventoryPage extends BasePage {
    // Título de la página (muestra "Products")
    private By pageTitle = By.className("title");

    // Icono del carrito en la esquina superior derecha
    private By cartIcon = By.className("shopping_cart_link");

    // Badge que muestra la cantidad de items en el carrito
    // Solo aparece si hay items en el carrito
    private By cartBadge = By.className("shopping_cart_badge");

    // Botones para agregar productos al carrito
    // Cada producto tiene su propio botón con ID único
    private By addBackpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By addBikeLightBtn = By.id("add-to-cart-sauce-labs-bike-light");
    private By addBoltTshirtBtn = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addFleeceJacketBtn = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By addOnesieBtn = By.id("add-to-cart-sauce-labs-onesie");

    // Menú hamburguesa (tres líneas horizontales)
    private By menuButton = By.id("react-burger-menu-btn");

    // Link de logout dentro del menú lateral
    private By logoutLink = By.id("logout_sidebar_link");

    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public InventoryPage(WebDriver driver) {
        // Llamamos al constructor de BasePage
        // Esto inicializa driver y wait
        super(driver);
    }


    // ============================================================
    // MÉTODOS DE VERIFICACIÓN
    // ============================================================


    public boolean isOnInventoryPage(){
        return waitForUrlContains("inventory");
    }



    public String getTitle(){
        return getText(pageTitle);
    }

    // ============================================================
    // MÉTODOS PARA AGREGAR PRODUCTOS AL CARRITO
    // Cada metodo agrega un producto específico
    // ============================================================

    public InventoryPage addBackpackToCart() {
        // click() espera que el botón sea clickeable y hace click
        click(addBackpackBtn);
        return this;
    }


    public InventoryPage addBikeLightToCart() {
        click(addBikeLightBtn);
        return this;
    }

    public InventoryPage addBoltTshirtToCart() {
        click(addBoltTshirtBtn);
        return this;
    }

    public InventoryPage addFleeceJacketToCart() {
        click(addFleeceJacketBtn);
        return this;
    }

    public InventoryPage addOnesieToCart() {
        click(addOnesieBtn);
        return this;
    }

    // ============================================================
    // NAVEGACIÓN A OTRAS PÁGINAS
    // Estos métodos retornan otros Page Objects
    // ============================================================


    public CartPage goToCart(){
        click(cartIcon);

        return new CartPage(driver);
    }

    public LoginPage logout(){
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));

        click(menuButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));
        click(logoutLink);

        wait.until(ExpectedConditions.not(ExpectedConditions.urlContains("inventory")));

        return new LoginPage(driver);

    }

    public int getCartItemCount(){

        try {
            String badgeText = getText(cartBadge);//"3"

            return Integer.parseInt(badgeText);//3
        }catch(Exception e){
            return 0;
        }
    }

}
