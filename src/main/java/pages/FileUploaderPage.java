package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploaderPage extends BasePage{

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public static final By CHOOSE_FILE_BUTTON = By.xpath("//*[@id='file-upload']");
    public static final By UPLOAD_BUTTON = By.xpath("//*[@id='file-submit']");
    public static final By UPLOADED_FILE_NAME = By.xpath("//*[@id='uploaded-files']");
    public static final By AFTER_LOADING_MESSAGE_LOCATOR = By.xpath("//*[contains(text(),'File Uploaded!')]");

    public void openPage(String url) {
        driver.get(url);
    }

    public void uploadFile(String filePath) {
        this.waitForElementLocated(CHOOSE_FILE_BUTTON, 10);
        driver.findElement(CHOOSE_FILE_BUTTON).sendKeys(new File(filePath).getAbsolutePath());
    }

    public void clickUploadButton() {
        this.waitForElementLocated(UPLOAD_BUTTON, 10);
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        this.waitForElementLocated(UPLOADED_FILE_NAME, 10);
        return driver.findElement(UPLOADED_FILE_NAME).getText();
    }

    public By getAfterLoadingMessageLocator() {
        return AFTER_LOADING_MESSAGE_LOCATOR;
    }
}
