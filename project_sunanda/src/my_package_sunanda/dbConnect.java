/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package_sunanda;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sunanda
 */
public class dbConnect {
    public static Connection connect(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
              conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/my_new_database_sunanda","root","");
            
        }catch(ClassNotFoundException | SQLException e){
           System.out.println(e);
        }
        
        
    
        
        return conn;
        
    }
    
    
}
