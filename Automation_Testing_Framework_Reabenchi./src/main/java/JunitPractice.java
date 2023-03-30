import Managers.WebDriverManager;
import org.junit.jupiter.api.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class JunitPractice {
    WebDriverManager chromeDriverManager = new WebDriverManager("CHROME");

    @BeforeEach
    public void beforeTestProcedure() {
        chromeDriverManager.getDriver().get("https://demo.opencart.com/");

    }

    @AfterEach
    public void afterTestInstruction() {
        chromeDriverManager.getDriver().close();

    }

    @Test
    @DisplayName("Adresa url a paginei register este disponibila din pagina home")
    public void verifyTheRigisterPageIsAccesible() {
        HomePage homePage = new HomePage(chromeDriverManager.getDriver());
        homePage.navigateToRegisterPage();
        boolean urlIsValid = chromeDriverManager.getDriver().getCurrentUrl().contains("register");
        Assertions.assertTrue(urlIsValid, "adresa url nu este valida");

    }

    @Test
    @DisplayName("register page elements are displayd")
    public void registerPageElementsAreDisplayd() {
        chromeDriverManager.getDriver().get("https://demo.opencart.com/");
        HomePage homePage = new HomePage(chromeDriverManager.getDriver());
        homePage.navigateToRegisterPage();
        RegisterPage registerPage = new RegisterPage(chromeDriverManager.getDriver());
        Assertions.assertTrue(registerPage.allElementsAreDisplayds(), "cel putin unu din elemente nu a fost afisat");

    }
}
