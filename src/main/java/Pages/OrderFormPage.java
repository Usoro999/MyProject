package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderFormPage {

    WebDriver driver;
    MainMethodsPage mainMethodsPage;

    public OrderFormPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // Web elements
    @FindBy(xpath = "//div[@id = 'content']/h1")
    WebElement headerTitle;
    @FindBy(xpath = "//input[@name = 'customer[firstname]']")
    WebElement nameField;
    @FindBy(xpath = "//input[@name = 'customer[field24]']")
    WebElement commentField;
    @FindBy(xpath = "//input[@name = 'shipping_address[city]']")
    WebElement cityField;
    @FindBy(xpath = "//input[@name = 'shipping_address[address_1]']")
    WebElement NewPostField;
    @FindBy(xpath = "//li[@data-value = 'Отделение №7 (до 30 кг): ул. Леся Курбаса, 5']")
    WebElement selectPostNumber;
    @FindBy(xpath = "//span/div[@class = 'bank_transfer']")
    WebElement bankPaymentSelect;
    @FindBy(xpath = "//div[@class = 'simplecheckout-button-right']/input")
    WebElement confirmTheOrderButton;
    @FindBy(xpath = "//span[text() = 'NO']")
    WebElement cancelGooglefeedback;
    @FindBy(xpath = "//h1")
    WebElement numberOfOrder;
    @FindBy(xpath = "//iframe[@ng-non-bindable = '']")
    public WebElement iFrameId;




    // Methods
    public String getHeaderTitleText() {
        mainMethodsPage = new MainMethodsPage(driver);
        return mainMethodsPage.getTextFromElement(headerTitle);
    }


    public String getTextFromNameField() {
        mainMethodsPage = new MainMethodsPage(driver);
        return mainMethodsPage.getAttributeFromElement(nameField);
    }

    public void sendComment(String comment) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.sendKeysMethod(commentField, comment);

    }

    public void selectTheCity(String city) {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.moveToElement(cityField);
        mainMethodsPage.clearText(cityField);
        mainMethodsPage.sendKeysMethod(cityField, city);
        mainMethodsPage.sendKeyENTER(cityField);
    }

    public void selectNPNumber() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.moveToElement(NewPostField);
        mainMethodsPage.clickToElement(NewPostField);
        mainMethodsPage.moveToElement(selectPostNumber);
        mainMethodsPage.clickToElement(selectPostNumber);
    }

    public void selectPaymentMethod() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.moveToElement(bankPaymentSelect);
        mainMethodsPage.clickToElement(bankPaymentSelect);
    }

    public void confirmTheOrder() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.moveToElement(confirmTheOrderButton);
        mainMethodsPage.clickToElement(confirmTheOrderButton);
    }


    public void cancelGoogleFeedback() {
        mainMethodsPage.moveToElement(confirmTheOrderButton);
        mainMethodsPage.clickToElement(cancelGooglefeedback);
    }

    public String getNumberOfOrder() {
        mainMethodsPage = new MainMethodsPage(driver);
        String headerText = mainMethodsPage.getTextFromElement(numberOfOrder);
        return headerText.substring(11, 17);

    }



}
