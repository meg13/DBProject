package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.IdClass(entity.InclusionePK.class)
public class Inclusione {
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
    @javax.persistence.Column(name = "codiceBrano")
    private String codiceBrano;

    public String getCodiceBrano() {
        return codiceBrano;
    }

    public void setCodiceBrano(String codiceBrano) {
        this.codiceBrano = codiceBrano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inclusione that = (Inclusione) o;

        if (nomeRaccolta != null ? !nomeRaccolta.equals(that.nomeRaccolta) : that.nomeRaccolta != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(that.codiceBrano) : that.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeRaccolta != null ? nomeRaccolta.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
