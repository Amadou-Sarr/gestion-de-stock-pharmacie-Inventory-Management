package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_acceuil implements Initializable, ControlledScreen {

    ScreensController myController;
    //Stage Stage;
    //Stage.sizeToScene();
    //Stage.centerOnScreen();




    @FXML
    private JFXButton btn_inventaire;


    @FXML
    private JFXButton btn_approv;

    @FXML
    private JFXButton btn_vendre;

    @FXML
    private JFXButton btn_commande;
    @FXML
    private JFXButton btn_stat;


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
    void goto_commande(ActionEvent event) {
        myController.setScreen("Commande");
    }

    @FXML
    void goto_inventaire(ActionEvent event) {

        myController.setScreen("Inventaire");
    }

    @FXML
    void goto_stat(MouseEvent event) {

    }

    @FXML
    void goto_vente(ActionEvent event) {
        myController.setScreen("Vente");
    }

    @FXML
    void goto_statistique(ActionEvent event) {
        myController.setScreen("Statistiques");
    }

}
