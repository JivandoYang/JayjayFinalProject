package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webtesting.pages.Home;
import webtesting.pages.Login;

public class HomeStep {
    Home home = new Home();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        // Home page itu halaman index.html website demoblaze jadi pas masuk website udh di homepage
    }

    @When("user click sign up menu")
    public void userClickSignUpMenu() {
        home.clickSignUpMenu();
    }

    @When("user click login menu")
    public void userClickLoginMenu() {
        home.clickLoginMenu();
    }

    @When("user click contact menu")
    public void userClickContactMenu() {
        home.clickContactMenu();
    }

    @Then("user should see logout menu")
    public void userShouldSeeLogoutMenu() {
        home.validateLogOutMenu();
    }

    @And("user click logout")
    public void userClickLogout() {
        home.clickLogoutMenu();
        home.validateUserLoggedOut();
    }

    @When("user clicks product {string}")
    public void userClicksProduct(String productName) {
        home.clickProduct(productName);
    }

    @Then("user is redirected to product {string} page")
    public void userIsRedirectedToProductPage(String productName) {
        home.validateProductPage(productName);
    }
}
