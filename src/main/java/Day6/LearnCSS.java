package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCSS {
    public static void main(String[] args) {
        //use an union bank emi calculator--Using only CSS

        //Launch the browser and application

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx"); //application link

        // enter loan amount
        driver.findElement(By.cssSelector(" input[id='loanamount']")).sendKeys("3000000");  //finds the loan amount field and provides the value as 30 lakhs

        // enter interest rate in %
        driver.findElement(By.cssSelector(" input[name='rate'][type='text']")).sendKeys("12"); //Finds the rate in % and provides the value 12

        // enter period in months
        driver.findElement(By.cssSelector(" input[name='pmonths']")).sendKeys("120"); //Finds tenure and provides the value 120

        //Click calculate button
        driver.findElement(By.cssSelector(" input[value='Calculate']")).click(); // Clicks the calculate button

        //Extract calcualted emi
        String emi = driver.findElement(By.cssSelector(" input[name='EMI'],[id='EMI']")).getAttribute("value");
        System.out.println(emi);

        //To exit from the running thread even after the execution of the code
        System.exit(0);
    }
}
