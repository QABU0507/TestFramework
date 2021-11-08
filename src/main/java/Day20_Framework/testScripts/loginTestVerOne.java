package Day20_Framework.testScripts;

import Day20_Framework.Commons.BaseTest;
import Day20_Framework.PageObjects.homepage;
import Day20_Framework.PageObjects.signInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginTestVerOne extends BaseTest {

    @Test(enabled = false)
    //If u provide @Test(enabled= false) this will not be selected to run
    public void ValidateLogin() throws InterruptedException, IOException {


        //launchApp();  // using Base Test class


        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='logid']")).sendKeys("sdjsduwedj");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("alscweir");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

        if (driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
    }


    //Approach 1
    @Test
    public void ValidateLoginApproach1() throws InterruptedException {

        homepage homepage = new homepage(driver);  //using page object class
        homepage.clickSignInBtn();

        /*driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(3000);*/

        signInPage signInPage = new signInPage(driver);
        signInPage.enterUserCredentials("aishwarya", "ABC1123");

        /*
        driver.findElement(By.xpath("//input[@name='logid']")).sendKeys("sdjsduwedj");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("alscweir");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

         */

        if (signInPage.isInvalidLoginErrorMessageDisplayed()) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");

        /*
        if (driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
            */
    }
}
