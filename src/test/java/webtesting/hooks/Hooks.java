package webtesting.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--guest");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-features=PasswordLeakDetection");
        driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
