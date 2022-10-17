    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.PageFactory;

    public class mainPage {
        private final WebDriver driver;
        MainMethods mainMethods;

        public mainPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

    // Web elements



    }

