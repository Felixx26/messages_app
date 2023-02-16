/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fgarcia.messages_app;

import java.sql.Connection;

/**
 *
 * @author felix
 */
public class Messages_app {

    public static void main(String[] args) {
        DBConnection connection = new DBConnection();
        try (Connection conn = connection.get_connection()){
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
