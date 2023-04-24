package stepDefinitions;

import contextManagers.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
    private TestContext testContext;
    private HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage = new HomePage(testContext.getWebDriverManager().getDriver());
    }

    @When("^my account botton is clicked$")
    public void myAccountBottonIsClicked() {
        homePage.clickOnMyAccountBtn();
    }

    @And("^register button is clicked$")
    public void registerButtonIsClicked() {
        homePage.clickOnRegisterBtn();
    }
}
