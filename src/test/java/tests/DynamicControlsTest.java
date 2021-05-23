package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DynamicControlsTest extends BaseTest implements iTestConstants {
    @Test
    public void dynamicControlsCheckboxTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        int numberOfCheckboxes = dynamicControlsPage.getNumberOfCheckboxesOnThePage();
        dynamicControlsPage.clickCheckboxButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKBOX_MESSAGE));
        numberOfCheckboxes = dynamicControlsPage.getNumberOfCheckboxesOnThePage();
        Assert.assertEquals(numberOfCheckboxes, 0);
        dynamicControlsPage.clickCheckboxButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKBOX_MESSAGE));
        numberOfCheckboxes = dynamicControlsPage.getNumberOfCheckboxesOnThePage();
        Assert.assertEquals(numberOfCheckboxes, 1);
    }

    @Test
    public void dynamicControlInputTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        Assert.assertFalse(dynamicControlsPage.checkInputCondition());
        dynamicControlsPage.clickInputButton();
        WebElement inputField = dynamicControlsPage.findInputField();
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
        Assert.assertTrue(dynamicControlsPage.checkInputCondition());
    }
}
