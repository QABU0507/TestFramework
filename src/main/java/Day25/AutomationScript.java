package Day25;

import Day20_Framework.Constants.applicationConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AutomationScript {
    public static void main(String[] args) throws IOException {

        //Below steps record the screenshots
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Report.html");
        //below step used for event logging-- if we don't want the logger we don't have to create object and attach
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(System.getProperty("user.dir") + "\\Reports");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);

        ExtentTest test =extentReports.createTest("Testing the EMI calculation");
        test.info("Execution started");



        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        //System.setProperty("webdriver.gecko.driver", applicationConstants.GECKO_PATH);
        WebDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx"); //application link
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        test.pass("Application launched successfully");
        test.assignAuthor("Aishwarya");
        test.assignDevice("Windows");
        test.assignCategory("Smoke");

    // enter loan amount
        driver.findElement(By.id("loanamount")).sendKeys("3000000");  //finds the loan amount field and provides the value as 30 lakhs

    // enter interest rate in %
        driver.findElement(By.name("rate")).sendKeys("12"); //Finds the rate in % and provides the value 12

    // enter period in months
        driver.findElement(By.name("pmonths")).sendKeys("120"); //Finds tenure and provides the value 120

    //Click calculate button
        driver.findElement(By.id("Button1")).click(); // Clicks the calculate button

    //Extract calcualted emi
    String emi = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(emi);
        test.pass("Successfully extracted EMI");

        TakesScreenshot ss = (TakesScreenshot) driver; // we are typecasting driver object to TakeScreenshot interface.
        File img = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Reports\\ReportScreenShots\\R_screenshot.png"));

        test.fail("failed to extract EMI", MediaEntityBuilder.createScreenCaptureFromPath("ReportScreenShots\\R_screenshot.png").build());

    //To exit from the running thread even after the execution of the code
        extentReports.flush();
        System.exit(0);


}

}
