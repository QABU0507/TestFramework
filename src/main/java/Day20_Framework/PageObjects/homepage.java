package Day20_Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends PageObjectBase {   //Page factory-- which holds the elements in the page

    WebDriver driver;

    //webelemet to move to sign page

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

    //The above lines are similar to private Webelement lk_SignIn = driver.findelement(By.linkText("Sign In"));

    //To launch the browswer- we are using constructor
    public homepage(WebDriver driver){

        super(driver);   //this line invokes the constructor in the PageObjectbase class

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Method to click signIn button in Home page
    public void clickSignInBtn() throws InterruptedException {
        //Thread.sleep(3000);
        //lk_SignIn.click();
        clickelement(lk_SignIn);

    }
}
