package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Autori {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "autoreID")
    private String autoreId;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "cognome")
    private String cognome;
    @Basic
    @Column(name = "nazionalità")
    private String nazionalità;
    @Basic
    @Column(name = "dataNascita")
    private Date dataNascita;
    @Basic
    @Column(name = "sesso")
    private String sesso;

    public String getAutoreId() {
        return autoreId;
    }

    public void setAutoreId(String autoreId) {
        this.autoreId = autoreId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Object getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autori autori = (Autori) o;

        if (autoreId != null ? !autoreId.equals(autori.autoreId) : autori.autoreId != null) return false;
        if (nome != null ? !nome.equals(autori.nome) : autori.nome != null) return false;
        if (cognome != null ? !cognome.equals(autori.cognome) : autori.cognome != null) return false;
        if (nazionalità != null ? !nazionalità.equals(autori.nazionalità) : autori.nazionalità != null) return false;
        if (dataNascita != null ? !dataNascita.equals(autori.dataNascita) : autori.dataNascita != null) return false;
        if (sesso != null ? !sesso.equals(autori.sesso) : autori.sesso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autoreId != null ? autoreId.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        result = 31 * result + (nazionalità != null ? nazionalità.hashCode() : 0);
        result = 31 * result + (dataNascita != null ? dataNascita.hashCode() : 0);
        result = 31 * result + (sesso != null ? sesso.hashCode() : 0);
        return result;
    }
}
