package Day20_Framework.Commons;

import Day20_Framework.Constants.applicationConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Day20_Framework.Constants.applicationConstants.*;

public class BaseTest {
    public WebDriver driver;
    public static GlobalConfig config;
    public static ExtentReports extentReports;
    public ExtentTest test;
    public Assertor assertor;

    @BeforeSuite
    public void initSetup() throws IOException {
        config = GlobalConfig.getProperties();
        extentReports = ReportUtil.getReport();
    }
    @Test(testName = "firefox")
    @Parameters("Browser")
    @BeforeMethod
    public void launchApp(String Browser) throws IOException {

        //if we have provide browser input from testng.xml file

        switch(Browser){
            case "firefox" :
                    getfirefoxdriver();

            case "chrome" :
                    getchromedriver();

        }

        //System.setProperty("webdriver.gecko.driver", config.get("Geckodriverpath")); //path of the gecko driver
        //System.setProperty("webdriver.gecko.driver", config.get(applicationConstants.GECKO_PATH));

        /*
        System.setProperty("webdriver.gecko.driver", GECKO_PATH);
        driver = new FirefoxDriver();//object to launch the browser

        */
       // driver.get(config.get("BookApp"));
       // driver.get(config.get(applicationConstants.CURRENT_ENVIRONMENT));
        driver.get(config.get(config.get(CURRENT_ENVIRONMENT)));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    public WebDriver getfirefoxdriver(){
        System.setProperty("webdriver.gecko.driver", GECKO_PATH);
        driver = new FirefoxDriver();
        return driver;
    }


    public WebDriver getchromedriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension",false);
        System.setProperty("webdriver.chrome.driver", CHROME_PATH);
        driver = new ChromeDriver(options);
        return driver;
    }


    @AfterMethod
    public void teardown(){

        extentReports.flush();
        driver.quit();
    }

    public String getscreenshot() throws IOException {
        String filename=null;
        try {
            TakesScreenshot ss = (TakesScreenshot) driver; // we are typecasting driver object to TakeScreenshot interface.
            File img = ss.getScreenshotAs(OutputType.FILE);
            filename = REPORT_PATH +"\\ReportScreenShots\\Rescreenshot_" + getUniqueTimeStamp() + ".png";
            FileUtils.copyFile(img, new File(filename));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return filename;
    }

    public String getUniqueTimeStamp(){
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-mmm-yyyy hh-mm-ss");
        String CleanDate = DateFormat.format(date);
        return CleanDate;
    }

    @AfterSuite
    public void cleanprocess() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe /T");
    }

}
