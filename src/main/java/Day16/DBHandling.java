package Day16;

import java.sql.*;

public class DBHandling {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //To interact with MySql

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_store","devuser","Aishwarya@98");
        //System.out.println(Con);
        if(Con!=null){
            System.out.println("Connection is not null..Connection established");
        }
        else{
            System.out.println("Connection is null");
        }

        //Read table from DB in mySql

        Statement st =Con.createStatement();
        ResultSet rSet = st.executeQuery("select * from coffee_store.customers");

        ResultSetMetaData metaData = rSet.getMetaData();
        int columnCount = metaData.getColumnCount();


        while(rSet.next())
        {
            for(int iCol=1;iCol<=columnCount;iCol++){

                String columnName = metaData.getColumnName(iCol);
                String rowValue = rSet.getString(iCol);
                System.out.println(columnName+"  "+rowValue);
            }

            //Hard codeded the column labels
           /* System.out.print(rSet.getString("id"));
            System.out.println(" "+rSet.getString("First_name"));*/
        }

        Con.close();

    }
}
