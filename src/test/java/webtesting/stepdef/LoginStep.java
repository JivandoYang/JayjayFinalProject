package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webtesting.pages.Login;

public class LoginStep {

    Login login = new Login();

    @And("user input login username {string}")
    public void userInputLoginUsername(String username) {
        login.inputUsername(username);
    }

    @And("user input login password {string}")
    public void userInputLoginPassword(String password) {
        login.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("user should see login alert with {string}")
    public void userShouldSeeLoginAlertWith(String expectedMessage) {
        login.validateAlert(expectedMessage);
    }

    @And("user click cancel login button")
    public void userClickCancelLoginButton() {
        login.closeButton();
    }

    @Then("login modal should be closed")
    public void loginModalShouldBeClosed() {
        login.validateModalClosed();
    }

}
