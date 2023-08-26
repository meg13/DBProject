package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.IdClass(entity.ProduzionePK.class)
public class Produzione {
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

        Produzione that = (Produzione) o;

        if (produttoreId != null ? !produttoreId.equals(that.produttoreId) : that.produttoreId != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(that.codiceBrano) : that.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = produttoreId != null ? produttoreId.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
