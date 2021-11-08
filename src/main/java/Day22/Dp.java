package Day22;

import Day14.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;



public class Dp {

    /* we can use data provider using
    1. Object[][]- object array
    2.Iterator<object[]> // when there is more test data , we can use iterator object
     */

    @DataProvider(name = "LoginData")
    public static Object[][] dataprovider() {
         /*
        Object[][] objects= new Object[3][2];
        objects[0][0] = "Aishw";
        objects[0][1] = "ABC1234";
        objects[1][0] = "Sri";
        objects[1][1] = "ASR927";
        objects[2][0] = "Home";
        objects[2][1] = "QII88";
        */
        return new Object[][]{
                {"Aish", "ABC1234"}, //each testdata- 2 values: Aish & ABC1234-- based on the values, there will be parameters in method
                {"Sri", "ASR927"},
                {"Home", "QII88"}
        };
    }

    @DataProvider(name = "LoginDataExcel")
    public static Iterator<Object[]> dataproviderExcel() throws IOException {

        //Read data from Excel
        String Sheetname = "Sheet1";
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData.xlsx");
        int rowCount = excelRW.getRowCount(Sheetname);
        int columnCount = excelRW.getColumnCount(Sheetname);

        ArrayList<Object[]> list = new ArrayList<>(); // Single array list will be created.
        // if we give this inside the for loop, for every row, array list will be created.

        //Create a index in list
        for (int irow = 1; irow <= rowCount; irow++) {

            Object[] obj = new Object[1];  // inside the array list for every row we need a object array
            Map<String, String> Map = new HashMap<>();  //inside the object array we need map to store the data
            //we no need to providde the above line in icol for loop. if we give, for every column we will have a map created
            for (int icol = 0; icol < columnCount; icol++) {

                String Key = excelRW.readCellValue(Sheetname, 0, icol);
                String Value = excelRW.readCellValue(Sheetname, irow, icol);

                //in Map, store the  value from the row as key value pair
                Map.put(Key, Value);

            }

            obj[0] = Map;   //In the location- add the object array
            list.add(obj);
        }

        //In object array, create a Map

        //in Map, store the  value from the row as key value pair

        //repeat for each rows

        return list.iterator();

    }

    @DataProvider(name = "LoginDataExcel1")
    public static Iterator<Object[]> dataproviderExcel1() throws IOException {

       return Arrays.asList(new Object[]{
                new HashMap<String, String>(){{
                    put("Name", "Aishwarya");
                            put("city", "CA");
                                    put("State ", "NewYork");

                }}}, new Object[]{
                new HashMap<String, String>(){{
                {
                        put("Name", "Ram");
                        put("city", "SL");
                        put("State ", "Seattle");
                }
        } }}).iterator();

    }
}


