import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainMethods {
    private final WebDriver driver;


    public MainMethods(WebDriver driver) {
            this.driver=driver;
            PageFactory.initElements(driver, this);

    // Web elements
        

    }
}

