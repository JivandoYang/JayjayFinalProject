package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep {
    @Given("user is in home page")
    public void userIsInHomePage() {
    }

    @When("user click sign up menu")
    public void userClickSignUpMenu() {
    }

    @And("user input signup username {string}")
    public void userInputSignupUsername(String username) {
    }

    @And("user input signup password {string}")
    public void userInputSignupPassword(String password) {
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
    }

    @Given("user is on home page")
    public void userIsOnHomePage() {
    }

    @Then("user should see successfully sign up alert")
    public void userShouldSeeSuccessfullySignUpAlert() {
    }

    @Then("user should see username already exists alert")
    public void userShouldSeeUsernameAlreadyExistsAlert() {
    }

    @And("user click cancel signup button")
    public void userClickCancelButton() {
    }

    @Then("sign up modal should be closed")
    public void signUpModalShouldBeClosed() {
    }
}
