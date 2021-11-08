package Day20_Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectBase {

    public static final int DEFAULT_TIMEOUT=20;   // if u declare wait time on the top of the class. it will be easy to change the wait time.

    WebDriver driver;

    public PageObjectBase(WebDriver driver){
        this.driver=driver;
    }

    public void clickelement(WebElement element,int timeout){   //method to click an element
        getwait(timeout).until(ExpectedConditions.elementToBeClickable(element)).click(); //using explicit wait with customizable time
        //element.click();
    }

    public void clickelement(WebElement element){   //method to click an element
        clickelement(element,DEFAULT_TIMEOUT);
        //getwait().until(ExpectedConditions.elementToBeClickable(element)).click(); //using explict wait
        //element.click();
    }

    public void typetext(WebElement element,String text){  //method to provide text in the element
        getwait().until(ExpectedConditions.elementToBeClickable(element)).clear();
        element.sendKeys(text);
        //element.sendKeys(text);
    }

    public boolean iselementDisplayed(WebElement element){  //method to check element displayed or not

        //return element.isDisplayed();
        try {
            return getwait().until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();
        }
        catch (Exception e){
           return false;
        }
    }

    public WebDriverWait getwait(){

       return getwait(DEFAULT_TIMEOUT);
        //return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    public WebDriverWait getwait(int timeout){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}
