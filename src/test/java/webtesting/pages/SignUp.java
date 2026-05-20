package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webtesting.hooks.Hooks;

public class SignUp {
    WebDriver driver;

    public SignUp(){
        this.driver = Hooks.getDriver();
    }

    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signButton = By.xpath("//button[@onclick='register()']");
    private By closeButton = By.xpath("//button[text()='Close']");

    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignButton(){
        driver.findElement(signButton).click();
    }

    public void closeButton(){
        driver.findElement(closeButton).click();
    }

    public void validateAlert(){
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        Assert.assertEquals("Sign up successful.",message);
        alert.accept();
    }
}
