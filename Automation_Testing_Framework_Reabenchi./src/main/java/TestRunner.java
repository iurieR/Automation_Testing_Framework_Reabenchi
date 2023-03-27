import Managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager chromeDriverManager = new WebDriverManager("CHROME");
        chromeDriverManager.getDriver().get("https://demo.opencart.com/");
        HomePage homePage = new HomePage(chromeDriverManager.getDriver());
        homePage.navigateToRegisterPage();
        RegisterPage registerPage = new RegisterPage(chromeDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("vlad", "ignatenco", "ignatencovlad@mail.ru", "11111");
        Thread.sleep(3000);


        LoginPage loginPage = new LoginPage(chromeDriverManager.getDriver());
        loginPage.navigateToLoginPage();
        loginPage.fillLoginPaga("ignatenco@gmail.com", "11111a");
        Thread.sleep(3000);
        loginPage.pressLogin();


    }
}


