package entity;

import javax.persistence.*;

@Entity
public class Band {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nomeArte")
    private String nomeArte;
    @Basic
    @Column(name = "nazionalità")
    private String nazionalità;

    public String getNomeArte() {
        return nomeArte;
    }

    public void setNomeArte(String nomeArte) {
        this.nomeArte = nomeArte;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Band band = (Band) o;

        if (nomeArte != null ? !nomeArte.equals(band.nomeArte) : band.nomeArte != null) return false;
        if (nazionalità != null ? !nazionalità.equals(band.nazionalità) : band.nazionalità != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeArte != null ? nomeArte.hashCode() : 0;
        result = 31 * result + (nazionalità != null ? nazionalità.hashCode() : 0);
        return result;
    }
}
