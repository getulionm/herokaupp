package seleniumTests;

import CommonFunction.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.KeyPressesPage;

import java.util.ArrayList;
import java.util.List;

public class KeyPressPageTests extends BaseUtil {

    @Test // Tests using an Object list.
    public void loopUsingObjectList_Test(){
        driver.get("http://the-internet.herokuapp.com/");

        List<Object> objectKeys = new ArrayList<Object>(); // Keys can be edited here:
        objectKeys.add(Keys.HOME);
        objectKeys.add(Keys.LEFT_ALT);
        objectKeys.add(Keys.ARROW_UP);
        objectKeys.add(Keys.TAB);

        // Keys will be asserted with elements in the list:
        String[] expectedObjectText = new String[]{"HOME", "ALT", "UP", "TAB"};

        Homepage homepagePage = PageFactory.initElements(driver, Homepage.class);
        homepagePage.keyPresses.click();

        KeyPressesPage KeyPressesPage_Obj = PageFactory.initElements(driver, KeyPressesPage.class);
        for (int i=0; i <= 3; i++) {
            KeyPressesPage_Obj.body.sendKeys((CharSequence) objectKeys.get(i));
            Assert.assertEquals(KeyPressesPage_Obj.result.getText(), "You entered: "+expectedObjectText[i]);
            Assert.assertEquals(KeyPressesPage_Obj.result.getAttribute("style"), "color: green;");
        }
    }

    @Test  // Tests using a String list.
    public void loopUsingStringList_Test(){
        driver.get("http://the-internet.herokuapp.com/");
        String[] keysToTest = new String[] {"1", "9", "A", "Z"};
        Homepage homepagePage = PageFactory.initElements(driver, Homepage.class);
        homepagePage.keyPresses.click();

        KeyPressesPage KeyPressesPage_Obj = PageFactory.initElements(driver, KeyPressesPage.class);
        for (int i=0; i <= 3; i++) {
        KeyPressesPage_Obj.body.sendKeys(keysToTest[i]);
            Assert.assertEquals(KeyPressesPage_Obj.result.getText(), "You entered: "+keysToTest[i]);
            Assert.assertEquals(KeyPressesPage_Obj.result.getAttribute("style"), "color: green;");
        }
    }

}
