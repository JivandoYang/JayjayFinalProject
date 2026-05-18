package apitesting.stepdef;

import apitesting.endpoints.ListTagEndpoint;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetListStep {
    ListTagEndpoint listTagEndpoint = new ListTagEndpoint();

    @Given("user set GET list API endpoint")
    public void userSetGETListAPIEndpoint() {
        listTagEndpoint.setGetEndpoint();
    }

    @When("user send GET LIST HTTP request")
    public void userSendGETLISTHTTPRequest() {
        listTagEndpoint.sendGetTagRequest();
    }

    @When("user send GET LIST HTTP request without app-id")
    public void userSendGETLISTHTTPRequestWithoutAppId() {
        listTagEndpoint.sendGetTagRequestWithoutAppId();
    }

    @Then("user receive valid list status code {int}")
    public void userReceiveValidListStatusCode(int status) {
        listTagEndpoint.validateStatusCode(status);
    }
}
