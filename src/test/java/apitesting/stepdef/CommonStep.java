package apitesting.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static apitesting.utils.StepData.userEndpoint;

public class CommonStep {
    @Then("user receive valid status code {int}")
    public void userReceiveValidStatusCode(int status) {
        userEndpoint.validateStatusCode(status);
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstName) {
        userEndpoint.setFirstName(firstName);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
        userEndpoint.setLastName(lastName);
    }

    @And("user input email {string}")
    public void userInputEmail(String email) {
        String random = java.util.UUID.randomUUID()
                .toString()
                .substring(0, 4);

        userEndpoint.setEmail(random + email);
    }
}
