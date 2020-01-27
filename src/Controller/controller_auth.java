package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class controller_auth implements Initializable, ControlledScreen {

    ScreensController myController;

    private Connection cxn;
    public DAO.DAO Db;


    @FXML
    private JFXPasswordField txt_password;

    @FXML
    private JFXTextField txt_login;

    @FXML
    private JFXButton btn_login;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    @FXML
    void login(ActionEvent event) {
       //myController.setScreen("Acceuil"); // ERREUR DE SYNTAXE SQL

        String   password = String.valueOf(txt_password.getText());
        String   login = String.valueOf(txt_login.getText());


        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock", "root", "") ;
            Statement stmt = conn.createStatement() ;
            String query = "select droit_acces from Personnel where login ='"+login+"'  AND  mot_de_passe  ='"+password+"' ";
            ResultSet rs = stmt.executeQuery(query) ;







               // Db.getInstance().myPrepareStatement(sql);

            //    Db.getInstance().myPrepareStatement(sql);
             //   Db.getInstance().addParam(1, txt_login.getText());
           // Db.getInstance().addParam(2, txt_password.getText());
            //ResultSet rs = Db.getInstance().myExecutePrepareQuery();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Gestion du Stock");

            if(rs.next())
            {


                int droit=rs.getInt("droit_acces");
                if(droit == 1){
                    myController.setScreen("Acceuil");

                }
                else{
                    myController.setScreen("Acceuil_emp");
                }

            }
            else
            {
                alert.setContentText("Veuillez Entrer des données Valides");
                alert.showAndWait();
            }
            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }



