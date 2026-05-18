package apitesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static apitesting.utils.StepData.userEndpoint;

public class UpdateUserStep {
    @Given("user set PUT update user API endpoint with user id {string}")
    public void userSetPUTUpdateUserAPIEndpointWithUserId(String userId) {
        userEndpoint.setUserIdEndPoint(userId);
    }

    @When("user send PUT HTTP update request")
    public void userSendPUTHTTPUpdateRequest() {
        userEndpoint.sendUpdateUserRequest();
    }

    @And("user email should not be updated")
    public void userEmailShouldNotBeUpdated() {
        userEndpoint.validateEmailNotUpdated();
    }
}
