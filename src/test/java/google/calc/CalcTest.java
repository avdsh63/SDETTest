package google.calc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import page.object.YandexPage;

public class CalcTest {

    public ChromeDriver driver;
    private YandexPage yandexPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/avdsh/Development/SimbirsoftUITest/lib/chromedriver");
        driver =  new ChromeDriver();
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://yandex.ru/");

        yandexPage = new YandexPage(driver);

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

        yandexPage.firstPart();
        Thread.sleep(2000);
        driver.get("https://mail.yandex.ru/");
        Thread.sleep(3000);
        yandexPage.secondPart("first_message");

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}