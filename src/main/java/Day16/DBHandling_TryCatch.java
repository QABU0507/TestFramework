package Day16;

import java.sql.*;

public class DBHandling_TryCatch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection Con = null;
        try {
            //To interact with MySql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_store", "devuser", "Aishwarya@98");

            //To introduce a exception.. im manupulating the driver link
            DriverManager.getConnection("jdbc:mysql123://localhost:3306/coffee_store", "devuser", "Aishwarya@98");

            //System.out.println(Con);
            if (Con != null) {
                System.out.println("Connection is not null..Connection established");
            } else {
                System.out.println("Connection is null");
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
        } catch (Exception e) {
            System.out.println("The exception is "+e.toString());
            e.printStackTrace();
        }
        finally {
           // Connection cannot be closed if its already closed or null-- if it happens in try block we have to handle the exception before esecution gthe con.close() line
           // instead of handling the exception.. we can write a if condition
            if(Con!=null && !Con.isClosed()) {
                System.out.println("Connection is not closed");
                Con.close();
                System.out.println("Connection closed");
            }
        }

    }
}
