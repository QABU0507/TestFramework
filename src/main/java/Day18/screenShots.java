package Day18;

import Day17.PropertiesFiles;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class screenShots {
    public static void main(String[] args) throws IOException, InterruptedException {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-mmm-yyyy hh-mm-ss");
        String CleanDate = DateFormat.format(date);
        System.out.println(CleanDate);


        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        WebDriver driver = new FirefoxDriver();                                   //object to launch the browser, WebDriver is a interface
        driver.get(PropertiesFiles.getConfigValue(PropertiesFiles.getConfigValue("currentEnv")));

        //Implicit Wait- for page load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS );

        // enter loan amount
        driver.findElement(By.id("loanamount")).sendKeys("3000000");  //finds the loan amount field and provides the value as 30 lakhs

        // enter interest rate in %
        driver.findElement(By.name("rate")).sendKeys("12"); //Finds the rate in % and provides the value 12

        // enter period in months
        driver.findElement(By.name("pmonths")).sendKeys("120"); //Finds tenure and provides the value 120

        //Click calculate button
        driver.findElement(By.id("Button1")).click(); // Clicks the calculate button

        //Extract emi value
        WebElement emi = driver.findElement(By.id("EMI"));
        String output = emi.getAttribute("value");

        TakesScreenshot ss = (TakesScreenshot) driver; // we are typecasting driver object to TakeScreenshot interface.
        File img = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\ScreenShots\\screenshot_" +CleanDate+".png"));


        System.out.println(output);


        //To exit from the running thread even after the execution of the code
        System.exit(0);
    }

}
