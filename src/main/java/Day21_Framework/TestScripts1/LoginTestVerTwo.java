package Day21_Framework.TestScripts1;


import Day20_Framework.Commons.BaseTest;
import Day21_Framework.PageObjects1.HomePage1;
import Day21_Framework.PageObjects1.signInPage1;
import org.testng.annotations.Test;

public class LoginTestVerTwo extends BaseTest {

    @Test
    public void ValidateLoginApproach2() throws InterruptedException {

        HomePage1 homepage = new HomePage1(driver);
        signInPage1 signInpage1 =homepage.clickSignInBtn().enterUserCredentials("aishwarya", "ABC1234");
        if (signInpage1.isInvalidLoginErrorMessageDisplayed()) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");


    }
}
