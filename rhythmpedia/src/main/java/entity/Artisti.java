package entity;

import javax.persistence.*;
import java.sql.Date;
import java.time.Year;

@Entity
public class Artisti {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeArte")
    private String nomeArte;

    public String getNomeArte() {
        return nomeArte;
    }

    public void setNomeArte(String nomeArte) {
        this.nomeArte = nomeArte;
    }

    @Basic
    @Column(name = "inizioAttività")
    private Short inizioAttività;

    public Short getInizioAttività() {
        return inizioAttività;
    }

    public void setInizioAttività(Short inizioAttività) {
        this.inizioAttività = inizioAttività;
    }

    @Basic
    @Column(name = "fineAttività")
    private Short fineAttività;

    public Short getFineAttività() {
        return fineAttività;
    }

    public void setFineAttività(Short fineAttività) {
        this.fineAttività = fineAttività;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artisti artisti = (Artisti) o;

        if (nomeArte != null ? !nomeArte.equals(artisti.nomeArte) : artisti.nomeArte != null) return false;
        if (inizioAttività != null ? !inizioAttività.equals(artisti.inizioAttività) : artisti.inizioAttività != null)
            return false;
        if (fineAttività != null ? !fineAttività.equals(artisti.fineAttività) : artisti.fineAttività != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeArte != null ? nomeArte.hashCode() : 0;
        result = 31 * result + (inizioAttività != null ? inizioAttività.hashCode() : 0);
        result = 31 * result + (fineAttività != null ? fineAttività.hashCode() : 0);
        return result;
    }
}
