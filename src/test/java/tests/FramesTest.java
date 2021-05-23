package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest implements iTestConstants{
    @Test
    public void IFrameTest() {
        framesPage.openPage(FRAMES_PAGE_URL);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(I_FRAME_ID));
        Assert.assertEquals(framesPage.getIFrameText(), I_FRAME_TEXT_TO_BE);
    }
}
