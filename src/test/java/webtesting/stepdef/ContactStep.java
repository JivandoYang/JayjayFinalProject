package webtesting.stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import webtesting.pages.Contact;

public class ContactStep {
    Contact contact = new Contact();
    @And("user input contact email {string}")
    public void userInputContactEmail(String email) {
        contact.inputEmail(email);
    }

    @And("user input contact name {string}")
    public void userInputContactName(String name) {
        contact.inputName(name);
    }

    @And("user input message {string}")
    public void userInputMessage(String message) {
        contact.inputMessage(message);
    }

    @And("user click the send message button")
    public void userClickTheSendMessageButton() {
        contact.clickSendButton();
    }

    @Then("user should see contact alert with {string}")
    public void userShouldSeeAlertWith(String expectedMessage) {
        contact.validateAlert(expectedMessage);
    }

    @And("user click cancel contact button")
    public void userClickCancelContactButton() {
        contact.closeButton();
    }

    @Then("contact modal should be closed")
    public void contactModalShouldBeClosed() {
        contact.validateModalClosed();
    }
}
