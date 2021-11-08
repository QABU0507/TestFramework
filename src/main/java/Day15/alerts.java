package Day15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class alerts {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.bookshopofindia.com/booknotfound.asp");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //click submit button
        driver.findElement(By.name("btnSubmit")).click();

        Alert Al = driver.switchTo().alert();
        System.out.println(Al.getText()); // will print the message in the popup
        Al.accept();

        driver.findElement(By.name("Name")).sendKeys("Ashley");
        driver.findElement(By.name("btnSubmit")).click();
        System.out.println(Al.getText());
        Al.accept();
    }

}
