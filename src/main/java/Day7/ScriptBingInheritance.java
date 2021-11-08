package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptBingInheritance extends ScriptCommonMethods{

    //Child class 2

    void Search(String word) {
        driver.findElement(By.className("sb_form_q")).sendKeys(word); // finds the search bar pass "selenium as value

        //identify search icon and click
        driver.findElement(By.id("search_icon")).submit();  //submit() method used because the search icon belongs to type=submit
        //It belongs to Form. so click() does not work.
    }


}
