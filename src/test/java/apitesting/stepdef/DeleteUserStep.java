package apitesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static apitesting.utils.StepData.userEndpoint;

public class DeleteUserStep {
    @Given("user create new user")
    public void userCreateNewUser() {
        userEndpoint.createRandomUser();
    }

    @When("user send DELETE HTTP request")
    public void userSendDELETEHTTPRequest() {
        userEndpoint.sendDeleteUserRequest();
    }
}
