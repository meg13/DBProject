package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class AscoltiPK implements Serializable {
    @javax.persistence.Column(name = "nomeUtente")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeUtente;

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    @javax.persistence.Column(name = "data")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @javax.persistence.Column(name = "momentoAscolto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Time momentoAscolto;

    public Time getMomentoAscolto() {
        return momentoAscolto;
    }

    public void setMomentoAscolto(Time momentoAscolto) {
        this.momentoAscolto = momentoAscolto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AscoltiPK ascoltiPK = (AscoltiPK) o;
        return Objects.equals(nomeUtente, ascoltiPK.nomeUtente) && Objects.equals(data, ascoltiPK.data) && Objects.equals(momentoAscolto, ascoltiPK.momentoAscolto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente, data, momentoAscolto);
    }
}
