package application.controller;

import application.controller.Utilities.Artist;
import application.model.QueryManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class ArtistForGenresController extends Controller implements Initializable {

    @FXML
    private TableColumn<Artist, String> artisti;

    @FXML
    private TableColumn<Artist, BigInteger> ascolti;

    @FXML
    private TableView<Artist> category;

    @FXML
    private Label genere;

    public String element;
    public Map<String, BigInteger> artistMap = new HashMap<>();


    @Override
    public QueryManager getQueryManager() {
        return super.getQueryManager();
    }

    public void setArtist() {
        final ObservableList<Artist> list = FXCollections.observableArrayList();
        for(Map.Entry<String, BigInteger> entry : artistMap.entrySet() ){
            String artisti = entry.getKey();
            BigInteger ascolti_ar = entry.getValue();
            list.add(new Artist(artisti,ascolti_ar));

        }
        artisti.setCellValueFactory(new PropertyValueFactory<Artist,String>("artisti"));
        ascolti.setCellValueFactory(new PropertyValueFactory<Artist,BigInteger>("ascolti_ar"));
        category.setItems(list);


    }
    public void displayGenres(String label){
        this.artistMap= getQueryManager().genresArtistcharts(label);
        genere.setText(label);
        setArtist();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setArtist();
    }

    public void backToMenu(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pages/Main.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
