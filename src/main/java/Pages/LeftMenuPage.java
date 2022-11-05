    package Pages;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

    public class LeftMenuPage {
            WebDriver driver;
            MainMethodsPage mainMethodsPage;

    public LeftMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Web elements
    @FindBy(xpath = "//button[@class = 'button-menu button-menu-toggle']/span[@class = 'catalog-icon']")
        WebElement burgerButton;
    @FindBy(xpath = "//a[@href = 'https://chocoparadise.com.ua/podarki-na-14-oktjabrja']")
        WebElement october14Button;




    // Methods
    public void clickBurgerButton() {
        mainMethodsPage = new MainMethodsPage(driver);
        mainMethodsPage.clickToElement(burgerButton);
    }


        public void selectOctober14Page() {
            mainMethodsPage = new MainMethodsPage(driver);
            mainMethodsPage.clickToElement(october14Button);
        }
    }
