package application.controller;

import application.controller.Utilities.Album;
import application.controller.Utilities.Artist;
import application.controller.Utilities.Genres;
import application.controller.Utilities.Song;
import application.model.QueryManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ChartsController extends Controller implements Initializable {

    @FXML
    private Tab Artist;

    @FXML
    private Tab Genres;

    @FXML
    private Tab Raccolta;

    @FXML
    private Tab Song;

    @FXML
    private TableView<Genres> Table_Generi;

    @FXML
    private TableView<Album> Table_album;

    @FXML
    private TableView<Artist> Table_aritsti;

    @FXML
    private TableView<Song> Table_brani;

    @FXML
    private TableColumn<Album, String> album;

    @FXML
    private TableColumn<Artist, String> artisti;

    @FXML
    private TableColumn<Album, BigInteger> ascolti_a;

    @FXML
    private TableColumn<Artist, BigInteger> ascolti_ar;

    @FXML
    private TableColumn<Song, BigInteger> ascolti_b;

    @FXML
    private TableColumn<Genres, BigInteger> ascolti_g;

    @FXML
    private TableColumn<Song, String> brani;

    @FXML
    private TableColumn<Genres, String> generi;

    @Override
    public QueryManager getQueryManager() {
        return super.getQueryManager();
    }

    private Map<String, BigInteger> artistMap = getQueryManager().artistCharts();
    private Map<String, BigInteger> genresMap = getQueryManager().genrescharts();
    private Map<String, BigInteger> albumMap = getQueryManager().albumcharts();
    private Map<String, BigInteger> songMap = getQueryManager().songcharts();

    public void setArtist() {
        final ObservableList<Artist> list = FXCollections.observableArrayList();
        for(Map.Entry<String, BigInteger> entry : artistMap.entrySet() ){
            String artisti = entry.getKey();
            BigInteger ascolti_ar = entry.getValue();
            list.add(new Artist(artisti,ascolti_ar));

        }
        artisti.setCellValueFactory(new PropertyValueFactory<Artist,String>("artisti"));
        ascolti_ar.setCellValueFactory(new PropertyValueFactory<Artist,BigInteger>("ascolti_ar"));
        Table_aritsti.setItems(list);

    }
    public void setAlbum(){
        final ObservableList<Album> list = FXCollections.observableArrayList();
        for(Map.Entry<String, BigInteger> entry : albumMap.entrySet() ){
            String album = entry.getKey();
            BigInteger ascolti_a = entry.getValue();
            list.add(new Album(album,ascolti_a));

        }
        album.setCellValueFactory(new PropertyValueFactory<Album,String>("album"));
        ascolti_a.setCellValueFactory(new PropertyValueFactory<Album,BigInteger>("ascolti_a"));
        Table_album.setItems(list);

    }
    public void setSong(){
        final ObservableList<Song> list = FXCollections.observableArrayList();
        for(Map.Entry<String, BigInteger> entry : albumMap.entrySet() ){
            String brani = entry.getKey();
            BigInteger ascolti_b = entry.getValue();
            list.add(new Song(brani,ascolti_b));

        }
        brani.setCellValueFactory(new PropertyValueFactory<Song,String>("brani"));
        ascolti_b.setCellValueFactory(new PropertyValueFactory<Song,BigInteger>("ascolti_b"));
        Table_brani.setItems(list);
    }
    public void setGenres(){
        final ObservableList<Genres> list = FXCollections.observableArrayList();
        for(Map.Entry<String, BigInteger> entry : genresMap.entrySet() ){
            String generi = entry.getKey();
            BigInteger ascolti_g = entry.getValue();
            list.add(new Genres(generi,ascolti_g));

        }
        generi.setCellValueFactory(new PropertyValueFactory<Genres,String>("generi"));
        ascolti_g.setCellValueFactory(new PropertyValueFactory<Genres,BigInteger>("ascolti_g"));
        Table_Generi.setItems(list);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       setArtist();
       setAlbum();
       setSong();
       setGenres();
    }

    public void backToMenu(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pages/Main.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
