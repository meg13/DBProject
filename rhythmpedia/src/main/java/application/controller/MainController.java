package application.controller;

import application.model.QueryManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainController extends Controller implements Initializable{

    @FXML
    private Button classifiche;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private TextField textField;

    private Stage stage;
    private Scene scene;
    private Parent root;


    @Override
    public QueryManager getQueryManager() {
        return super.getQueryManager();
    }

    private List<String> genres = getQueryManager().getGenres();


    @FXML
    public void addElementToBox() {
        for (String type: genres) {
            combobox.getItems().add(type);
            combobox.setOnAction(event -> {
                try {
                    switchGenresScene(event, combobox.getValue());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        }
    }

    @FXML
    public void switchToCharts(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("/pages/Charts.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchGenresScene(ActionEvent event, String genres) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pages/ArtistForGenres.fxml"));
        root = loader.load();

        ArtistForGenresController artistForGenresController = loader.getController();
        artistForGenresController.displayGenres(genres);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void switchToProfile(ActionEvent event) throws IOException {
        addElementToBox();
        String name = textField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pages/Profile.fxml"));
        root = loader.load();

        ProfileController profileController = loader.getController();
        profileController.displayNomeArte(name);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addElementToBox();
    }
}
