package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;
import page.ProductPage;

public class CartSteps {
    private ProductPage productPage = new ProductPage(DriverFactory.getDriver("chrome"));
    private CartPage cartPage = new CartPage(DriverFactory.getDriver("chrome"));

    @Given("I am on a product details page for {string}")
    public void i_am_on_a_product_details_page_for(String product) {
        productPage.navigateToProductDetails(product);
    }

    @When("I click the {string} button")
    public void i_click_the_button(String button) {
        if (button.equals("Add to Cart")) {
            productPage.clickAddToCart();
        }
    }

    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        assertTrue(cartPage.isProductInCart("Laptop"));
    }

    @Given("I have the following products in my cart")
    public void i_have_the_following_products_in_my_cart(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> products = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> product : products) {
            cartPage.addProductToCart(product.get("Product"), Integer.parseInt(product.get("Quantity")));
        }
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        cartPage.checkout();
    }

    @And("I confirm the purchase")
    public void i_confirm_the_purchase() {
        cartPage.confirmPurchase();
    }

    @Then("I should see a confirmation message {string}")
    public void i_should_see_a_confirmation_message(String message) {
        assertEquals(message, cartPage.getConfirmationMessage());
    }
}