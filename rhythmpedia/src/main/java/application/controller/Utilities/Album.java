package application.controller.Utilities;

import javafx.beans.property.SimpleStringProperty;

import java.math.BigInteger;

public class Album {

    private SimpleStringProperty album;
    private BigInteger ascolti_a;

    public Album(String album, BigInteger ascolti_a) {
        this.album = new SimpleStringProperty(album);
        this.ascolti_a = ascolti_a;
    }

    public String getAlbum() {
        return album.get();
    }

    public SimpleStringProperty albumProperty() {
        return album;
    }

    public BigInteger getAscolti_a() {
        return ascolti_a;
    }

    public void setAlbum(String album) {
        this.album.set(album);
    }

    public void setAscolti_a(BigInteger ascolti_a) {
        this.ascolti_a = ascolti_a;
    }
}
