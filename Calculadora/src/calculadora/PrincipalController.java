/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04045487255
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtresultado;
    @FXML
    private  Button btnsoma, btnsubtrai, btndividi, btnmultiplica;
    @FXML
    private void somar(ActionEvent event) {
       Double num1 = Double.parseDouble(txtnum1.getText());
       Double num2 = Double.parseDouble(txtnum2.getText());
       Double result;
  
       result = (num1 + num2);
       txtresultado.setText(result.toString());
    }
    @FXML
    private void subtrair(ActionEvent ae) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum2.getText());
        Double result;
        result = (num1 - num2);
        txtresultado.setText(result.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}
