package application.controller.Utilities;

import javafx.beans.property.SimpleStringProperty;

import java.math.BigInteger;


public class Genres {

    private SimpleStringProperty generi;
    private BigInteger ascolti_g;

    public Genres(String generi, BigInteger ascolti_g) {
        this.generi = new SimpleStringProperty(generi);
        this.ascolti_g = ascolti_g;
    }

    public String getGeneri() {
        return generi.get();
    }

    public SimpleStringProperty generiProperty() {
        return generi;
    }

    public BigInteger getAscolti_g() {
        return ascolti_g;
    }

    public void setGeneri(String generi) {
        this.generi.set(generi);
    }

    public void setAscolti_g(BigInteger ascolti_g) {
        this.ascolti_g = ascolti_g;
    }
}
