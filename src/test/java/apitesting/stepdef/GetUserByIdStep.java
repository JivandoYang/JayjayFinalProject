package apitesting.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static apitesting.utils.StepData.userEndpoint;

public class GetUserByIdStep {

    @Given("user set GET user API endpoint with user id {string}")
    public void userSetGETUserAPIEndpointWithUserId(String userId) {
        userEndpoint.setUserIdEndPoint(userId);
    }

    @When("user send GET HTTP request")
    public void userSendGETHTTPRequest() {
        userEndpoint.sendGetUserByIdRequest();
    }

    @When("user send GET HTTP request without app-id")
    public void userSendGETHTTPRequestWithoutAppId() {
        userEndpoint.sendGetUserByIdRequestWihoutAppId();
    }
}
