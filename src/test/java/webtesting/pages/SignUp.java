package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUp extends BasePage {
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signButton = By.xpath("//button[@onclick='register()']");
    private By closeButton = By.xpath("//div[@id='signInModal']//button[text()='Close']");
    private By signUpModal = By.id("signInModal");

    public void inputUsername(String username){
        getDriver().findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public void clickSignButton(){
        getDriver().findElement(signButton).click();
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
        String modalClass = getDriver().findElement(signUpModal).getAttribute("class");
        Assert.assertFalse(modalClass.contains("show"));
    }
}
