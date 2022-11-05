    package Pages;

    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

    public class October14GiftsPage {
        WebDriver driver;
        MainMethodsPage mainMethodsPage;

        public October14GiftsPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

        //Web elements
        @FindBy(xpath = "//button[@data-product_id = '86296166'][contains(text(), 'В корзину')]")
        WebElement BuyButton;
        @FindBy(xpath = "//a[contains(@class, 'btn-success')]/i")
        WebElement confirmOrderButtonOnPopUp;


        //Methods
        public void addProductToCart() {
            mainMethodsPage = new MainMethodsPage(driver);
            mainMethodsPage.moveToElement(BuyButton);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", BuyButton);
            // mainMethodsPage.clickToElement(BuyButton);

        }

        public void confirmOrderOnPopUp() {
            mainMethodsPage = new MainMethodsPage(driver);
            mainMethodsPage.clickToElement(confirmOrderButtonOnPopUp);
        }
    }