package Day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptCommonMethods {

    //Parent class

    FirefoxDriver driver; // providing it as instance variable-because we user driver in both launch aoo method and extract emi method
    //if declared only in launchapp method, extractemi method will not identify the driver method.

    void launchApp(String url){
        //Launch the browser and application

        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get(url); //url in main will be passed here
    }
    void tearDown(){
        driver.quit();
        //To exit from the running thread even after the execution of the code
        //System.exit(0);

    }
}
