package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected WebDriver driver;

    public WebElement waitForElementPresentedByXpath(String xpath, String error_message) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.withMessage(error_message);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public WebElement getElement(String xpath, String error_message) {
        WebElement element = waitForElementPresentedByXpath(xpath, error_message);
        return element;
    }

    public WebElement waitForElementAndClickByXpath(String locator, String error_message) throws InterruptedException {
        WebElement element = waitForElementPresentedByXpath(locator, error_message);
        element.click();
        Thread.sleep(150);
        return element;
    }

    public void sendKeysByXpath(String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(text);
    }

    public boolean elementTextEquals(String xpath, String equals) throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = this.getElement(xpath, "can't find element");
        if (element.getText().equals(equals)) {
            return true;
        }
        else {
        return false;
        }
    }

    public int messageCouter(String theme_text) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elements = driver.findElements(By.partialLinkText(theme_text));
        return elements.size();
    }
}