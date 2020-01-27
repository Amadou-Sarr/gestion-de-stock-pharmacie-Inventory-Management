package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_edit implements Initializable, ControlledScreen {

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
    private JFXTextField txt_id;

    @FXML
    private JFXButton btn_goBack;

    @FXML
    private JFXButton btn_valider;

    @FXML
    private JFXButton btn_annuler;

    @FXML
    private JFXButton btn_inventory;

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
    void goto_inventory(ActionEvent event) {
        myController.setScreen("Inventaire");
    }

    @FXML
    void valider(ActionEvent event) {

        int ref = Integer.valueOf(txt_reference.getText());
        int id = Integer.valueOf(txt_id.getText());
        int qtestock = Integer.valueOf(txt_qteStock.getText());
        int qtemin = Integer.valueOf(txt_qteMin.getText());
        int num_et = Integer.valueOf(txt_etagere.getText());

        if(ref== (int) ref||id == (int)id || qtestock == (int) qtestock || qtemin == (int) qtemin || num_et == (int) num_et){

        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("[LGS]Logiciel de Gestion de Stock");
            alert.setContentText("Veuillez Entrer des entiers");
            alert.showAndWait();
        }




        String cat = txt_categorie.getText();
        String lib = txt_libelle.getText();
        String famille = txt_famille.getText();
        //Date date = Date.valueOf(txt_dateExp.getText());

        double prix = Double.valueOf(txt_prix.getText());
        if(prix == (double) prix){

        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("[LGS]Logiciel de Gestion de Stock");
            alert.setContentText("Veuillez Entrer un Decimal EX : 12.34 ");
            alert.showAndWait();
        }


       // if(date == (Date) date){

        //}
       // else{
         //   Alert alert = new Alert(Alert.AlertType.WARNING);
           // alert.setHeaderText("[LGS]Logiciel de Gestion de Stock");
           // alert.setContentText("Veuillez Entrer une date valide au format : annee-mois-jour");
           // alert.showAndWait();

        //}



        try {


            Class.forName("com.mysql.jdbc.Driver") ;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock", "root", "") ;
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO Medicaments (reference,libelle,prix,qte_en_stock,qte_min,date_exp,Inventaire_idInventaire,Livraison_idLivraison) VALUES (" +ref+ ",'" + lib + "'," + prix + "," + qtestock + "," + qtemin + "," + prix + "," + txt_dateExp + "," + 1 +"," + 1 +" ) WHERE id ="+id);
            try {
                stmt.executeUpdate("INSERT INTO Inventaire (categorie,famille,numero_etagere,Pharmacien_idPharmacien,Pharmacien_Personnel_idPersonnel) VALUES('" + cat + "','" + famille + "'," + num_et + "," + 1 +"," + 1 +") WHERE id="+1+"");

            }catch (Exception e){
                e.printStackTrace();
            }

            conn.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("[LGS]Logiciel de Gestion de Stock");
            alert.setContentText("La base a été mise a jour");
            alert.showAndWait();

        }catch (Exception e){
            e.printStackTrace();

        }


    }
}
