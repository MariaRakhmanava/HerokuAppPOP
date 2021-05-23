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

    public void openPage(String url) {
        driver.get(url);
    }

    public void uploadFile(String filePath) {
        driver.findElement(CHOOSE_FILE_BUTTON).sendKeys(new File(filePath).getAbsolutePath());
    }

    public void clickUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(UPLOADED_FILE_NAME).getText();
    }
}
