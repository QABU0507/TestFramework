package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class useExcelRW {
    public static void main(String[] args) throws IOException {

        ExcelRW erw = new ExcelRW("C:\\Setrainingfiles\\ExcelData.xlsx");
       // erw.initexcel("C:\\Setrainingfiles\\ExcelData.xlsx"); this calls the method but we can do this with help of constructor as above

       // call rowcount method
        int rowCount = erw.getRowCount("Sheet1");

        //Launch the browser
        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.bing.com/");                                          //bing link
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // used instead of thread.sleep- implicit wait will hold the code for some time for page to load

        //call excel read cell method
        for(int iRow=1;iRow<rowCount;iRow++) {

            String CellValue = erw.readCellValue("Sheet1",iRow,0);
            driver.findElement(By.className("sb_form_q")).sendKeys(CellValue); // finds the search bar and passess the cellValue
            //identify search icon and click
            driver.findElement(By.id("search_icon")).submit();
            //Thread.sleep(6000);
            String result = driver.findElement(By.className("sb_count")).getText();

            // call excel write method
            erw.writeExcel("Sheet1",iRow,1,result);

            driver.navigate().to("https://www.bing.com/");
        }

        //Call save and close the method
        erw.saveAndCloseExcel("C:\\Setrainingfiles\\ExcelData.xlsx");
    }
}
