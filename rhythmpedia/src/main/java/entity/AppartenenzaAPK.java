package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AppartenenzaAPK implements Serializable {

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


    @javax.persistence.Column(name = "nomeGenere")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeGenere;

    public String getNomeGenere() {
        return nomeGenere;
    }

    public void setNomeGenere(String nomeGenere) {
        this.nomeGenere = nomeGenere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppartenenzaAPK that = (AppartenenzaAPK) o;

        if (nomeArtista != null ? !nomeArtista.equals(that.nomeArtista) : that.nomeArtista != null) return false;
        if (nomeGenere != null ? !nomeGenere.equals(that.nomeGenere) : that.nomeGenere != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeArtista != null ? nomeArtista.hashCode() : 0;
        result = 31 * result + (nomeGenere != null ? nomeGenere.hashCode() : 0);
        return result;
    }
}
