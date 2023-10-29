
package com.tech.blog.helper;
import java.sql.*;

public class ConnectionProvider {
    private static Connection con;
    
    public static Connection getConnection()
    {
        try 
        {
            if (con==null) {
                //driver loading
               Class.forName("com.mysql.cj.jdbc.Driver");
               // creating connection
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","Rtech.2000");
            }

            
        } catch (ClassNotFoundException | SQLException e) {
        }   
        return con;
    }
}
