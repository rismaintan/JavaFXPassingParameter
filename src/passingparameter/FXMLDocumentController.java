/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingparameter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rismaintanw
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button proses;
    @FXML
    private TextField nama;
    @FXML
    private TextField kelas;
    @FXML
    private TextField absen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OK(ActionEvent event) {
        String nama_Text= nama.getText();
        String absen_Text=absen.getText();
        String kelas_Text=kelas.getText();
        
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("FXMLMenuDua.fxml"));
        try {
            Loader.load();
        
        }catch (IOException ex) {
        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        DisplayTextController display = Loader.getController();
        display.setText(nama_Text, kelas_Text, absen_Text);
        
        Parent p =Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();
    }
    
}
