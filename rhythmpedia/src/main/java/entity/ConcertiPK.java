package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class ConcertiPK implements Serializable {
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

    @javax.persistence.Column(name = "data")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Timestamp data;

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcertiPK that = (ConcertiPK) o;
        return Objects.equals(nomeArtista, that.nomeArtista) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeArtista, data);
    }
}
