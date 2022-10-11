package page.object;

import org.openqa.selenium.chrome.ChromeDriver;

public class YandexPage extends BasePage {

    public YandexPage(ChromeDriver driver) {
        this.driver = driver;
    }

    protected final static String
        //first part
        //log_in_button ="//*[contains(@class, 'home-link2 headline__personal-enter home-link2_color_black')]",
        log_in_yandex_button = "//*[contains(@id, 'passp:sign-in')]",
        password_field = "//*[contains(@data-t, 'field:input-passwd')]",
        log_in_by_password_screen = "//*[contains(@data-t, 'button:action:passp:sign-in')]",
        mail_field = "//*[contains(@data-t, 'field:input-login')]",
        //second part
        get_in_mail ="//*[contains(@class, 'Button2 Button2_size_m Button2_view_action Button2_weight_500 Button_Vd8eu21iIVyRdyjGPVfYF PSHeader-NoLoginButton')]",
        write_button = "//*[contains(@class, 'Button2 Button2_type_link Button2_view_action Button2_size_m Layout-m__compose--pTDsx qa-LeftColumn-ComposeButton ComposeButton-m__root--fP-o9')]",
        send_adress_field = "//*[contains(@class, 'composeYabbles')]",
        theme_field = "//*[contains(@class, 'composeTextField ComposeSubject-TextField')]",
        message_field = "//*[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder')]",
        rassilkiButton = "//*[contains(@class, 'Folder-m__root--iLgY8 qa-LeftColumn-Folder')]",
        send_message_button = "//*[contains(@class, 'Button2 Button2_pin_circle-circle Button2_view_default Button2_size_l')]";

    public void authPath() throws InterruptedException {
        this.waitForElementAndClickByXpath(get_in_mail, "can't click get in button");
        this.waitForElementAndClickByXpath(mail_field, "can't click mail field");
        this.sendKeysByXpath(mail_field, "AvdshSDETT2022@yandex.ru");
        this.waitForElementAndClickByXpath(log_in_yandex_button, "can't click voiti");
        this.waitForElementAndClickByXpath(password_field, "can't click  password field");
        this.sendKeysByXpath(password_field, "TEST2022test");
        this.waitForElementAndClickByXpath(log_in_by_password_screen, "can't click voiti");
    }

    public void sendMail() throws InterruptedException {
        this.waitForElementPresentedByXpath(rassilkiButton, "can't find button rassulki");
        int n = this.messageCouter("Simbirsoft Тестовое задание");
        this.waitForElementAndClickByXpath(write_button, "can't click write button");
        this.waitForElementAndClickByXpath(send_adress_field, "can't click  send adress");
        this.sendKeysByXpath(send_adress_field, "AvdshSDETT2022@yandex.ru");
        this.waitForElementAndClickByXpath(message_field, "can't click message field");
        this.waitForElementAndClickByXpath(theme_field, "can't click theme field");
        this.sendKeysByXpath(theme_field, "Simbirsoft Тестовое задание");
        this.waitForElementAndClickByXpath(message_field, "can't click message field");
        this.sendKeysByXpath(message_field, String.valueOf(n));
        this.waitForElementAndClickByXpath(send_message_button, "can't click send button");
    }


//    public void checkCount(String message_text) throws InterruptedException {
//        driver.get("https://mail.yandex.ru/");
//        System.out.println("otkril i jdy");
//        Thread.sleep(500);
//        this.waitForElementPresentedByXpath(rassilkiButton, "can't find button rassulki");
//        Thread.sleep(5000);
//        System.out.println("Message count:");
//        System.out.println(this.messageCouter("Simbirsoft Тестовое задание"));
//
//    }
}