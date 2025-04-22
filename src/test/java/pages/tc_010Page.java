package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsLoggedIn() {
        // Implementar lógica para verificar si el usuario ha iniciado sesión
    }

    public void navigateToDocumentUploadForm() {
        // Implementar navegación al formulario de carga de documentos
    }

    public void uploadDocuments() {
        // Implementar carga de documentos
    }

    public void processDocuments() {
        // Implementar procesamiento de documentos
    }

    public boolean isSlipGenerated() {
        // Implementar verificación de generación del 'Slip de salida'
        WebElement slip = driver.findElement(By.id("slip-id"));
        return slip.isDisplayed();
    }

    public boolean areOriginalDocumentsSaved() {
        // Implementar verificación de almacenamiento de documentos originales en el historial
        WebElement originalDocuments = driver.findElement(By.id("original-documents"));
        return originalDocuments.isDisplayed();
    }

    public boolean areExtractedDataSaved() {
        // Implementar verificación de almacenamiento de datos extraídos en el historial
        WebElement extractedData = driver.findElement(By.id("extracted-data"));
        return extractedData.isDisplayed();
    }
}