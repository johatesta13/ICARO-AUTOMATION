package org.ar.icaro.clase11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    //Titulo de la pagina (muestra "Your Cart")

    private By pagetitle = By.className("title");

    //Boton checkout

    private By checkoutbtn = By.id("checkout");

    // Botón para volver a seguir comprando
    private By continueShoppingBtn = By.id("continue-shopping");

    // Cada item en el carrito tiene esta clase
    // Usamos findElements (plural) para obtener todos
    private By cartItems = By.className("cart_item");

    // Botones de "Remove" para eliminar items
    // El selector busca botones cuyo ID empieza con "remove"
    private By removeButtons = By.cssSelector("button[id^='remove']");

    // Nombres de los productos en el carrito
    private By itemNames = By.className("inventory_item_name");

    // Precios de los productos
    private By itemPrices = By.className("inventory_item_price");

    public CartPage(WebDriver driver) {
        // Llamamos al constructor de BasePage
        super(driver);
    }


    public boolean isOnCartPage(){
        return waitForUrlContains("cart");
    }

    public String getTitle(){
        return getText(pagetitle);
    }

    public int getCartItemCound(){
        List<WebElement> items = driver.findElements(cartItems);

        return items.size();
    }

    public boolean isCartEmpty (){
        return getCartItemCound() == 0;
    }

    // ============================================================
    // NAVEGACIÓN A OTRAS PÁGINAS
    // ============================================================

    public CheckoutPage proceedToCheckout (){
        click(checkoutbtn);
        return new CheckoutPage(driver);
    }

    public InventoryPage countinueShopping(){
        click(continueShoppingBtn);
        return new InventoryPage(driver);
    }

    // ============================================================
    // MÉTODOS PARA GESTIONAR ITEMS
    // ============================================================


    public CartPage removeFirstItem(){

        List<WebElement> buttons = driver.findElements(removeButtons);
        for (WebElement button:buttons){
            button.click();
        }

        return this;

    }

    public String getFirstItemName(){
        List<WebElement> names = driver.findElements(itemNames);

        // Si hay al menos uno, retornamos su texto
        if (!names.isEmpty()) {
            return names.get(0).getText();
        }

        return null;
    }



}
