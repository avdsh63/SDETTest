package page.object;

import org.openqa.selenium.chrome.ChromeDriver;

public class YandexPage extends BasePage {

    public YandexPage(ChromeDriver driver) {
        this.driver = driver;
    }

    protected final static String
        //first part
        log_in_button ="//*[contains(@class, 'desk-notif-card__login-new-item-title')]",
        log_in_yandex_button = "//*[contains(@id, 'passp:sign-in')]",
        password_field = "//*[contains(@data-t, 'field:input-passwd')]",
        log_in_by_password_screen = "//*[contains(@data-t, 'button:action:passp:sign-in')]",
        mail_field = "//*[contains(@data-t, 'field:input-login')]",
        //second part - write message class
        write_button = "//*[contains(@class, 'mail-ComposeButton-Text')]",
        send_adress_field = "//*[contains(@class, 'composeYabbles')]",
        theme_field = "//*[contains(@class, 'composeTextField ComposeSubject-TextField')]",
        message_field = "//*[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder')]",
        send_message_button = "//*[contains(@class, 'Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l')]";

    public void firstPart() throws InterruptedException {
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(log_in_button, "can't click log in button");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(mail_field, "can't click mail field");
        this.sendKeysByXpath(mail_field, "AvdushSDETTest@yandex.ru");
        this.waitForElementAndClickByXpath(log_in_yandex_button, "can't click voiti");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(password_field, "can't click  password field");
        this.sendKeysByXpath(password_field, "test2021");
        this.waitForElementAndClickByXpath(log_in_by_password_screen, "can't click voiti");
    }

    public void secondPart(String message_text) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("message count 1");
        System.out.println(this.messageCouter("Simbirsoft theme"));
        this.waitForElementAndClickByXpath(write_button, "can't click write button");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(send_adress_field, "can't click  send adress");
        this.sendKeysByXpath(send_adress_field, "AvdushSDETTest@yandex.ru");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(theme_field, "can't click theme field");
        this.sendKeysByXpath(theme_field, "Simbirsoft theme");
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(message_field, "can't click message field");
        this.sendKeysByXpath(message_field, message_text);
        Thread.sleep(500);
        this.waitForElementAndClickByXpath(send_message_button, "can't click send button");
        Thread.sleep(500);
        driver.get("https://mail.yandex.ru/");
        System.out.println("message count 2");
        System.out.println(this.messageCouter("Simbirsoft theme"));
        Thread.sleep(20000);
    }

}