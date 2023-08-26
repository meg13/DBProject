package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class InclusionePK implements Serializable {
    @javax.persistence.Column(name = "nomeRaccolta")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeRaccolta;

    public String getNomeRaccolta() {
        return nomeRaccolta;
    }

    public void setNomeRaccolta(String nomeRaccolta) {
        this.nomeRaccolta = nomeRaccolta;
    }

    @javax.persistence.Column(name = "codiceBrano")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        InclusionePK thatPK = (InclusionePK) o;

        if (nomeRaccolta != null ? !nomeRaccolta.equals(thatPK.nomeRaccolta) : thatPK.nomeRaccolta != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(thatPK.codiceBrano) : thatPK.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeRaccolta != null ? nomeRaccolta.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
