package apitesting.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static apitesting.utils.StepData.userEndpoint;

public class CreateUserStep {
    @Given("user set POST create user API endpoint")
    public void userSetPOSTCreateUserAPIEndpoint() {
        userEndpoint.setCreateUserEndpoint();
    }

    @When("user send POST create user HTTP request")
    public void whenUserSendPOSTCreateUserHTTPRequest() {
        userEndpoint.sendCreateUserRequest();
    }
}
