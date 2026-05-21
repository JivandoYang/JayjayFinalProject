package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webtesting.pages.Cart;
import webtesting.pages.Home;
import webtesting.pages.Product;

public class CartStep {

    Home home = new Home();
    Product product = new Product();
    Cart cart = new Cart();

    @And("user is on cart page")
    public void userIsOnCartPage() {
        home.clickCartMenu();
    }

    @When("user clicks place order button")
    public void userClicksPlaceOrderButton() {
        cart.clickPlaceOrderButton();
    }

    @Then("user should see purchase alert with {string}")
    public void userShouldSeePurchaseAlertWith(String expectedMessage) {
        cart.validatePurchaseAlert(expectedMessage);
    }

    @And("user inputs name {string}")
    public void userInputsName(String name) {
        cart.inputName(name);
    }

    @And("user inputs country {string}")
    public void userInputsCountry(String country) {
        cart.inputCountry(country);
    }

    @And("user inputs city {string}")
    public void userInputsCity(String city) {
        cart.inputCity(city);
    }

    @And("user inputs credit card {string}")
    public void userInputsCreditCard(String creditCard) {
        cart.inputCreditCard(creditCard);
    }

    @And("user inputs month {string}")
    public void userInputsMonth(String month) {
        cart.inputMonth(month);
    }

    @And("user inputs year {string}")
    public void userInputsYear(String year) {
        cart.inputYear(year);
    }
    @And("user clicks purchase button")
    public void userClicksPurchaseButton() {
        cart.clickPurchaseButton();
    }
    @Then("user should see successful purchase popup")
    public void userShouldSeeSuccessfulPurchasePopup() {
        cart.validateSuccessfulPurchasePopup();
    }
}