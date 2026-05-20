package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webtesting.hooks.Hooks;

public class Login {
    WebDriver driver;

    public Login(){
        this.driver = Hooks.getDriver();
    }

    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginButton = By.xpath("//button[@onclick='logIn()']");
    private By closeButton = By.xpath("//button[text()='Close']");

    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void closeButton(){
        driver.findElement(closeButton).click();
    }
}
