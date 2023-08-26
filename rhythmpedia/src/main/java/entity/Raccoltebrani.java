package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(entity.RaccoltebraniPK.class)
public class Raccoltebrani {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "titolo")
    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeArtista")
    private String nomeArtista;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Basic
    @Column(name = "dataPubblicazione")
    private Date dataPubblicazione;

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Date dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    @Basic
    @Column(name = "numeroBrani")
    private Integer numeroBrani;

    public Integer getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(Integer numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    @Basic
    @Column(name = "tipologia")
    private String tipologia;

    public Object getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raccoltebrani that = (Raccoltebrani) o;

        if (titolo != null ? !titolo.equals(that.titolo) : that.titolo != null) return false;
        if (nomeArtista != null ? !nomeArtista.equals(that.nomeArtista) : that.nomeArtista != null) return false;
        if (dataPubblicazione != null ? !dataPubblicazione.equals(that.dataPubblicazione) : that.dataPubblicazione != null)
            return false;
        if (numeroBrani != null ? !numeroBrani.equals(that.numeroBrani) : that.numeroBrani != null) return false;
        if (tipologia != null ? !tipologia.equals(that.tipologia) : that.tipologia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titolo != null ? titolo.hashCode() : 0;
        result = 31 * result + (nomeArtista != null ? nomeArtista.hashCode() : 0);
        result = 31 * result + (dataPubblicazione != null ? dataPubblicazione.hashCode() : 0);
        result = 31 * result + (numeroBrani != null ? numeroBrani.hashCode() : 0);
        result = 31 * result + (tipologia != null ? tipologia.hashCode() : 0);
        return result;
    }
}
