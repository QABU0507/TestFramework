package Day14;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelRW {
    //use methods to read and write the excel
    XSSFWorkbook wb;
    FileInputStream Fin;
    //intialize the excel--1.seperate method 2. using constructor

 /*   public void initexcel(String XLPath) throws IOException {

        Fin = new FileInputStream(XLPath);
        //Connect to the sheet
        wb = new XSSFWorkbook(Fin);
    }
*/

    public ExcelRW(String XLPath) throws IOException {

        Fin = new FileInputStream(XLPath);
        wb = new XSSFWorkbook(Fin);
    }

    //create sheetobject to get sheetname
    public XSSFSheet getSheet(String sheetName)   // we can create n number of sheets with this method
    {
        XSSFSheet Sheet1 = wb.getSheet(sheetName);
        return Sheet1;
    }

    //row Count
    public int getRowCount(String sheetName){
        //XSSFSheet Sheet1 = wb.getSheet(sheetName);
        //return sheet1.getLastRowNum();
        return getSheet(sheetName).getLastRowNum();
    }

   //column Count- we can get column count only by mentioning the row
    public int getColumnCount(String sheetName)
    {
        return getSheet(sheetName).getRow(1).getLastCellNum();
    }


    //read operation
    public String readCellValue(String sheetName, int row,int column ) {
            XSSFSheet Sheet1 = wb.getSheet(sheetName);
            XSSFCell cell = Sheet1.getRow(row).getCell(column);
            //Read the excel
            String CellValue = "";
            if (cell.getCellType() == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue()); // String.valueofCell converts numeric value into string
            } else if (cell.getCellType() == CellType.BLANK) {
                CellValue = "";

            }
           return CellValue;
        }


    //write operation
    public void writeExcel(String sheetName, int row,int column, String result) {
        XSSFSheet Sheet1 = wb.getSheet(sheetName);
        Sheet1.getRow(row).createCell(column).setCellValue(result);
    }

    //Save and close
    public void saveAndCloseExcel(String XLPath)throws IOException{
        //save the excel
        FileOutputStream Fout = new FileOutputStream(XLPath);
        wb.write(Fout); // write it in excel sheet1
        Fin.close(); //closes the input and output stream
        Fout.close();
    }
}
