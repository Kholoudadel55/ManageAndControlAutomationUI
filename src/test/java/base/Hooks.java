package base;

import com.shaft.driver.SHAFT;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Hooks extends AbstractTestNGCucumberTests {
    private static SHAFT.GUI.WebDriver driver;

    public static SHAFT.GUI.WebDriver getDriver() {
        return driver;
    }

    @Before
    public void startBrowser() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://console.foodics.dev/");
    }

    @After
    public void closeBrowser() {
//        driver.quit();
    }

}
