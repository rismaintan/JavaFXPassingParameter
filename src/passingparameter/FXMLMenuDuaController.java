/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingparameter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rismaintanw
 */
public class FXMLMenuDuaController implements Initializable {

    @FXML
    private Label label;
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
    public void setText(String nama, String absen, String kelas)
    {
    this.nama.setText(nama);
    this.absen.setText(absen);
    this.kelas.setText(kelas);
    }
    
}
