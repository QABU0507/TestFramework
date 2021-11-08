package Day13;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class ExcelReadandWrite {
    public static void main(String[] args) throws IOException, InterruptedException {
        //read and write in excel sheet

        //open the Excel
        FileInputStream Fin = new FileInputStream("C:\\Setrainingfiles\\ExcelData.xlsx");

        //Connect to the sheet
        XSSFWorkbook wb = new XSSFWorkbook(Fin);
        XSSFSheet Sheet1 = wb.getSheet("Sheet1");

        //Collect the row count in excel
        int rowCount = Sheet1.getLastRowNum();
        System.out.println(rowCount);

        //Launch the browser
        System.setProperty("webdriver.gecko.driver", "C:\\Setrainingfiles\\Drivers\\geckodriver.exe"); //path of the gecko driver
        FirefoxDriver driver = new FirefoxDriver();                                   //object to launch the browser
        driver.get("https://www.bing.com/");                                          //bing link
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // used instead of thread.sleep

        //Logic- read data from excel, apply it in app , get the data and write it in excel
        for(int iRow=1;iRow<rowCount;iRow++) {

            XSSFCell cell = Sheet1.getRow(iRow).getCell(0);
            //Read the excel
            String CellValue = "";
            if (cell.getCellType() == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue()); // String.valueofCell converts numeric value into string
            } else if (cell.getCellType() == CellType.BLANK) {
                CellValue = "";

            }

            System.out.println(CellValue);


            //Locate the search bar
            driver.findElement(By.className("sb_form_q")).sendKeys(CellValue); // finds the search bar and passess the cellValue

            //identify search icon and click
            driver.findElement(By.id("search_icon")).submit();
            //Thread.sleep(6000);
            String result = driver.findElement(By.className("sb_count")).getText();


            //write in the excel
            Sheet1.getRow(iRow).createCell(1).setCellValue(result); //createCell will create the cell in the excel

            // To hit back button in the rowser
            driver.navigate().to("https://www.bing.com/");

        }

            //save the excel
            FileOutputStream Fout = new FileOutputStream("C:\\Setrainingfiles\\ExcelData.xlsx");
            wb.write(Fout); // write it in excel sheet1
            Fin.close(); //closes the input and output stream
            Fout.close();

    }
}
