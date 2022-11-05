package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryOfOrdersPage {
    WebDriver driver;
    MainMethodsPage mainMethodsPage;
    public HistoryOfOrdersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Web elements
    @FindBy(xpath = "(//td[@class = 'text-right'])[4]")
    WebElement lastOrderNumber;




    // Methods
    public String getOrderNumber() {
    mainMethodsPage = new MainMethodsPage(driver);
    return mainMethodsPage.getTextFromElement(lastOrderNumber);
    }
}
