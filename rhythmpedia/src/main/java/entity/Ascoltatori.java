package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Ascoltatori {
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

    @Basic
    @Column(name = "nazionalità")
    private String nazionalità;

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    @Basic
    @Column(name = "dataNascita")
    private Date dataNascita;

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Basic
    @Column(name = "sesso")
    private String sesso;

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ascoltatori that = (Ascoltatori) o;

        if (nomeUtente != null ? !nomeUtente.equals(that.nomeUtente) : that.nomeUtente != null) return false;
        if (nazionalità != null ? !nazionalità.equals(that.nazionalità) : that.nazionalità != null) return false;
        if (dataNascita != null ? !dataNascita.equals(that.dataNascita) : that.dataNascita != null) return false;
        if (sesso != null ? !sesso.equals(that.sesso) : that.sesso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeUtente != null ? nomeUtente.hashCode() : 0;
        result = 31 * result + (nazionalità != null ? nazionalità.hashCode() : 0);
        result = 31 * result + (dataNascita != null ? dataNascita.hashCode() : 0);
        result = 31 * result + (sesso != null ? sesso.hashCode() : 0);
        return result;
    }
}
