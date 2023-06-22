package steps;

import base.Hooks;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashboardPage;
import pages.LoginPage;

public class UserLogin {
    SHAFT.GUI.WebDriver driver = Hooks.getDriver();
    LoginPage loginPageObject = new LoginPage(driver);
    DashboardPage dashboardPageObject = new DashboardPage(driver);

    //Login_Scenarios
    @Given("User is in login page")
    public void userIsInLoginPage() {
    }

    @And("User enter his account number")
    public void userEntersHisAccountNumber() {
        loginPageObject.setAccountNumber();
    }

    @And("User enter his email")
    public void userEntersHisEmail() {
        loginPageObject.setEmail();
    }

    @And("User enter his password")
    public void userEntersHisPassword() {
        loginPageObject.setPassword();
    }

    @And("User click on login button")
    public void userClicksOnLoginButton() {
        loginPageObject.clickLoginBtn();
    }

    @Then("User direct successfully to the dashboard")
    public void userDirectsSuccessfullyToTheDashboard() {
    }


}


