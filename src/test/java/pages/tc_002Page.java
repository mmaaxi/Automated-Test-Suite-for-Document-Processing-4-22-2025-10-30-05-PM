package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;
    
    By uploadInput = By.id("file-upload");
    By previewSection = By.id("file-preview");
    By previewName = By.id("preview-name");
    By previewSize = By.id("preview-size");
    By previewType = By.id("preview-type");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/file-upload");
    }
    
    public void selectFileToUpload(String fileName) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(fileName);
    }
    
    public boolean isPreviewDisplayed() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public boolean isPreviewCorrect() {
        String fileName = driver.findElement(previewName).getText();
        String fileSize = driver.findElement(previewSize).getText();
        String fileType = driver.findElement(previewType).getText();
        
        return fileName.contains("example.pdf") && fileSize.contains("MB") && fileType.contains("PDF");
    }
}