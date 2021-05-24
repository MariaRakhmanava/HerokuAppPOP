package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicControlsPage extends BasePage {

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public static final By CHECKBOX = By.xpath("//input[@type='checkbox']");
    public static final By INFLUENCE_CHECKBOX_STATE_BUTTON = By.xpath("//*[@onclick='swapCheckbox()']");
    public static final By INPUT_FIELD = By.xpath("//input[@type='text']");
    public static final By INFLUENCE_INPUT_STATE_BUTTON = By.xpath("//button[@onclick='swapInput()']");
    public static final By CHECKBOX_MESSAGE_LOCATOR = By.xpath("//*[@id='message']");

    public void openPage(String url) {
        driver.get(url);
    }

    public void clickCheckboxButton() {
        this.waitForElementLocated(INFLUENCE_CHECKBOX_STATE_BUTTON, 10);
        driver.findElement(INFLUENCE_CHECKBOX_STATE_BUTTON).click();
    }

    public int getNumberOfCheckboxesOnThePage() {
        List<WebElement> numberOfCheckboxes = driver.findElements(CHECKBOX);
        this.waitForElementLocated(INFLUENCE_CHECKBOX_STATE_BUTTON, 10);
        driver.findElement(INFLUENCE_CHECKBOX_STATE_BUTTON).click();
        numberOfCheckboxes = driver.findElements(CHECKBOX);
        return numberOfCheckboxes.size();
    }

    public boolean isInputFieldEnabled() {
        this.waitForElementLocated(INPUT_FIELD, 10);
        return driver.findElement(INPUT_FIELD).isEnabled();
    }

    public void clickInputButton() {
        this.waitForElementLocated(INPUT_FIELD, 10);
        driver.findElement(INFLUENCE_INPUT_STATE_BUTTON).click();
    }

    public WebElement findInputField() {
        this.waitForElementLocated(INPUT_FIELD, 10);
        return driver.findElement(INPUT_FIELD);
    }

    public By getCheckboxMessageLocator() {
        return CHECKBOX_MESSAGE_LOCATOR;
    }
}
