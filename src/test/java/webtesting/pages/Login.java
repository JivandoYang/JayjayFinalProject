package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends BasePage {
    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginButton = By.xpath("//button[@onclick='logIn()']");
    private By closeButton = By.xpath("//div[@id='logInModal']//button[text()='Close']");
    private By loginModal = By.id("logInModal");

    public void inputUsername(String username){
        getDriver().findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        getDriver().findElement(loginButton).click();
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
        String modalClass = getDriver().findElement(loginModal).getAttribute("class");
        Assert.assertFalse(modalClass.contains("show"));
    }


}
