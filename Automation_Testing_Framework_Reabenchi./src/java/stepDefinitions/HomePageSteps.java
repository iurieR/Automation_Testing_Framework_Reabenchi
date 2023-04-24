public class HomePageSteps {


    private TestContext testContext;
    private HomePage homePage;

    public HomePageSteps(TestContext context){
        testContext = context;
        homePage = new HomePage(testContext.getWebDriverManager().getDriver());
    }
    @Given("^\"([^\"]*)\" is accessed$")
    public void isAccessed(String arg0) throws Throwable {
        testContext.getWebDriverManager().getDriver().get(link);
        testContext.getWebDriverManager().getDriver().getCurrentUrl().contains(link);
    }
}
