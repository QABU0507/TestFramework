package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptInheritance extends ScriptCommonMethods {
   //child class 1

   String extractEMI(String amount, String interest, String tenure) {
       // enter loan amount
       driver.findElement(By.id("loanamount")).sendKeys(amount);  //finds the loan amount field and main provides the value for amount

       // enter interest rate in %
       driver.findElement(By.name("rate")).sendKeys(interest); //Finds the rate in % and  main provides the value for interest

       // enter period in months
       driver.findElement(By.name("pmonths")).sendKeys(tenure); //Finds tenure and main provides the value for tenure

       //Click calculate button
       driver.findElement(By.id("Button1")).click(); // Clicks the calculate button

       //Extract calcualted emi
       String emi = driver.findElement(By.id("EMI")).getAttribute("value");
       return emi;
   }


}
