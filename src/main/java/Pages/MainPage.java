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
    @FindBy(xpath = "//a[@class = 'panel-user']")
        WebElement userAccountButton;



    // Methods

        public void clickAccountButton(){
            mainMethods = new MainMethodsPage(driver);
            mainMethods.clickToElement(userAccountButton);
        }


    }

