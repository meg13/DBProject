package entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.Duration;

@Entity
public class Brani {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codiceBrano")
    private String codiceBrano;
    @Basic
    @Column(name = "titolo")
    private String titolo;
    @Basic
    @Column(name = "dataPubblicazione")
    private Date dataPubblicazione;
    @Basic
    @Column(name = "durata")
    private Time durata;
    @Basic
    @Column(name = "genere")
    private String genere;

    public String getCodiceBrano() {
        return codiceBrano;
    }

    public void setCodiceBrano(String codiceBrano) {
        this.codiceBrano = codiceBrano;
    }

    public Object getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Date dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public Time getDurata() {
        return durata;
    }

    public void setDurata(Time durata) {
        this.durata = durata;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brani brani = (Brani) o;

        if (codiceBrano != null ? !codiceBrano.equals(brani.codiceBrano) : brani.codiceBrano != null) return false;
        if (titolo != null ? !titolo.equals(brani.titolo) : brani.titolo != null) return false;
        if (dataPubblicazione != null ? !dataPubblicazione.equals(brani.dataPubblicazione) : brani.dataPubblicazione != null)
            return false;
        if (durata != null ? !durata.equals(brani.durata) : brani.durata != null) return false;
        if (genere != null ? !genere.equals(brani.genere) : brani.genere != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codiceBrano != null ? codiceBrano.hashCode() : 0;
        result = 31 * result + (titolo != null ? titolo.hashCode() : 0);
        result = 31 * result + (dataPubblicazione != null ? dataPubblicazione.hashCode() : 0);
        result = 31 * result + (durata != null ? durata.hashCode() : 0);
        result = 31 * result + (genere != null ? genere.hashCode() : 0);
        return result;
    }
}
