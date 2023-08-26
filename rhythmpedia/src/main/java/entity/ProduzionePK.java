package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProduzionePK implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "produttoreID")
    private String produttoreId;

    public String getProduttoreId() {
        return produttoreId;
    }

    public void setProduttoreId(String produttoreId) {
        this.produttoreId = produttoreId;
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
        ProduzionePK that = (ProduzionePK) o;
        return Objects.equals(produttoreId, that.produttoreId) && Objects.equals(codiceBrano, that.codiceBrano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produttoreId, codiceBrano);
    }
}
