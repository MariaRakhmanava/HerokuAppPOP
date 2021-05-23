package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest implements iTestConstants {

    @Test
    public void alertTextValidationTest() {
        contextMenuPage.openPage(CONTEXT_MENU_PAGE_URL);
        contextMenuPage.rightClickInTheBox();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), ALERT_TEXT);
        alert.accept();
    }
}
