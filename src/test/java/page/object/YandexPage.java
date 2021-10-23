package page.object;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexPage extends BasePage {

    public YandexPage(ChromeDriver driver) {
        this.driver = driver;
    }

    protected final static String
        log_in_button ="//*[contains(@class, 'desk-notif-card__login-new-item-title')]",
        log_in_yandex_button = "//*[contains(@id, 'passp:sign-in')]",
        password_field = "//*[contains(@data-t, 'field:input-passwd')]",
        log_in_by_password_screen = "//*[contains(@data-t, 'button:action:passp:sign-in')]",
        mail_field = "//*[contains(@data-t, 'field:input-login')]";

    public void firstPart() throws InterruptedException {
        System.out.println("Start first part");
        Thread.sleep(1000);
        this.waitForElementAndClickByXpath(log_in_button, "can't click log in button");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(mail_field, "can't click mail field");
        Thread.sleep(500); //AvdushSDETTest@yandex.ru
        this.sendKeysByXpath(mail_field, "AvdushSDETTest@yandex.ru");
        this.waitForElementAndClickByXpath(log_in_yandex_button, "can't click voiti");
        Thread.sleep(1000);
        this.waitForElementAndClickByXpath(password_field, "can't click  password field");
        this.sendKeysByXpath(password_field, "test2021");
        this.waitForElementAndClickByXpath(log_in_by_password_screen, "can't click voiti");
        Thread.sleep(1000);
        System.out.println("end test");
    }

    public void secondPart() throws InterruptedException {
        System.out.println("Start test");
        Thread.sleep(1000);
        this.waitForElementAndClickByXpath(log_in_button, "can't click log in button");
        System.out.println("end test");
    }

}
