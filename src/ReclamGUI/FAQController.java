/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReclamGUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FAQController implements Initializable {

    @FXML
    private Button BackFAQ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackFAQ(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Page1.fxml"));
            try {
            Parent root= loader.load();  
            Page1Controller atc = loader.getController ();
            BackFAQ.getScene().setRoot(root);
            
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            
        }
    }
    
}
