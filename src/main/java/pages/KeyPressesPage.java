package pages;

import CommonFunction.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KeyPressesPage extends BaseUtil {

    public KeyPressesPage(WebDriver driver) {
        PageFactory.initElements(BaseUtil.driver,this);
    }

    @FindBy(id = "result")
    public WebElement result;

    @FindBy(tagName = "body")
    public WebElement body;

    public void verifyText(String key){
        Assert.assertEquals(result.getText(), "You entered: "+key);
        Assert.assertEquals(result.getAttribute("style"), "color: green;");
    }
}