package application.controller.Utilities;

import javafx.beans.property.SimpleStringProperty;

import java.math.BigInteger;

public class Artist {

    private SimpleStringProperty artisti;
    private BigInteger ascolti_ar;

    public Artist(String artisti, BigInteger ascolti_ar) {
        this.artisti = new SimpleStringProperty(artisti);
        this.ascolti_ar = ascolti_ar;
    }

    public String getArtisti() {
        return artisti.get();
    }

    public SimpleStringProperty artistiProperty() {
        return artisti;
    }

    public BigInteger getAscolti_ar() {
        return ascolti_ar;
    }

    public void setArtisti(String artisti) {
        this.artisti.set(artisti);
    }

    public void setAscolti_ar(BigInteger ascolti_ar) {
        this.ascolti_ar = ascolti_ar;
    }
}
