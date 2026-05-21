package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cart extends BasePage {
    private By placeOrderButton = By.xpath("//button[text()='Place Order']");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By creditCardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By successfulPurchasePopup = By.className("sweet-alert");

    public void clickPlaceOrderButton(){
        getDriver().findElement(placeOrderButton).click();
    }

    public void inputName(String name){

        getDriver().findElement(nameField).sendKeys(name);
    }
    public void inputCountry(String country){

        getDriver().findElement(countryField).sendKeys(country);
    }
    public void inputCity(String city){

        getDriver().findElement(cityField).sendKeys(city);
    }
    public void inputCreditCard(String creditCard){

        getDriver().findElement(creditCardField).sendKeys(creditCard);
    }
    public void inputMonth(String month){
        getDriver().findElement(monthField).sendKeys(month);
    }
    public void inputYear(String year){

        getDriver().findElement(yearField).sendKeys(year);
    }
    public void clickPurchaseButton(){
        getDriver().findElement(purchaseButton).click();
    }

    public void validatePurchaseAlert(String expectedMessage){
        Alert alert = getWait().until(ExpectedConditions.alertIsPresent());
        String message = alert.getText();
        Assert.assertEquals(expectedMessage, message);
        alert.accept();
    }

    public void validateSuccessfulPurchasePopup(){
        WebElement element = getWait().until(ExpectedConditions.visibilityOfElementLocated(successfulPurchasePopup));
        Assert.assertTrue(element.isDisplayed());
    }
}
