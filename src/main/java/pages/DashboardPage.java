package pages;

import com.shaft.driver.SHAFT;
import common.PageBase;
import org.openqa.selenium.By;

public class DashboardPage extends PageBase {
    By dashboardPageTitle = By.cssSelector("h1.text-xl");
    public DashboardPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public void assertThatDashboardPageTitleAppeares (){
        driver.assertThat().element(dashboardPageTitle).text().contains("End").perform();
    }
}
