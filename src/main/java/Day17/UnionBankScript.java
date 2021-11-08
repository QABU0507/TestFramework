package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class UnionBankScript {
    public static void main(String[] args) throws IOException {
        /*
       // we can access the properties file by property class
        Properties prop = new Properties(); //object created for properties class
      // using a file directory can introduce an exception if filepath is changed so, we have to fetch the current directory inorder to avoid it
        System.out.println(System.getProperty("user.dir"));

       // Convert Config.properties to byteStream
        FileInputStream Fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties"); // this line place the current directory and concatnate the remaining path
        prop.load(Fin);

        /*String url = prop.getProperty("QA");
        System.out.println(url);

        // usage of below line-- we don't have to change the env in the code. instead we can change it in config files and everytime we can access the updated url
        String url = prop.getProperty(prop.getProperty("currentEnv"));
        System.out.println(url);*/

        //-----------------------------------------
        //Launch the browser and application

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        //driver.get(url);

        driver.get(PropertiesFiles.getConfigValue(PropertiesFiles.getConfigValue("currentEnv")));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );

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
