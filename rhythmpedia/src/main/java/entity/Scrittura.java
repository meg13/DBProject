package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.IdClass(entity.ScritturaPK.class)
public class Scrittura {
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

        Scrittura scrittura = (Scrittura) o;

        if (autoreId != null ? !autoreId.equals(scrittura.autoreId) : scrittura.autoreId != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(scrittura.codiceBrano) : scrittura.codiceBrano != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autoreId != null ? autoreId.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
