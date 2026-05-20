package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @When("user click login menu")
    public void userClickLoginMenu() {
    }

    @And("user input login username {string}")
    public void userInputLoginUsername(String username) {
    }

    @And("user input login password {string}")
    public void userInputLoginPassword(String password) {
    }

    @And("user click login button")
    public void userClickLoginButton() {
    }

    @Then("user should see successfully login alert")
    public void userShouldSeeSuccessfullyLoginAlert() {
    }

    @Then("user should see wrong password alert")
    public void userShouldSeeWrongPasswordAlert() {
    }

    @Then("user should see user does not exist alert")
    public void userShouldSeeUserDoesNotExistAlert() {
    }

    @Then("user should see empty username or password alert")
    public void userShouldSeeEmptyUsernameOrPasswordAlert() {
    }

    @And("user click cancel login button")
    public void userClickCancelLoginButton() {
    }

    @Then("login modal should be closed")
    public void loginModalShouldBeClosed() {
    }
}
