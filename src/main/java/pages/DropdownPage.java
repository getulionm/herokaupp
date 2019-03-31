package pages;

import CommonFunction.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage extends BaseUtil {

    @FindBy(id = "dropdown")
    public WebElement dropdownList;

    public DropdownPage(WebDriver driver) {
        PageFactory.initElements(driver, DropdownPage.class);
    }
}

// TODO No features or methods created for this page yet.