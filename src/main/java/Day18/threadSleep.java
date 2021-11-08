package Day18;

import Day17.PropertiesFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class threadSleep {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
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

        Thread.sleep(10000);// it will just make the code wait. if u don't know the element to make wait. u can use thread.sleep

        WebElement emi = driver.findElement(By.id("EMI"));
        String output = emi.getAttribute("value");
        System.out.println(output);

        //To exit from the running thread even after the execution of the code
        System.exit(0);
    }
}
