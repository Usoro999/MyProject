package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;
    MainMethodsPage mainMethodsPage;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Web elements
    @FindBy(xpath = "//h1[text() = 'Быстрая регистрация']")
    WebElement HeaderTitle;
    @FindBy(xpath = "//input[@type = 'email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id = 'register_password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id = 'register_confirm_password']")
    WebElement passwordConfirmationField;
    @FindBy(xpath = "//input[@id = 'register_firstname']")
    WebElement FirstNameField;
    @FindBy(xpath = "//input[@id = 'register_lastname']")
    WebElement LastNameField;
    @FindBy(xpath = "//input[@id = 'register_telephone']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//select[@id = 'register_zone_id']")
    WebElement regionSelection;
    @FindBy(xpath = "//option[contains(text(), 'Львовская область')]")
    WebElement selectLvivRegion;
    @FindBy(xpath = "//input[@id = 'register_postcode']")
    WebElement postcode;
    @FindBy(xpath = "//input[@id = 'register_address_1']")
    WebElement streetField;
    @FindBy(xpath = "//a[@id = 'simpleregister_button_confirm']")
    WebElement submitButton;



    // Methods
    public String getTextHeaderTitle(){
        mainMethodsPage = new MainMethodsPage(driver);
        return mainMethodsPage.getHeaderTitleText(HeaderTitle);
    }

    public void typeEmailIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(emailField, text);
    }

    public void typePasswordIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(passwordField, text);
    }

    public void typePasswordConfirmationIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(passwordConfirmationField, text);
    }

    public void typeFirstNameIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(FirstNameField, text);
    }

    public void typeLastNameIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(LastNameField, text);
    }
    public void typePhoneNumberIntoForm() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(phoneNumberField, mainMethodsPage.getRandomPhoneNumber());
    }

    public void selectRegionIntoForm() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(regionSelection);
        mainMethodsPage.moveToElement(selectLvivRegion);
        mainMethodsPage.clickToElement(selectLvivRegion);
    }

    public void typeCityIntoForm(String city) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(LastNameField, city);
    }

    public void typeCityIndexIntoForm(String index) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(postcode, index);
    }

    public void typeStreetIntoForm(String street) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(streetField, street);
    }


    public void submitRegistration() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(submitButton);

    }
}
