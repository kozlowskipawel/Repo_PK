/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notatnik_zadan;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class DB_Connection {
  
    static private Connection  connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zadania", "root", "");
        }
        return connection;
    }  
}
