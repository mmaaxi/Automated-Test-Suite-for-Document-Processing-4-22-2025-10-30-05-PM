package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;
    
    By documentUploadOption = By.id("documentUploadOption");
    By singleFileUpload = By.id("singleFileUpload");
    By multipleFileUpload = By.id("multipleFileUpload");
    By singleFileBox = By.id("singleFileBox");
    By multipleFileBoxes = By.className("fileBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickOnDocumentUploadOption() {
        driver.findElement(documentUploadOption).click();
    }

    public boolean isSingleAndMultipleUploadVisible() {
        return driver.findElement(singleFileUpload).isDisplayed() &&
               driver.findElement(multipleFileUpload).isDisplayed();
    }

    public void selectSingleFileUpload() {
        driver.findElement(singleFileUpload).click();
    }

    public boolean isSingleFileBoxEnabled() {
        return driver.findElement(singleFileBox).isEnabled();
    }

    public void selectSeparateFilesUpload() {
        driver.findElement(multipleFileUpload).click();
    }

    public boolean areMultipleFileBoxesVisible() {
        return driver.findElements(multipleFileBoxes).size() > 1;
    }
}