package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class explicitSync {
    public static void main(String[] args) throws IOException {

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

        //Explicit wait--This wait will work on the elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement emi = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("EMI")));

        // Explict wait check for the element in the page for a 60 secs. It will check the page for every 30 secs(Booling for element)

        //Extract calcualted emi
        //WebElement emi = driver.findElement(By.id("EMI"));
        String output = emi.getAttribute("value");
        System.out.println(output);

        //To exit from the running thread even after the execution of the code
        System.exit(0);
    }
}
