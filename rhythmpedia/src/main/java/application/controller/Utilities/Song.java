package application.controller.Utilities;

import javafx.beans.property.SimpleStringProperty;

import java.math.BigInteger;

public class Song {
    private SimpleStringProperty brani;
    private BigInteger ascolti_b;

    public Song(String brani, BigInteger ascolti_b) {
        this.brani = new SimpleStringProperty(brani);
        this.ascolti_b = ascolti_b;
    }

    public String getBrani() {
        return brani.get();
    }

    public SimpleStringProperty braniProperty() {
        return brani;
    }

    public BigInteger getAscolti_b() {
        return ascolti_b;
    }

    public void setBrani(String brani) {
        this.brani.set(brani);
    }

    public void setAscolti_b(BigInteger ascolti_b) {
        this.ascolti_b = ascolti_b;
    }
}
