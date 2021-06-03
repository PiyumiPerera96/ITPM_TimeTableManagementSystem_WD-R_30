/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
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