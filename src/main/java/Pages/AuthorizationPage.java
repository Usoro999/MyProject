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


    // Methods
    public void clickRegistrationButton(){
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(registrationButton);
    }
}
