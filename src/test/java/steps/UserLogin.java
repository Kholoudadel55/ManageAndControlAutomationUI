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

    //Scenario1
    @Given("User is in login page")
    public void userIsInLoginPage() {
        loginPageObject.assertThatLoginPageAppears();
    }

    @And("User enters his account number")
    public void userEntersHisAccountNumber() {
        loginPageObject.setAccountNumber();
    }

    @And("User enters his email")
    public void userEntersHisEmail() {
        loginPageObject.setEmail();
    }

    @And("User enters his password")
    public void userEntersHisPassword() {
        loginPageObject.setPassword();
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPageObject.clickLoginBtn();
    }

    @Then("User directs successfully to the dashboard")
    public void userDirectsSuccessfullyToTheDashboard() {
        dashboardPageObject.assertThatDashboardPageTitleAppeares();
    }

    //Scenario2
    @And("User enters his invalid account number")
    public void userEntersHisInvalidAccountNumber() {
        loginPageObject.setInvalidAccountNumber();

    }

    @Then("User can not access to the dashboard")
    public void userCanNotAccessToTheDashboard() {
        loginPageObject.assertAnErrorMsgAppeares();
    }

    @And("User enters his invalid email")
    public void userEntersHisInvalidEmail() {
        loginPageObject.setInvalidEmail();
    }
}


