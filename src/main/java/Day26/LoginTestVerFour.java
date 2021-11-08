package Day26;

import Day20_Framework.Commons.Assertor;
import Day20_Framework.Commons.BaseTest;
import Day20_Framework.Commons.LogUtil;
import Day20_Framework.Commons.ReportUtil;
import Day20_Framework.Constants.applicationConstants;
import Day20_Framework.PageObjects.homepage;
import Day20_Framework.PageObjects.signInPage;
import Day21_Framework.PageObjects1.HomePage1;
import Day21_Framework.PageObjects1.signInPage1;
import Day23.DataProviders.DP_Login;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static Day20_Framework.Constants.applicationConstants.*;

public class LoginTestVerFour extends BaseTest {

    //I have extended Day 20 _Framework  baseClass,homepage and signInpage classes in Day 26 Reports

    //includes Day26 content

    @Test(dataProvider = "InvalidLoginData", dataProviderClass = DP_Login.class)
    public void ValidateLoginApproach26(String username, String Password) throws InterruptedException, IOException {

        LogUtil.info("Invalid Login scenario");
        test = extentReports.createTest("Testing EMI Calculator");
        test.assignAuthor("Aish");
        test.assignDevice("Windows");
        test.assignCategory("Smoke");
        assertor = new Assertor(test);
        //SoftAssert Assert = new SoftAssert();
        //Old Assert
        //Assert.assertEquals(driver.getTitle(),"Buy Books Online | Online Bookstore India | Online Book Shopping | Free Shipping Across India","Title not matched");

        //new/Custom Assert

        LogUtil.info("In Homepage");
        homepage homepage = new homepage(driver);  //using page object class
        homepage.clickSignInBtn();

        //Old Assert
        //Assert.assertEquals(driver.getTitle(),"rediff.com ! Books Online","Title not matched");

        //new/Custom Assert
        assertor.assertEquals(driver.getTitle(),"rediff.com ! Books Online","Title not matched#");

        /*driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(3000);*/
        LogUtil.info("In SignInpage");
        signInPage signInPage = new signInPage(driver);
        signInPage.enterUserCredentials(username, Password);

       /* if (signInPage.isInvalidLoginErrorMessageDisplayed()) {
            ReportUtil.pass(test,"Successfully validate the error message",getscreenshot());
            //test.pass("Successfully validate the error message", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot().replace(REPORT_PATH +"\\","")).build());
        } else
            ReportUtil.pass(test,"Successfully validate the error message",getscreenshot());
            //test.fail("Failed as errormessage not displayed ", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot().replace(REPORT_PATH +"\\","")).build());
        //Assert.assertTrue(signInPage.isInvalidLoginErrorMessageDisplayed(),"Error not displayed");*/
        assertor.assertTrue(signInPage.isInvalidLoginErrorMessageDisplayed(),"Invalid login error is not displayed#" + getscreenshot());
        assertor.assertAll();
    }

    @Test(enabled = false)
    public void ValidateLoginApproach27(String username, String Password) throws InterruptedException, IOException {


        test = extentReports.createTest("Testing the Invalid Login Scenario");


        homepage homepage = new homepage(driver);  //using page object class
        homepage.clickSignInBtn();

        signInPage signInPage = new signInPage(driver);
        signInPage.enterUserCredentials(username, Password);

        if (signInPage.isInvalidLoginErrorMessageDisplayed()) {
            test.pass("Successfully validate the error message", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot().replace(REPORT_PATH +"\\","")).build());
        } else
            test.fail("Failed as errormessage not displayed ", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot().replace(REPORT_PATH +"\\","")).build());

    }
    }

