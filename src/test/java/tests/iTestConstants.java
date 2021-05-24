package tests;

import org.openqa.selenium.By;


public interface iTestConstants {
    String ROOT_URL = "http://the-internet.herokuapp.com/";
    String CONTEXT_MENU_PAGE_URL = ROOT_URL + "context_menu";
    String DYNAMIC_CONTROLS_PAGE_URL = ROOT_URL + "dynamic_controls";
    String FILE_UPLOADER_PAGE_URL = ROOT_URL + "upload";
    String FRAMES_PAGE_URL = ROOT_URL + "frames";
    String ALERT_TEXT = "You selected a context menu";
    String FILE_PATH = "./HerokuAppFile.docx";
    String FILE_NAME = FILE_PATH.substring(2);
    String I_FRAME_ID = "mce_0_ifr";
    String I_FRAME_TEXT_TO_BE = "Your content goes here.";
}
