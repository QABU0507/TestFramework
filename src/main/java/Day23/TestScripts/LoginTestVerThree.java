package Day23.TestScripts;

import Day20_Framework.Commons.BaseTest;
import Day20_Framework.PageObjects.homepage;
import Day20_Framework.PageObjects.signInPage;
import Day23.DataProviders.DP_Login;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestVerThree extends BaseTest {

    //I have extended Day 20 _Framework  baseClass,homepage and signInpage classes in Day 23 data providers

    //includes Day24 content

    @Test(dataProvider = "InvalidLoginData",dataProviderClass = DP_Login.class)
    public void ValidateLoginApproach23(String username, String Password) throws InterruptedException {

        homepage homepage = new homepage(driver);  //using page object class
        homepage.clickSignInBtn();

        /*driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(3000);*/

        signInPage signInPage = new signInPage(driver);
        signInPage.enterUserCredentials(username, Password);

        if (signInPage.isInvalidLoginErrorMessageDisplayed()) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");

    }
}
