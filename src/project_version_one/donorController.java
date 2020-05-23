/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_one;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author shihab
 */
public class donorController {
    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button txtSignup;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtBloodGroup;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button txtLoginHere;
    
    donorQuery query;
    
    public void initialize(URL url, ResourceBundle rb)
    {
        query = new donorQuery();
    }
    
    public void insertDonor(ActionEvent event)
    {
        donorModel model = new donorModel(0, txtName.getText(), txtBloodGroup.getText(), txtUserName.getText(),txtPassword.getText(),txtEmail.getText());
        int count = query.addDonor(model);
        System.out.println(count);
    }

}
