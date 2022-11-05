package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    WebDriver driver;
    MainMethodsPage mainMethodsPage;

    public AuthorizationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web elements
    @FindBy(xpath = "//a[@class = 'list-group-item'][contains(text(), 'Регистрация')]")
    WebElement registrationButton;
    @FindBy(xpath = "//input[@name = 'email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@name = 'password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@value = 'Войти']")
    WebElement enterButton;




    // Methods
    public void clickRegistrationButton(){
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(registrationButton);
    }

    public void inputEmailIntoField(String email) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(emailField, email);
    }

    public void inputPasswordIntoField(String password) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(passwordField, password);
    }

    public void clickEnterButton() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(enterButton);
    }
}
