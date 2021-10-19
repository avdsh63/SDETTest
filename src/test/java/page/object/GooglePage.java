package page.object;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage extends BasePage {

    public GooglePage(ChromeDriver driver) {
        this.driver = driver;
    }

    protected final static String
        FIND_FIELD = "//*[contains(@name, 'q')]",
        FIND_IN_GOOGLE = "//*[contains(@name, 'btnK')]",
        BUTTON_0 ="//*[contains(@jsname, 'bkEvMb')]",
        BUTTON_1 ="//*[contains(@jsname, 'N10B9')]",
        BUTTON_2 ="//*[contains(@jsname, 'lVjWed')]",
        BUTTON_3 ="//*[contains(@jsname, 'KN1kY')]",
        BUTTON_4 ="//*[contains(@jsname, 'xAP7E')]",
        BUTTON_5 ="//*[contains(@jsname, 'Ax5wH')]",
        BUTTON_6 ="//*[contains(@jsname, 'abcgof')]",
        BUTTON_PLUS ="//*[contains(@jsname, 'XSr6wc')]",
        BUTTON_MINUS ="//*[contains(@jsname, 'pPHzQc')]",
        BUTTON_MULTIPLICATION ="//*[contains(@jsname, 'YovRWb')]",
        BUTTON_DIVISION ="//*[contains(@jsname, 'WxTTNd')]",
        BUTTON_OPEN_PARENTHESIS ="//*[contains(@jsname, 'j93WEe')]",
        BUTTON_CLOSING_PARENTHESIS ="//*[contains(@jsname, 'qCp9A')]",
        FIELD_RESULT = "//*[contains(@jsname, 'VssY5c')]",
        FIELD_INPUT = "//*[contains(@jsname, 'ubtiRe')]",
        BUTTON_SIN = "//*[contains(@jsname, 'aN1RFf')]",
        BUTTON_EQUALS ="//*[contains(@jsname, 'Pt8tGc')]";

    public void openGoogleCalc() throws InterruptedException {
        System.out.println("Start test");
        Thread.sleep(2000);
        this.waitForElementAndClickByXpath(FIND_FIELD, "can't click on find field");
        this.sendKeysByXpath(FIND_FIELD, "Калькулятор");
        Thread.sleep(2000);
        this.waitForElementAndClickByXpath(FIND_IN_GOOGLE, "can't click find in google button");
    }

    public void calculateFirstTest() throws InterruptedException {
        this.waitForElementAndClickByXpath(BUTTON_OPEN_PARENTHESIS,"can't click ( ");
        this.waitForElementAndClickByXpath(BUTTON_1,"can't click 1"); //(1+2)*3-40/5
        this.waitForElementAndClickByXpath(BUTTON_PLUS,"can't click +");
        this.waitForElementAndClickByXpath(BUTTON_2,"can't click 2");
        this.waitForElementAndClickByXpath(BUTTON_CLOSING_PARENTHESIS,"can't click )");
        this.waitForElementAndClickByXpath(BUTTON_MULTIPLICATION,"can't click *");
        this.waitForElementAndClickByXpath(BUTTON_3,"can't click 3");
        this.waitForElementAndClickByXpath(BUTTON_MINUS,"can't click -");
        this.waitForElementAndClickByXpath(BUTTON_4,"can't click 4");
        this.waitForElementAndClickByXpath(BUTTON_0,"can't click 0");
        this.waitForElementAndClickByXpath(BUTTON_DIVISION,"can't click /");
        this.waitForElementAndClickByXpath(BUTTON_5,"can't click 5");
        this.waitForElementAndClickByXpath(BUTTON_EQUALS,"can't click =");
        Thread.sleep(500);
        Assert.assertTrue(elementTextEquals(FIELD_RESULT,"1"));
        Assert.assertTrue(elementTextEquals(FIELD_INPUT,"(1 + 2) × 3 - 40 ÷ 5 ="));
    }

    public void calculateForSecondTest() throws InterruptedException {
        this.waitForElementAndClickByXpath(BUTTON_6, "can't click 6");
        this.waitForElementAndClickByXpath(BUTTON_DIVISION, "can't click /");
        this.waitForElementAndClickByXpath(BUTTON_0, "can't click 0");
        this.waitForElementAndClickByXpath(BUTTON_EQUALS,"can't click =");
        Thread.sleep(500);
        Assert.assertTrue(elementTextEquals(FIELD_RESULT,"Infinity"));
        Assert.assertTrue(elementTextEquals(FIELD_INPUT,"6 ÷ 0 ="));
    }

    public void calculateForThirdTest() throws InterruptedException {
        this.waitForElementAndClickByXpath(BUTTON_SIN, "can't click sin");
        this.waitForElementAndClickByXpath(BUTTON_EQUALS,"can't click =");
        Thread.sleep(500);
        Assert.assertTrue(elementTextEquals(FIELD_RESULT,"Error"));
        Assert.assertTrue(elementTextEquals(FIELD_INPUT,"sin() ="));
    }

}
