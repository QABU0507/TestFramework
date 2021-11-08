package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnIdentifiers {
    public static void main(String[] args) {

        //Launch the browser and bing search engine
        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.bing.com/");                                          //bing link

        //Locate the search bar
        driver.findElement(By.className("sb_form_q")).sendKeys("Seleinum"); // finds the search bar pass "selenium as value

        //identify search icon and click
        driver.findElement(By.id("search_icon")).submit();  //submit() method used because the search icon belongs to type=submit
        //It belongs to Form. so click() does not work.

    }
}
