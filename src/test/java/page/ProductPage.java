package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By addToCartButton = By.id("add-to-cart-button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProductDetails(String product) {
        driver.get("http://example.com/product/" + product);
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
}