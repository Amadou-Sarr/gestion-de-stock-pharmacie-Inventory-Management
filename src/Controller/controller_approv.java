package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_approv implements Initializable, ControlledScreen{

    ScreensController myController;

    @FXML
    private JFXTextField txt_reference;

    @FXML
    private JFXTextField txt_libelle;

    @FXML
    private JFXTextField txt_prix;

    @FXML
    private JFXTextField txt_qteStock;

    @FXML
    private JFXTextField txt_qteMin;

    @FXML
    private JFXTextField txt_dateExp;

    @FXML
    private JFXTextField txt_categorie;

    @FXML
    private JFXTextField txt_famille;

    @FXML
    private JFXTextField txt_etagere;

    @FXML
    private JFXTextField txt_codeFournisseur;

    @FXML
    private JFXTextField txt_dateLivraison;

    @FXML
    private JFXTextField txt_delais;

    @FXML
    private JFXTextField txt_nomFournisseur;

    @FXML
    private JFXButton btn_goBack;

    @FXML
    private JFXButton btn_valider;

    @FXML
    private JFXButton btn_annuler;



    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO

    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }



    @FXML
    void gotoHome(ActionEvent event) {

        myController.setScreen("Acceuil");

    }

    @FXML
    void valider(ActionEvent event) {

    }
}
