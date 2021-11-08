package Day20_Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage extends PageObjectBase{

    WebDriver driver;

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
    public signInPage(WebDriver driver){

        super(driver);

        this.driver=driver;    //this line is used if ur driver is dynamic. if u change ur driver opften.
        // we should store the driver in each page object class
        PageFactory.initElements(driver,this);
    }


    //method for entering the email and password and click login button
    public void enterUserCredentials(String userName, String password) throws InterruptedException {
        //txt_emailID.sendKeys(userName);
        typetext(txt_emailID,userName);
        //Thread.sleep(2000);
        //txt_password.sendKeys(password);
        typetext(txt_password,password);
        //Thread.sleep(2000);
        //btn_login.click();
        clickelement(btn_login);
    }

    //Method verify the invalid login error message
    public boolean isInvalidLoginErrorMessageDisplayed(){

        //return msg_errorMessage.isDisplayed();
        return iselementDisplayed(msg_errorMessage);
    }


}
