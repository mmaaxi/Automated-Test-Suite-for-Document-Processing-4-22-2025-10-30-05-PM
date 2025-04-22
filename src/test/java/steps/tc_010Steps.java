package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^El usuario ha iniciado sesión y se encuentra en el formulario de carga de documentos$")
    public void el_usuario_ha_iniciado_sesión_y_se_encuentra_en_el_formulario_de_carga_de_documentos() {
        page.userIsLoggedIn();
        page.navigateToDocumentUploadForm();
    }

    @When("^El usuario completa la carga y procesamiento de documentos$")
    public void el_usuario_completa_la_carga_y_procesamiento_de_documentos() {
        page.uploadDocuments();
        page.processDocuments();
    }

    @Then("^El sistema genera el 'Slip de salida'$")
    public void el_sistema_genera_el_slip_de_salida() {
        assertTrue(page.isSlipGenerated());
    }

    @Then("^El sistema guarda los documentos originales en el historial de la solicitud$")
    public void el_sistema_guarda_los_documentos_originales_en_el_historial_de_la_solicitud() {
        assertTrue(page.areOriginalDocumentsSaved());
    }

    @Then("^El sistema guarda los datos extraídos en el historial de la solicitud$")
    public void el_sistema_guarda_los_datos_extraídos_en_el_historial_de_la_solicitud() {
        assertTrue(page.areExtractedDataSaved());
    }
}