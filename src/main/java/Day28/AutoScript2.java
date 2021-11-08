package Day28;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class AutoScript2 {
    private static Logger log = Logger.getLogger("AutoScript2");

    public static void main(String[] args) {
        log.info("started the execution");

        //use an union bank emi calculator--Includes Day 3 and 4 content

        //Launch the browser and application

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx"); //application link

        log.error("started the execution");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        log.warn("Taking too much time");

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
