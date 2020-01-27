import Controller.ScreensController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static String auth = "Pharmacien";
    public static String auth_File = "/Views/Authentification.fxml";
    public static String acceuil = "Acceuil";
    public static String acceuil_File = "/Views/Acceuil.fxml";
    public static String acceuil_emp = "Acceuil_emp";
    public static String acceuil_emp__File = "/Views/Acceuil_Employe.fxml";
    public static String inventaire = "Inventaire";
    public static String inventaire_File = "/Views/Inventaire/Inventaire.fxml";
    public static String edit = "Edit";
    public static String edit_File = "/Views/Inventaire/Edit.fxml";
    public static String approv = "Approv";
    public static String approv_File = "/Views/Approvisionnement/Approv.fxml";
    public static String vente = "Vente";
    public static String vente_File = "/Views/Vente/Vente.fxml";
    public static String commande = "Commande";
    public static String commande_File = "/Views/Commande/Commande.fxml";
    public static String alerte = "Alertes";
    public static String alerte_File = "/Views/Commande/Alertes.fxml";
    public static String stats = "Statistiques";
    public static String stats_File = "/Views/Statistique/Statistiques.fxml";









    @Override
    public void start(Stage primaryStage) throws Exception{


        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Main.auth, Main.auth_File);
        mainContainer.loadScreen(Main.acceuil, Main.acceuil_File);
        mainContainer.loadScreen(Main.acceuil_emp, Main.acceuil_emp__File);
        mainContainer.loadScreen(Main.inventaire, Main.inventaire_File);
        mainContainer.loadScreen(Main.edit, Main.edit_File);
        mainContainer.loadScreen(Main.approv, Main.approv_File);
        mainContainer.loadScreen(Main.vente, Main.vente_File);
        mainContainer.loadScreen(Main.commande, Main.commande_File);
        mainContainer.loadScreen(Main.alerte, Main.alerte_File);
        mainContainer.loadScreen(Main.stats, Main.stats_File);


        mainContainer.setScreen(Main.auth);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);


        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();

        primaryStage.setResizable(false);
        primaryStage.show();

        ScreensController.primaryStage = primaryStage;

    }


    public static void main(String[] args){
        launch(args);
    }
}
