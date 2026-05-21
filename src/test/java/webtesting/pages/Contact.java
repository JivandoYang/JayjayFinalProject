package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Contact extends BasePage {
    private By emailField = By.id("recipient-email");
    private By nameField = By.id("recipient-name");
    private By messageField = By.id("message-text");
    private By sendButton = By.xpath("//button[@onclick='send()']");
    private By closeButton = By.xpath("//div[@id='exampleModal']//button[text()='Close']");
    private By contactModal = By.id("exampleModal");

    public void inputEmail(String email){
        getDriver().findElement(emailField).sendKeys(email);
    }
    public void inputName(String name){
        getDriver().findElement(nameField).sendKeys(name);
    }
    public void inputMessage(String message){
        getDriver().findElement(messageField).sendKeys(message);
    }
    public void clickSendButton(){
        getDriver().findElement(sendButton).click();
    }
    public void closeButton(){
        WebElement element = getWait().until(
                ExpectedConditions.elementToBeClickable(closeButton)
        );
        element.click();
    }

    public void validateAlert(String expectedMessage){
        Alert alert = getWait().until(ExpectedConditions.alertIsPresent());
        String message = alert.getText();
        Assert.assertEquals(expectedMessage, message);
        alert.accept();
    }

    public void validateModalClosed(){
        String modalClass = getDriver().findElement(contactModal).getAttribute("class");
        Assert.assertFalse(modalClass.contains("show"));
    }
}
