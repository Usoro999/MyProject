package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class MainMethodsPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public MainMethodsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    // Methods
    public String getPageTitleText() {
        return driver.getTitle();
    }

    public String getHeaderTitleText(WebElement element) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void clickToElement(WebElement element) {
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void sendKeysMethod(WebElement element, String dataText) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(dataText);
    }

    public void sendKeysMethod(WebElement element) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(Keys.ENTER);
    }

    public String getRandomPhoneNumber(){
        return String.valueOf((int)(Math.random() * 10000000000.0));
    }

    public void moveToElement(WebElement element){
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

}

