package pl.sda.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author marek swietlik
 */
public class RootController implements Initializable {

    @FXML
    private Button search;
    @FXML
    private TextField city;
    @FXML
    private Label TemperatureIn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        city.setText("Test123");
        TemperatureIn.setText("21");
    }
    public void setCity(){
        System.out.println("KLIK KLIK KLIK");
    }
}
