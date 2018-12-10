package automation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class LandingPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")

    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View[@content-desc='Angular']//following-sibling::android.widget.CheckBox")
    private List<MobileElement> toggleSwitch;


    public boolean isContinueButtonDisplayed()
    {
        return isElementDisplayed(continueButton);
    }


    public void listElement()
    {
        isElementSelected(continueButton);
    }

}
