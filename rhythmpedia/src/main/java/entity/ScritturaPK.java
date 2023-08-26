package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ScritturaPK implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "autoreID")
    private String autoreId;

    public String getAutoreId() {
        return autoreId;
    }

    public void setAutoreId(String autoreId) {
        this.autoreId = autoreId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "codiceBrano")
    private String codiceBrano;

    public String getCodiceBrano() {
        return codiceBrano;
    }

    public void setCodiceBrano(String codiceBrano) {
        this.codiceBrano = codiceBrano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScritturaPK that = (ScritturaPK) o;
        return Objects.equals(autoreId, that.autoreId) && Objects.equals(codiceBrano, that.codiceBrano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoreId, codiceBrano);
    }
}
