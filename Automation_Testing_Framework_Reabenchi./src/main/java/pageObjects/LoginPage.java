package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        super(driver);

    }


    @FindBy(id = "input-email")
    private WebElement emailImput;
    @FindBy(id = "input-password")
    private WebElement passwordImput;
    @FindBy(xpath = "//*[@id=\"form-login\"]/button")
    private WebElement loginButtonContiune;


    public void fillLoginPaga(String email, String password) {
        emailImput.sendKeys(email);
        passwordImput.sendKeys(password);
    }

    public void pressLogin() {
        loginButtonContiune.click();

    }

}
