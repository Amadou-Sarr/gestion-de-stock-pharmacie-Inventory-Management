package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 28/07/2017.
 */
public class controller_acceuil_emp implements Initializable, ControlledScreen {

    ScreensController myController;

    @FXML
    private JFXButton btn_inventaire;

    @FXML
    private JFXButton btn_approv;

    @FXML
    private JFXButton btn_vendre;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO

    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    @FXML
    void goto_approvisionnement(ActionEvent event) {

        myController.setScreen("Approv");
    }

    @FXML
    void goto_inventaire(ActionEvent event) {

        myController.setScreen("Inventaire");
    }

    @FXML
    void goto_vente(ActionEvent event) {
        myController.setScreen("Vente");

    }


}
