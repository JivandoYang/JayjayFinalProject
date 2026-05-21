package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webtesting.pages.Home;
import webtesting.pages.Product;

public class ProductStep {

    Home home = new Home();
    Product product = new Product();

    @Given("user is on product page")
    public void userIsOnProductPage() {
        home.clickProduct("Samsung galaxy s6");
    }

    @When("user add to cart button")
    public void userAddToCartButton() {
        product.clickAddToCartButton();
    }

    @Then("product is added to cart")
    public void productIsAddedToCart() {
        product.validateAddProductAlert("Product added");
    }

    @Given("a product is added to cart")
    public void aProductIsAddedToCart() {
        home.clickProduct("Samsung galaxy s6");
        product.clickAddToCartButton();
        product.validateAddProductAlert("Product added");
    }
}
