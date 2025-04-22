package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage = PageFactory.initElements(driver, tc_002Page.class);
    
    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        uploadPage.openUploadPage();
    }

    @When("I select a file {string} within the limit of 50 MB")
    public void i_select_a_file_within_the_limit_of_50_MB(String fileName) {
        uploadPage.selectFileToUpload(fileName);
    }

    @Then("the file should be uploaded and a preview should be displayed")
    public void the_file_should_be_uploaded_and_a_preview_should_be_displayed() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
    }

    @Then("the preview should show the file name, size, and type")
    public void the_preview_should_show_the_file_name_size_and_type() {
        Assert.assertTrue(uploadPage.isPreviewCorrect());
    }
}