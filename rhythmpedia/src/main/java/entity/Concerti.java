package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(entity.ConcertiPK.class)
public class Concerti {
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "data")
    private Timestamp data;

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "città")
    private String città;

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    @Basic
    @Column(name = "nazione")
    private String nazione;

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Concerti concerti = (Concerti) o;

        if (nomeArtista != null ? !nomeArtista.equals(concerti.nomeArtista) : concerti.nomeArtista != null)
            return false;
        if (data != null ? !data.equals(concerti.data) : concerti.data != null) return false;
        if (città != null ? !città.equals(concerti.città) : concerti.città != null) return false;
        if (nazione != null ? !nazione.equals(concerti.nazione) : concerti.nazione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeArtista != null ? nomeArtista.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (città != null ? città.hashCode() : 0);
        result = 31 * result + (nazione != null ? nazione.hashCode() : 0);
        return result;
    }
}
