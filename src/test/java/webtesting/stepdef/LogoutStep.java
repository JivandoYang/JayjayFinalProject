package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import webtesting.pages.Home;
import webtesting.pages.Login;

public class LogoutStep {
    Login login = new Login();
    Home home = new Home();
    @Given("user has login")
    public void userHasLogin() {
        home.clickLoginMenu();
        login.inputUsername("Jivando");
        login.inputPassword("vando123");
        login.clickLoginButton();
        home.validateLogOutMenu();
    }

    @Then("user has logged out")
    public void userHasLoggedOut() {
        home.validateUserLoggedOut();
    }
}
