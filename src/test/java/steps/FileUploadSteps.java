package steps;

import CommonFunction.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileUploadPage;
import pages.Homepage;

public class FileUploadSteps extends BaseUtil {

    Homepage homepageObj;
    FileUploadPage fileUploadPageObj;

    @Before("@FileUpload")
    public void setUp(){
        BaseUtil.initialise();
        homepageObj = new Homepage();
    }

    @After("@FileUpload")
    public void tearDown() {
        if (driver != null)
            driver.close();
    }

    @Given("^I am at Herokaupp / File Upload$")
    public void iAmAtHerokauppFileUpload() {
        fileUploadPageObj = homepageObj.clickFileUpload();
    }

    @When("^I select a file using Browse / Upload$")
    public void iSelectAFileUsingBrowseUpload(){
        fileUploadPageObj.browseButton.sendKeys("C:\\Users\\Ge\\Desktop\\Java Projects\\herokaupp\\pom_model.jpg");
        fileUploadPageObj.uploadButton.click();
    }

    @Then("^I can assure file has been uploaded$")
    public void iCanAssureFileHasBeenUploaded(){
        fileUploadPageObj.assertUpload();
    }


}