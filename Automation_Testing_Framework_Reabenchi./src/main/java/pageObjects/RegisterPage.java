package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    private WebElement firstNameImput;
    @FindBy(id = "input-lastname")
    private WebElement lastNameImput;
    @FindBy(id = "input-email")
    private WebElement emailImput;
    @FindBy(id = "input-password")
    private WebElement passwordImput;
    @FindBy(name = "agree")
    private WebElement privacyCheckBoxImput;
    @FindBy(xpath = "//*[@id=\"form-register\"]/div/div/button")
    private WebElement continueButton;


    public void fillInTheRegisterForm(String fistName, String lastName, String email, String password) {
        firstNameImput.sendKeys(fistName);
        lastNameImput.sendKeys(lastName);
        emailImput.sendKeys(email);
        passwordImput.sendKeys(password);
    }
}
