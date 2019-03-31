package pages;

import CommonFunction.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FileUploadPage extends BaseUtil {

    public FileUploadPage(WebDriver driver) {
        PageFactory.initElements(BaseUtil.driver,this);
    }

    @FindBy(id = "file-upload")
    public WebElement browseButton;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/h3")
    public WebElement FileUploadedConfirmation;

    public void assertUpload(){
        Assert.assertEquals(FileUploadedConfirmation.getText(), "File Uploaded!");
    }
}