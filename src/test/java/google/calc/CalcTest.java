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
    public void googleCalcTest() throws InterruptedException {
        yandexPage = new YandexPage(driver);
        driver.get("https://mail.yandex.ru/");
        //String title = driver.getTitle();
        //Assert.assertTrue(title.equals("Яндекс"));
        yandexPage.authPath();
        yandexPage.sendMail();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}