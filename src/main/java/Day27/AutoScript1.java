package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AutoScript1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx"); //application link

        //to validate the title of the page
        if(driver.getTitle().equals("EMI Calculator")){
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");

//Assert used instead of if and else or to validate any basic
        Assert.assertEquals(driver.getTitle(),"EMI Calculator","Title not matched");

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


        if(emi.equals("43041.28")){
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
        
        Assert.assertEquals(emi,"43041.28","EMI Not matched");
        System.out.println(emi);
        driver.quit();
        
        //Assert.asserAll(); will provide all the assert results(mismatches) in this code.
        
        //To exit from the running thread even after the execution of the code
        System.exit(0);




    }
}

