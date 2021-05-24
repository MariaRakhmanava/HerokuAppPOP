package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage{

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public static final By I_FRAME_LINK = By.xpath("//*[contains(text(),'iFrame')]");
    public static final By I_FRAME_TEXT = By.xpath("//*[contains(text(),'Your content goes here.')]");

    public void openPage(String url) {
        driver.get(url);
        this.waitForElementLocated(I_FRAME_LINK, 10);
        driver.findElement(I_FRAME_LINK).click();
    }

    public String getIFrameText() {
        this.waitForElementLocated(I_FRAME_TEXT, 10);
        return driver.findElement(I_FRAME_TEXT).getText();
    }
}
