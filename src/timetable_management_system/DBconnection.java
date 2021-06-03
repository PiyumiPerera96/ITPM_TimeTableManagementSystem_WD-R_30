
package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
   
    
    
    public Connection getDB() throws SQLException{
    Statement stmt = null;
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
    stmt = con.createStatement();
      
        String sql = "CREATE DATABASE IF NOT EXISTS itpmnew";
        stmt.executeUpdate(sql);
        
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
        return con;
    }
    
    
}