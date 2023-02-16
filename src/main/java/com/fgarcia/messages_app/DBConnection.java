/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fgarcia.messages_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felix
 */
public class DBConnection {
    
    public Connection get_connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root","");
            if(connection != null){
                System.out.println("Connection successful");
            }
        }
        catch (SQLException e) {
            System.out.println("Connection error: " + e);
        }
        return connection;        
    }
    
}
