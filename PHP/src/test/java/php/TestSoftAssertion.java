package php;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestSoftAssertion {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.78 Safari/537.36");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void searchText(String str) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(str, Keys.ENTER);
    }

    @Test
    public void testText() {
        String expectedResult = "232lkj3k3klj3kjl3lk3lj";
        searchText("Selenium Books");
        String currentURL = driver.getCurrentUrl();
        String actualResutlText = "Selenium Framework Design in Data-Driven Testing: Build data-driven test frameworks using Selenium WebDriver, AppiumDriver, Java, and TestNG";
        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(currentURL.contains("php.net/manual/en/function.eval.php"), "the URL is not correct.");
        String bodyText = driver.findElement(By.tagName("body")).getText();
        String text = driver.findElement(By.partialLinkText("Selenium Framework Design in Data-Driven")).getText();
        softAssert.assertTrue(text.equalsIgnoreCase(expectedResult), "Test Failed");
        softAssert.assertTrue(text.contains("12k2k3l3l3"), "it does not have 'actual test");
        Assert.assertTrue(actualResutlText.equalsIgnoreCase(text), "test failed");
        Assert.assertTrue(actualResutlText.equalsIgnoreCase(text));
//        softAssert.assertAll();
    }
}
