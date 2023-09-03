package application.controller;

import application.model.QueryManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.*;

public class ProfileController extends Controller{

    @FXML
    private TextArea album;

    @FXML
    private TextField cognome;

    @FXML
    private TextField datanascita;

    @FXML
    private TextArea generi;

    @FXML
    private TextField inizioattività;

    @FXML
    private TextField nazionalità;

    @FXML
    private TextField nome;

    @FXML
    private TextField concerto;

    @FXML
    private TextField minuti;

    @FXML
    private Label nome_arte;

    @FXML
    private Button menu;


    public List<Object[]> information = new ArrayList<>();

    private Stage stage;
    private Scene scene;
    private Parent root;


    @Override
    public QueryManager getQueryManager() {
        return super.getQueryManager();
    }

    public void fillText(final String solo){

        for (Object[] row :
                information) {
            Date inizio = (Date) row[0];

            String name = (String) row[1];
            nome.setText(name);
            String surname = (String) row[2];
            cognome.setText(surname);
            LocalDate data = LocalDate.parse(inizio.toString());
            int attività= data.getYear();
            inizioattività.setText(""+attività);
            Date bornDate = (Date) row[3];
            datanascita.setText(bornDate.toString());
            String nation = (String) row[4];
            nazionalità.setText(nation);

            getCorrispondentGenres(solo);
            getArtistAlbum(solo);
            isInConcert(solo);

        }



    }
    public void getArtistAlbum(final String artist) {
        List<Object> raccolta = getQueryManager().getAlbum(artist);
        for (Object name:
                raccolta) {
            album.appendText((String) name + "\n");
        }
    }

    public void getCorrispondentGenres(final String artist){
        List<Object> album = getQueryManager().genresCorrispondance(artist);
        for (Object name:
                album) {
            generi.appendText((String) name + "\n");
        }
    }
    public void fillband( final String band){

        this.information = getQueryManager().getBandInfo(band);

        for (Object[] row :
                information) {
            Date inizio = (Date) row[0];
            Date fine = (Date) row[1];
            LocalDate data = LocalDate.parse(inizio.toString());
            int attività= data.getYear();
            inizioattività.setText(""+attività);
            if (fine == null){
                datanascita.setText("null");
            } else {
                LocalDate end = LocalDate.parse(fine.toString());
                int fineAttività = end.getYear();
                datanascita.setText(""+fineAttività);
            }
            String nation = (String) row[2];
            nazionalità.setText(nation);
            getCorrispondentGenres(band);
            getArtistAlbum(band);
            isInConcert(band);
            //getTime(band);

        }
    }

    public void displayNomeArte(final String name){
        nome_arte.setText(name);
        this.information = getQueryManager().getSoloProfile(name);
        fillText(name);
        fillband(name);

    }
    public void isInConcert(final String artist){
        List<Object> concert = getQueryManager().Tour(artist);
        if (concert.isEmpty()){
            concerto.appendText("In concerto");
        } else {
            concerto.appendText("Non in concerto");
        }
    }

    public void getTime(final String artist){
        String time = getQueryManager().ascoltoTotale(artist);
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        int totalMinutes = hours * 60 + minutes;
        int totalSeconds = totalMinutes * 60 + seconds;

        String durationString = String.format("%d:%02d:%02d", totalMinutes / 60, totalMinutes % 60, seconds);

        minuti.setText(durationString);



    }

    public void backToMenu(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/pages/Main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
