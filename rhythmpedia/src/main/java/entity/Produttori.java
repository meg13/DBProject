package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Produttori {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "produttoreID")
    private String produttoreId;
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

    public String getProduttoreId() {
        return produttoreId;
    }

    public void setProduttoreId(String produttoreId) {
        this.produttoreId = produttoreId;
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

        Produttori that = (Produttori) o;

        if (produttoreId != null ? !produttoreId.equals(that.produttoreId) : that.produttoreId != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (cognome != null ? !cognome.equals(that.cognome) : that.cognome != null) return false;
        if (nazionalità != null ? !nazionalità.equals(that.nazionalità) : that.nazionalità != null) return false;
        if (dataNascita != null ? !dataNascita.equals(that.dataNascita) : that.dataNascita != null) return false;
        if (sesso != null ? !sesso.equals(that.sesso) : that.sesso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = produttoreId != null ? produttoreId.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        result = 31 * result + (nazionalità != null ? nazionalità.hashCode() : 0);
        result = 31 * result + (dataNascita != null ? dataNascita.hashCode() : 0);
        result = 31 * result + (sesso != null ? sesso.hashCode() : 0);
        return result;
    }
}
