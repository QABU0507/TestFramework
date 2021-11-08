package Day16;

import java.sql.*;

public class DBHandling_DM {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //To interact with MySql

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_store", "devuser", "Aishwarya@98");
        //System.out.println(Con);
        if (Con != null) {
            System.out.println("Connection is not null..Connection established");
        } else {
            System.out.println("Connection is null");
        }

        //Read table from DB in mySql

        Statement st = Con.createStatement();
        //update the entry in the table
        st.executeUpdate("update coffee_store set First_name = 'Sara' where First_name = 'Sarah'");
    }

    }
