package webtesting.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Product extends BasePage {
    private By addToCartButton = By.xpath("//a[text()='Add to cart']");

    public void clickAddToCartButton(){
        getDriver().findElement(addToCartButton).click();
    }
    public void validateAddProductAlert(String expectedMessage){
        Alert alert = getWait().until(ExpectedConditions.alertIsPresent());
        String message = alert.getText();
        Assert.assertEquals(expectedMessage, message);
        alert.accept();
    }
}
