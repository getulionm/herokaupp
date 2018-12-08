package pages;

import CommonFunction.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// http://the-internet.herokuapp.com/

public class Homepage extends BaseUtil {

    @FindBy(how = How.LINK_TEXT, using = "Key Presses")
    public WebElement keyPresses;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void home(){
        driver.get("http://the-internet.herokuapp.com/");
    }

    public KeyPressesPage clickKeyPresses(){
        keyPresses.click();
        return new KeyPressesPage(driver);
    }

}
