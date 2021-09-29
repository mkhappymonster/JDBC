/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class NewClass {
    private final  String user="root";
    private final  String pass ="";
    private final  String host ="jdbc:mysql://localhost/mk";
    
    
    //public Connection c;
    public Connection connect() throws SQLException{
    
    return DriverManager.getConnection(host,user,pass);
    
    
    
    
    }
    
}
