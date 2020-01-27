package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_commande implements Initializable, ControlledScreen {


    ScreensController myController;


    @FXML
    private ChoiceBox<?> choiceBox_fournisseur;

    @FXML
    private JFXTreeTableView<?> table_Fournisseur;

    @FXML
    private TableView<?> table_alerte;

    @FXML
    private TableColumn<?, ?> reference;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableColumn<?, ?> qte_restante;

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnValider;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    void ListerFournisseur(MouseEvent event) {

    }

    @FXML
    void gotoHome(ActionEvent event) {
        myController.setScreen("Acceuil");
    }

    @FXML
    void valider(ActionEvent event) {

    }

}
