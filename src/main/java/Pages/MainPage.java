package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class MainPage {
        private final WebDriver driver;
        MainMethodsPage mainMethods;

        public MainPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

    // Web elements
    @FindBy(xpath = "//span[contains(text(), 'Войти')]")
        WebElement userAccountButton;
    @FindBy(xpath = "//a[@href = 'https://chocoparadise.com.ua/my-account']/span[@class = 'menu-navigation__icon']")
        WebElement userButton;
    @FindBy(xpath = "(//div[@class = 'login-menu-link-text'])[2]")
        WebElement historyOrdersFromDropDown;
    @FindBy(xpath = "(//div[@class = 'login-menu-link-text'])[3]")
        WebElement logOutButton;



    // Methods

        public void clickAccountButton(){
            mainMethods = new MainMethodsPage(driver);
            mainMethods.clickToElement(userAccountButton);
        }

        public void clickUserButton(){
            mainMethods = new MainMethodsPage(driver);
            mainMethods.clickToElement(userButton);
        }

        public void clickOrderHistoryFromDropDown() {
            mainMethods = new MainMethodsPage(driver);
            mainMethods.clickToElement(historyOrdersFromDropDown);
        }

        public void clickLogOutFromDropDown() {
            mainMethods = new MainMethodsPage(driver);
            mainMethods.clickToElement(logOutButton);
        }
    }

