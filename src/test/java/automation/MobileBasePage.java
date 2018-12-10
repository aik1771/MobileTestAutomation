package automation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import start.driver.AppiumWrapper;

import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;
import static start.driver.AppiumWrapper.appiumDriver;
import static start.driver.AppiumWrapper.buildAppiumDriver;

public class MobileBasePage {
     public String elementFound="";
    Dimension size;

    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements()
    {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     * @param mobileElement
     * @return
     */
    protected boolean isElementSelected(MobileElement mobileElement)
    {


       return true;

    }
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        boolean isDisplay = false;

        try {
            mobileElement.isDisplayed();
            isDisplay = true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        return isDisplay;
    }

    public void swipingHorizontal() throws InterruptedException {
        //Get the size of screen.

        size = appiumDriver.manage().window().getSize();
        System.out.println(size);

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.20);
        //Find endx point which is at left side of screen.
        int endy = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        int endx = (endy + 900);
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
       // appiumDriver.swipe(startx, starty, endx, starty, 3000);
   //     Thread.sleep(2000);

        //Swipe from Left to Right.
       // appiumDriver.swipe(endx, starty, startx, starty, 3000);
       // Thread.sleep(2000);

        TouchAction action = new TouchAction (appiumDriver);
        action.press (endx, endy)
                .moveTo (startx, endy)
                .release ()
                .perform ();
    }


}

