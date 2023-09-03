package application.controller;

import entity.Artisti;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ArtistController extends Controller implements Initializable {

    @FXML
    private TableView<Artisti> artisti;

    @FXML
    private TableColumn<Artisti, String> nome;

    ObservableList<Artisti> list = FXCollections.observableList(getQueryManager().getArtists());


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nome.setCellValueFactory(new PropertyValueFactory<Artisti,String>("artisti"));
        artisti.setItems(list);
    }
}
