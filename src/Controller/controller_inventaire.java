package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;
import java.net.URL;
import java.sql.*;
//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_inventaire implements Initializable, ControlledScreen {

    ScreensController myController;
    //Stage Stage;
    //Stage.sizeToScene();
    //Stage.centerOnScreen();

    public DAO.DAO db;
    private Connection cnx;
    List list = new List();
    ObservableList<result> data = FXCollections.observableArrayList();


    @FXML
    private TableView<result> inventory;

    @FXML
    private TableColumn<result, Integer> column_id;

    @FXML
    private TableColumn<result, Integer>  column_reference;

    @FXML
    private TableColumn<result, String>  column_libelle;

    @FXML
    private TableColumn<result, String>  column_categorie;

    @FXML
    private TableColumn<result, Double>  column_prix;

    @FXML
    private TableColumn<result, Date>  column_exp;

    @FXML
    private TableColumn<result, Integer>  column_qtestock;

    @FXML
    private TableColumn<result, Integer>  column_qtemin;


    @FXML
    private TableColumn<result, Integer>  column_etagere;

    @FXML
    private JFXButton btn_modifier;

    @FXML
    private JFXButton btn_delete;

    @FXML
    private JFXButton btn_goback;



    @Override
    public void initialize(URL url, ResourceBundle rb) {

        column_id.setCellValueFactory(
                new PropertyValueFactory<>("id"));
        column_reference.setCellValueFactory(
                new PropertyValueFactory<>("reference"));
        column_libelle.setCellValueFactory(
                new PropertyValueFactory<>("libelle"));
        column_categorie.setCellValueFactory(
                new PropertyValueFactory<>("categorie"));
        column_prix.setCellValueFactory(
                new PropertyValueFactory<>("prix"));
        column_exp.setCellValueFactory(
                new PropertyValueFactory<>("date_exp"));
        column_qtestock.setCellValueFactory(
                new PropertyValueFactory<>("qte_en_stock"));
        column_qtemin.setCellValueFactory(
                new PropertyValueFactory<>("qte_min"));
        column_etagere.setCellValueFactory(
                new PropertyValueFactory<>("numero_etagere"));


      //  ArrayList<String> list = new ArrayList<>();  // didn't Work!!


       // db.connect();

        try {

            Class.forName("com.mysql.jdbc.Driver") ;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock", "root", "") ;
            Statement stmt = conn.createStatement() ;
            String query = "SELECT Medicaments.idMedicaments, Medicaments.reference, Medicaments.libelle, Inventaire.categorie, Medicaments.prix, Medicaments.date_exp, Medicaments.qte_en_stock, Medicaments.qte_min, Inventaire.numero_etagere  FROM  `Medicaments` JOIN Inventaire ON Medicaments.Inventaire_idInventaire = Inventaire.idInventaire";
            ResultSet rs = stmt.executeQuery(query) ;


            while(rs.next())
            {

               // String id = String.valueOf(rs.getInt("Medicaments.idMedicaments"));
               // String ref = String.valueOf( rs.getInt("Medicaments.reference"));
              //  String lib = rs.getString("Medicaments.libelle");
                //String categorie = rs.getString("Inventaire.categorie");
               // String prix = String.valueOf(rs.getDouble("Medicaments.prix"));
              //  String date = String.valueOf(rs.getDate("Medicaments.date_exp"));
               // String qte1  = String.valueOf(rs.getInt("Medicaments.qte_en_stock"));
               // String qte2 = String.valueOf( rs.getInt("Medicaments.qte_min"));
               // String num = String.valueOf(rs.getInt("Inventaire.numero_etagere"));

               // String[] str = {id,ref,lib,categorie,prix,date,qte1,qte2,num};

                //ArrayList<String> inventoryList1 = new ArrayList<String>(Arrays.asList(str)); DIDN'T WORK !!!!

                //Another try of something that did not work!! I hate code!I mean My Paper is for tomorrow TOMORROW

                result row = new result();
               int a = rs.getInt("Medicaments.idMedicaments");
                int b = rs.getInt("Medicaments.reference");
                String c = rs.getString("Medicaments.libelle");
                String d = rs.getString("Inventaire.categorie");
                Double e = rs.getDouble("Medicaments.prix");
                Date f=rs.getDate("Medicaments.date_exp");
                int g = rs.getInt("Medicaments.qte_en_stock");
                int h= rs.getInt("Medicaments.qte_min");
                int z = rs.getInt("Inventaire.numero_etagere");

                row.setId(a);
                row.setReference(b);
                row.setLibelle(c);
                row.setCategorie(d);
                row.setPrix(e);
                row.setDate_exp(f);
                row.setQte_en_stock(g);
                row.setQte_min(h);
                row.setNumero_etagere(z);


                data.add(row);


            }
            conn.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }



  inventory.setItems(data);



        // TODO
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }



    @FXML
    void GoBackHome(ActionEvent event) {

        myController.setScreen("Acceuil");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void modifier(ActionEvent event) {
        myController.setScreen("Edit");
    }

}

