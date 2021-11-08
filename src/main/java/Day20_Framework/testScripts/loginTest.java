package Day20_Framework.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTest {

    @Test
    public void validateinvalidlogin() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        WebDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("http://books.rediff.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='logid']")).sendKeys("sdjsduwedj");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("alscweir");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

        if(driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed())
        {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

}
