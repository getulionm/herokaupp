package pages;

import CommonFunction.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

// http://the-internet.herokuapp.com/

public class Homepage extends BaseUtil {
    public final String TITLE = "The Internet";

    public void assertTitle(){
        Assert.assertEquals(driver.getTitle(), TITLE);
    }

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Key Presses")
    public WebElement keyPresses;

    public KeyPressesPage clickKeyPresses(){
        keyPresses.click();
        return new KeyPressesPage(driver);
    }

    @FindBy(linkText = "File Upload")
    public WebElement fileUpload;

    public FileUploadPage clickFileUpload(){
        fileUpload.click();
        return new FileUploadPage(driver);
    }

    @FindBy(linkText = "Dropdown")
    public WebElement dropdown;

    public DropdownPage clickDropdown(){
        dropdown.click();
        return new DropdownPage(driver);
    }

}
