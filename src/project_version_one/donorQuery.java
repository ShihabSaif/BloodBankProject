/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_one;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shihab
 */
public class donorQuery {
    Connection conn;
    public donorQuery() {
        try {
            conn = Project_DBConnector.connect();
        } catch (SQLException ex) {
            Logger.getLogger(donorQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int addDonor(donorModel model)
    {
        String query = "INSERT into 'donor' ('donorName','donorBloodGroup','donorUserName','donorPassword','donorEmail') VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, model.getDonorName());
            ps.setString(2, model.getDonorBloodGroup());
            ps.setString(3, model.getDonorUserName());
            ps.setString(4, model.getDonorPassword());
            ps.setString(5, model.getDonorEmail());
            
            int result = ps.executeUpdate();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(donorQuery.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    
}
