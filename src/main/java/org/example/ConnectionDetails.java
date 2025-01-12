package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails  {
    public static String  LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public static String  URL="jdbc:mysql://localhost:3306/truckmgt";
    public static String  PASSWORD="Mysql@25";
    public static String  USERNAME="root";


    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }

}

