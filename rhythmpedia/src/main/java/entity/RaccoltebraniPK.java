package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RaccoltebraniPK implements Serializable {
    @javax.persistence.Column(name = "titolo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @javax.persistence.Column(name = "nomeArtista")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeArtista;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaccoltebraniPK that = (RaccoltebraniPK) o;
        return Objects.equals(titolo, that.titolo) && Objects.equals(nomeArtista, that.nomeArtista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, nomeArtista);
    }
}
