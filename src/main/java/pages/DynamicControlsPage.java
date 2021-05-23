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
    public static final By CHECKBOX_BUTTON = By.xpath("//*[@onclick='swapCheckbox()']");
    public static final By INPUT_FIELD = By.xpath("//input[@type='text']");
    public static final By INFLUENCE_INPUT_STATE_BUTTON = By.xpath("//button[@onclick='swapInput()']");

    public void openPage(String url) {
        driver.get(url);
    }

    public void clickCheckboxButton() {
        driver.findElement(CHECKBOX_BUTTON).click();
    }

    public int getNumberOfCheckboxesOnThePage() {
        List<WebElement> numberOfCheckboxes = driver.findElements(CHECKBOX);
        driver.findElement(CHECKBOX_BUTTON).click();
        numberOfCheckboxes = driver.findElements(CHECKBOX);
        return numberOfCheckboxes.size();
    }

    public boolean checkInputCondition() {
        return driver.findElement(INPUT_FIELD).isEnabled();
    }

    public void clickInputButton() {
        driver.findElement(INFLUENCE_INPUT_STATE_BUTTON).click();
    }

    public WebElement findInputField() {
        return driver.findElement(INPUT_FIELD);
    }
}
