package Day21_Framework.PageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage1 {

    public WebDriver driver;

    //Page elements For Login

    @FindBy(name = "logid")
    private WebElement txt_emailID;

    @FindBy(name = "pswd")
    private WebElement txt_password;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement btn_login;

    //Result for invalid login attempt -Page elemet of error message

    @FindBy(xpath = "//b[contains(text(),'The username and/or password you entered is incorrect.')]")
    private WebElement msg_errorMessage;

    //To launch the browswer- we are using constructor
    public signInPage1(WebDriver driver){
        this.driver=driver;    //this line is used if ur driver is dynamic. if u change ur driver opften.
        // we should store the driver in each page object class
        PageFactory.initElements(driver,this);
    }


    //method for entering the email and password and click login button
    public signInPage1 enterUserCredentials(String userName, String password) throws InterruptedException {
        txt_emailID.sendKeys(userName);
        Thread.sleep(2000);
        txt_password.sendKeys(password);
        Thread.sleep(2000);
        btn_login.click();
        return new signInPage1(driver);
    }

    //Method verify the invalid login error message
    public boolean isInvalidLoginErrorMessageDisplayed(){
        return msg_errorMessage.isDisplayed();
    }


}
