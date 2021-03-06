package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploaderPage;
import pages.FramesPage;


public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploaderPage fileUploaderPage;
    FramesPage framesPage;


    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploaderPage = new FileUploaderPage(driver);
        framesPage = new FramesPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }
}

