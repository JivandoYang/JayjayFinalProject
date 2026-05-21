package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webtesting.pages.SignUp;

public class SignUpStep {

    SignUp signUp = new SignUp();

    @And("user input signup username {string}")
    public void userInputSignupUsername(String username) {
        signUp.inputUsername(username);
    }

    @And("user input signup password {string}")
    public void userInputSignupPassword(String password) {
        signUp.inputPassword(password);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        signUp.clickSignButton();
    }

    @Then("user should see sign up alert with {string}")
    public void userShouldSeeSignUpAlertWith(String expectedMessage) {
        signUp.validateAlert(expectedMessage);
    }

    @And("user click cancel signup button")
    public void userClickCancelButton() {
        signUp.closeButton();
    }

    @Then("sign up modal should be closed")
    public void signUpModalShouldBeClosed() {
        signUp.validateModalClosed();
    }

    @And("user input signup random username")
    public void userInputSignupRandomUsername() {
        String random = java.util.UUID.randomUUID()
                .toString()
                .substring(0, 4);

        signUp.inputUsername(random);
    }
}
