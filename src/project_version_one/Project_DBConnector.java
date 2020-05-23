/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shihab
 */
public class Project_DBConnector {
    public static Connection connect() throws SQLException
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connect = DriverManager.getConnection("jdbc:sqlite:E:\\SQLiteDatabaseBrowserPortable\\Data\\projectDB.db");
            return connect;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Project_DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }      
    }
}
