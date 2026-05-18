package apitesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetUserByIdStepdefs {
    @Given("user set GET user API endpoint")
    public void userSetGETUserAPIEndpoint() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("user send GET HTTP request")
    public void userSendGETHTTPRequest() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("user receive valid status code {int}")
    public void userReceiveValidStatusCode(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("user does not set app-id header")
    public void userDoesNotSetAppIdHeader() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("user send GET HTTP request without app-id")
    public void userSendGETHTTPRequestWithoutAppId() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
