package automation;

import start.driver.AppiumWrapper;



public class PageFunctions extends AppiumWrapper {
    LandingPage locator = new LandingPage();
    MobileBasePage takeAction = new MobileBasePage();
    public void swipeRight ()  throws InterruptedException
    {


        while(!locator.isContinueButtonDisplayed()) {
           System.out.println("Let me try to swipe");

            takeAction.swipingHorizontal();
       }







    }
}
