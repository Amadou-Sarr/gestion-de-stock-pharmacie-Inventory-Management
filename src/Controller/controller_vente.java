package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import sun.util.locale.provider.DateFormatSymbolsProviderImpl;

import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_vente implements Initializable, ControlledScreen {

    ScreensController myController;


    @FXML
    private JFXTextField txt_ref;

    @FXML
    private JFXTextField txt_lib;

    @FXML
    private JFXTextField txt_nombreEx;

    @FXML
    private JFXButton btn_ajouter;

    @FXML
    private JFXButton btn_rechercher;

    @FXML
    private JFXListView<?> list_recherche;

    @FXML
    private JFXTextField txt_recherche;

    @FXML
    private JFXButton btn_home;

    @FXML
    private JFXButton btn_Valider;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }


    @FXML
    void ajouter_element(ActionEvent event) {

    }

    @FXML
    void gotoHome(ActionEvent event) {
        myController.setScreen("Acceuil");
    }

    @FXML
    void rechercher(ActionEvent event) {

    }

    @FXML
    void valider_vente(ActionEvent event) {
        Integer decrementer = Integer.valueOf(txt_nombreEx.getText());
        Integer ref = Integer.valueOf(txt_ref.getText());
        String lib =txt_lib.getText();

        LocalDate date = LocalDate.now();
        int stock = new Integer(0);
        int min = new Integer(0);
        double total = new Double(0);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock", "root", "");
            Statement stmt = conn.createStatement();
            String query = "SELECT qte_en_stock, qte_min, prix  FROM  `Medicaments` WHERE reference = " + ref + " ";
            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()) {
                stock = rs.getInt("qte_en_stock");
                min = rs.getInt("qte_min");
                total = rs.getDouble("prix");
                total = total * decrementer ;

            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        stock = stock - decrementer;
        if (stock <= min) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("[LGS]Logiciel de Gestion de Stock");
            alert.setContentText("Alerte!!! Nous vous recomendons de Commander ce médicament : " + ref + " Qte minimale atteinte ");
            alert.showAndWait();
        }

        try {


            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock", "root", "");
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO Vente (date,montant,nombreMedicaments) VALUES('" + date + "','" + total + "','" + decrementer + "'");

        } catch (Exception e) {
            e.printStackTrace();


        }

    }
}