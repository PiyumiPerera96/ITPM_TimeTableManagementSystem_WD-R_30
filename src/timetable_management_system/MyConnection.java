
package timetable_management_system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
     public static Connection getConnection() {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        
        return con;
    }
    
}
