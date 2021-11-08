package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class readDropDownValues {
    public static void main(String[] args) {

        //Launch the browser
        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.amazon.in/");                                          //bing link
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // used instead of thread.sleep- implicit wait will hold the code for some time for page to load

        List<WebElement> ele = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));

        Iterator<WebElement> iter = ele.iterator();
        while (iter.hasNext()){
            WebElement element = iter.next();
            System.out.println(element.getText());
        }


    }
}
