package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploaderTest extends BaseTest implements iTestConstants {
    @Test
    public void uploadFileTest() {
        fileUploaderPage.openPage(FILE_UPLOADER_PAGE_URL);
        fileUploaderPage.uploadFile(FILE_PATH);
        fileUploaderPage.clickUploadButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(fileUploaderPage.getAfterLoadingMessageLocator()));
        Assert.assertEquals(fileUploaderPage.getUploadedFileName(), FILE_NAME);
    }
}
