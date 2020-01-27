package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by AMADOU on 21/07/2017.
 */
public class controller_statistiques implements Initializable, ControlledScreen {

    ScreensController myController;
    ObservableList<Integer> data = FXCollections.observableArrayList();


    @FXML
    private AreaChart<Integer, Integer> chartsChiffre;

    @FXML
    private StackedBarChart<Integer, Integer> chartsNombre;

    @FXML
    private JFXButton btnHome;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TEST
        //ObservableList<List> list = FXCollections.observableArrayList();
        for(int i=1; i <54;i++ ){

          //  list.add(i);
            data.add(i);
        }

       // chartsNombre.setData(data);


        // TODO

    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }



    @FXML
    void gotoHome(ActionEvent event) {
myController.setScreen("Acceuil");
    }
}
