package Day16;

import java.sql.*;

public class DBHandling_MyProExcep {
    public static void main(String[] args) throws Exception {
        Connection Con = null;
        //To interact with MySql
        Class.forName("com.mysql.cj.jdbc.Driver");

        //DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_store", "devuser", "Aishwarya@98");

        //To introduce a exception.. im manupulating the driver link
        try {
            DriverManager.getConnection("jdbc:mysql123://localhost:3306/coffee_store", "devuser", "Aishwarya@98");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        if (Con != null) {
            System.out.println("Connection is not null..Connection established");
        } else {
            throw new myProjectException("Connection cannot be established!! Con value is NULL"); // we are using custom exeption using constructor
        }

        //Read table from DB in mySql

        Statement st = Con.createStatement();
        ResultSet rSet = st.executeQuery("select * from coffee_store.customers");

        ResultSetMetaData metaData = rSet.getMetaData();
        int columnCount = metaData.getColumnCount();


        while (rSet.next())  //executes till the last column with the value.
        {
            for (int iCol = 1; iCol <= columnCount; iCol++) {

                String columnName = metaData.getColumnName(iCol);
                String rowValue = rSet.getString(iCol);
                System.out.println(columnName + "  " + rowValue);
            }

            //Hard codeded the column labels
           /* System.out.print(rSet.getString("id"));
            System.out.println(" "+rSet.getString("First_name"));*/
        }
        Con.close();
    }
}
