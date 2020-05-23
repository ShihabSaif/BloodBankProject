/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_one;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author shihab
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox vbox;
    @FXML
    private Button btnAdmin;
    @FXML
    private Button btnDonor;
    @FXML
    private Button btnReceiver;
    @FXML
    private Button btnInventory;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void admin(MouseEvent event) {
        loadPage("admin");
        //borderPane.setCenter(anchorPane);
    }

    @FXML
    private void donor(MouseEvent event) {
        loadPage("donor");
    }

    @FXML
    private void receiver(MouseEvent event) {
        loadPage("receiver");
    }

    @FXML
    private void inventory(MouseEvent event) {
        loadPage("inventory");
    }
    
    private void loadPage(String page)
    {
        Parent root = null;   
        try {         
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderPane.setCenter(root);
    }
    
}
