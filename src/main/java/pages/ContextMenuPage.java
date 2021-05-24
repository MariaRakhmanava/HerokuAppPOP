package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    Actions actions = new Actions(driver);

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public static final By BOX_FIELD = By.xpath("//*[@id='hot-spot']");

    public void openPage(String url) {
        driver.get(url);
    }

    public void rightClickOnTheBox() {
        actions.contextClick(driver.findElement(BOX_FIELD)).perform();
    }

    public String getAlertText() {
      return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
