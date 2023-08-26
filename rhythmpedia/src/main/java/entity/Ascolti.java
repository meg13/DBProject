package entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@IdClass(entity.AscoltiPK.class)
public class Ascolti {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeUtente")
    private String nomeUtente;

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "data")
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "momentoAscolto")
    private Time momentoAscolto;

    public Time getMomentoAscolto() {
        return momentoAscolto;
    }

    public void setMomentoAscolto(Time momentoAscolto) {
        this.momentoAscolto = momentoAscolto;
    }

    @Basic
    @Column(name = "codiceBrano")
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

        Ascolti ascolti = (Ascolti) o;

        if (nomeUtente != null ? !nomeUtente.equals(ascolti.nomeUtente) : ascolti.nomeUtente != null) return false;
        if (data != null ? !data.equals(ascolti.data) : ascolti.data != null) return false;
        if (momentoAscolto != null ? !momentoAscolto.equals(ascolti.momentoAscolto) : ascolti.momentoAscolto != null)
            return false;
        if (codiceBrano != null ? !codiceBrano.equals(ascolti.codiceBrano) : ascolti.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeUtente != null ? nomeUtente.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (momentoAscolto != null ? momentoAscolto.hashCode() : 0);
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
