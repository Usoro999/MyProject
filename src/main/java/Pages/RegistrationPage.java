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
    @FindBy(xpath = "//input[@name = 'register[city]']")
    WebElement cityField;
    @FindBy(xpath = "//option[contains(text(), 'Львовская область')]")
    WebElement selectLvivRegion;
    @FindBy(xpath = "//input[@id = 'register_postcode']")
    WebElement postcode;
    @FindBy(xpath = "//input[@id = 'register_address_1']")
    WebElement streetField;
    @FindBy(xpath = "//a[@id = 'simpleregister_button_confirm']")
    WebElement submitButton;
    @FindBy(xpath = "//a[contains(@class, 'btn-primary')]")
    WebElement goAheadButton;
    @FindBy(xpath = "//h1")
    WebElement headerSuccessful;



    // Methods
    public String getTextHeaderTitle(){
        mainMethodsPage = new MainMethodsPage(driver);
        return mainMethodsPage.getTextFromElement(HeaderTitle);
    }

    public RegistrationPage typeEmailIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(emailField, text);
        return this;
    }

    public RegistrationPage typePasswordIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(passwordField, text);
        return this;
    }

    public RegistrationPage typePasswordConfirmationIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(passwordConfirmationField, text);
        return this;
    }

    public RegistrationPage typeFirstNameIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(FirstNameField, text);
        return this;
    }

    public RegistrationPage typeLastNameIntoForm(String text) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(LastNameField, text);
        return this;
    }
    public RegistrationPage typePhoneNumberIntoForm() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(phoneNumberField, mainMethodsPage.getRandomPhoneNumber());
        return this;
    }

    public RegistrationPage selectRegionIntoForm()  {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(regionSelection);
        mainMethodsPage.sendKeysMethod(regionSelection,"ль");
        mainMethodsPage.sendKeyENTER(regionSelection);
        return this;

    }

    public RegistrationPage typeCityIntoForm(String city) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(cityField, city);
        return this;
    }

    public RegistrationPage typeCityIndexIntoForm(String index) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(postcode, index);
        return this;
    }

    public RegistrationPage typeStreetIntoForm(String street) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(streetField, street);
        return this;
    }


    public RegistrationPage submitRegistration() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(submitButton);
        return this;

    }

    public String getTextHeaderTitleSuccessful() {
        mainMethodsPage = new MainMethodsPage(driver);
        return mainMethodsPage.getTextFromElement(headerSuccessful);
    }
}
