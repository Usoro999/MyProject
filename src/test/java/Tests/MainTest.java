package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MainTest {
    WebDriver driver;


    @BeforeTest
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.print("Start Test");

        driver.get("https://chocoparadise.com.ua/");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(3);
        Assert.assertEquals(driver.getTitle(), "—ладкие подарки/издели€ Ч купить шоколадные подарки/ фигурки из шоколада |  иев, ќдесса, ’арьков, ƒнепропетровск");

    }

    @AfterTest
    public void tearDown(){

            driver.quit();
    }
}