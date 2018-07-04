/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vasudha
 */
public class connect {
    public static Connection makeconnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarysystem","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    }
}
