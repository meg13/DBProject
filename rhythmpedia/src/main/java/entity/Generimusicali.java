package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Generimusicali {
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

        Generimusicali that = (Generimusicali) o;

        if (nomeGenere != null ? !nomeGenere.equals(that.nomeGenere) : that.nomeGenere != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return nomeGenere != null ? nomeGenere.hashCode() : 0;
    }
}
