package google.calc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import page.object.GooglePage;

public class CalcTest {

    public ChromeDriver driver;
    private GooglePage googlePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/avdsh/Development/SimbirsoftUITest/lib/chromedriver");
        driver =  new ChromeDriver();
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://www.google.com/");

        googlePage = new GooglePage(driver);

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

        googlePage.openGoogleCalc();
        googlePage.calculateFirstTest();
    }

    @Test
    public void secondTest() throws InterruptedException {
        driver.get("https://www.google.com/");

        googlePage = new GooglePage(driver);

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

        googlePage.openGoogleCalc();
        googlePage.calculateForSecondTest();
    }

    @Test
    public void thirdTest() throws InterruptedException {
        driver.get("https://www.google.com/");

        googlePage = new GooglePage(driver);

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

        googlePage.openGoogleCalc();
        googlePage.calculateForThirdTest();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
