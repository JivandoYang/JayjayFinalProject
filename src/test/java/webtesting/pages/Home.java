package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webtesting.hooks.Hooks;

public class Home extends BasePage {
    private By signUpMenu = By.id("signin2");
    private By loginMenu = By.id("login2");
    private By logoutMenu = By.id("logout2");
    private By contactMenu = By.cssSelector("a[data-target='#exampleModal']");
    private By cartMenu = By.id("cartur");

    public void clickSignUpMenu(){
        getDriver().findElement(signUpMenu).click();
    }
    public void clickLoginMenu(){
        getDriver().findElement(loginMenu).click();
    }
    public void clickContactMenu(){
        getDriver().findElement(contactMenu).click();
    }
    public void clickLogoutMenu(){
        getDriver().findElement(logoutMenu).click();
    }
    public void clickCartMenu(){
        getDriver().findElement(cartMenu).click();
    }
    public void validateLogOutMenu(){
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOfElementLocated(logoutMenu)).isDisplayed());
    }
    public void validateUserLoggedOut(){
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOfElementLocated(loginMenu)).isDisplayed());
    }
    public void clickProduct(String productName){
        By product = By.xpath("//a[text()='" + productName + "']");
        getDriver().findElement(product).click();
    }

    private By productName = By.cssSelector("h2.name");
    public void validateProductPage(String expectedProduct){
        String actualProduct = getDriver().findElement(productName).getText();
        Assert.assertEquals(expectedProduct, actualProduct);
    }
}
