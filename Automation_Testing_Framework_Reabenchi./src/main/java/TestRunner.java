import Managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager chromeDriverManager = new WebDriverManager("CHROME");
        chromeDriverManager.getDriver().get("https://www.autodoc.de/");
        Thread.sleep(10000);
        chromeDriverManager.closeDriver();

        WebDriverManager firefoxDriver = new WebDriverManager("FIREFOX");
        firefoxDriver.getDriver().get("https://stackoverflow.com/questions/75709476/selenium-java-not-secure-data-displays-on-chrome-browser");
        Thread.sleep(10000);
        firefoxDriver.closeDriver();
    }
}




