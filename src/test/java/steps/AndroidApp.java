package steps;

import automation.LandingPage;
import automation.PageFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import start.driver.AppiumWrapper;
public class AndroidApp {


    LandingPage landingPage = new LandingPage();
    PageFunctions functionTest = new PageFunctions();

    @Given("^I am on Intro Page$")
    public void iAmOnIntroPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     AppiumWrapper.intializeAppiumDriver();

    }


    @When("^I swipe right (\\d+) times on tutorials slides$")
    public void iSwipeRightTimesOnTutorialsSlides(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        functionTest.swipeRight();

    }

    @Then("^I verify Continue button is displayed$")
    public void iVerifyContinueButtonIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        
            Assert.assertTrue(landingPage.isContinueButtonDisplayed());

    }



}
