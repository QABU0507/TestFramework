package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class implicitSync {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get(PropertiesFiles.getConfigValue(PropertiesFiles.getConfigValue("currentEnv")));
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS );

        /*
        You have given implict wait for 60 seconds. Implicit wait works when page loads for the very first time.
        Any changes/load made in same page will not have implicit wait
        if ur page loads in 5sec, implicit wait move to next line will not wait for remaining 55 sec
        if ur page loads more than 60 sec,implict wait move to next line and gives exception if its unable to locate the element.
        */

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

        //To exit from the running thread even after the execution of the code
        System.exit(0);
    }
}
