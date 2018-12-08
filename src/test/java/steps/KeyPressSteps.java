package steps;

import CommonFunction.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.KeyPressesPage;

public class KeyPressSteps extends BaseUtil{

    Homepage homepageObj;
    KeyPressesPage keyPressesPageObj;

    @Before("@KeyPress")
    public void setUp(){
        BaseUtil.initialise();
        homepageObj = new Homepage();
    }

    @After("@KeyPress")
    public void tearDown() {
        if (driver != null)
            driver.close();
    }

    @Given("^I am at Herokaupp$")
    public void iAmAtHerokaupp(){
        homepageObj.home();
    }

    @When("^I click on key presses$")
    public void iClickOnKeyPresses(){
        keyPressesPageObj = homepageObj.clickKeyPresses();
    }

    @And("^I send a \"([^\"]*)\" key$")
    public void iSendAKey(String key){
        keyPressesPageObj.body.sendKeys(key);
    }

    @Then("^I can assert the \"([^\"]*)\" sent and the colour is green$")
    public void iCanAssertTheSentAndTheColourIsGreen(String key){
        keyPressesPageObj.verifyText(key);
    }


}
