package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "appartenenza_r", schema = "rhythmpedia")
@javax.persistence.IdClass(entity.AppartenenzaRPK.class)
public class AppartenenzaR {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeRaccolta")
    private String nomeRaccolta;

    public String getNomeRaccolta() {
        return nomeRaccolta;
    }

    public void setNomeRaccolta(String nomeRaccolta) {
        this.nomeRaccolta = nomeRaccolta;
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeGenere")
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

        AppartenenzaR that = (AppartenenzaR) o;

        if (nomeRaccolta != null ? !nomeRaccolta.equals(that.nomeRaccolta) : that.nomeRaccolta != null) return false;
        if (nomeArtista != null ? !nomeArtista.equals(that.nomeArtista) : that.nomeArtista != null) return false;
        if (nomeGenere != null ? !nomeGenere.equals(that.nomeGenere) : that.nomeGenere != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeRaccolta != null ? nomeRaccolta.hashCode() : 0;
        result = 31 * result + (nomeArtista != null ? nomeArtista.hashCode() : 0);
        result = 31 * result + (nomeGenere != null ? nomeGenere.hashCode() : 0);
        return result;
    }
}
