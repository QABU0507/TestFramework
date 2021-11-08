package Day21_Framework.PageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {   //Page factory-- which holds the elements in the page

    public WebDriver driver;

    //webelement to move to sign page

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

    //The above lines are similar to private Webelement lk_SignIn = driver.findelement(By.linkText("Sign In"));

    //To launch the browser- we are using constructor
    public HomePage1(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    //Method to click signIn button in Home page
    //return will return the sign Inpage
    public signInPage1 clickSignInBtn() throws InterruptedException {
        Thread.sleep(3000);
        lk_SignIn.click();
        return new signInPage1(driver);

    }
}
