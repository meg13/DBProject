package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Solisti {
    @Basic
    @Column(name = "solistaID")
    private String solistaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nomeArte")
    private String nomeArte;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "cognome")
    private String cognome;
    @Basic
    @Column(name = "nazionalità")
    private String nazionalità;
    @Basic
    @Column(name = "dataNascita")
    private Date dataNascita;
    @Basic
    @Column(name = "sesso")
    private String sesso;

    public String getSolistaId() {
        return solistaId;
    }

    public void setSolistaId(String solistaId) {
        this.solistaId = solistaId;
    }

    public String getNomeArte() {
        return nomeArte;
    }

    public void setNomeArte(String nomeArte) {
        this.nomeArte = nomeArte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Object getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solisti solisti = (Solisti) o;

        if (solistaId != null ? !solistaId.equals(solisti.solistaId) : solisti.solistaId != null) return false;
        if (nomeArte != null ? !nomeArte.equals(solisti.nomeArte) : solisti.nomeArte != null) return false;
        if (nome != null ? !nome.equals(solisti.nome) : solisti.nome != null) return false;
        if (cognome != null ? !cognome.equals(solisti.cognome) : solisti.cognome != null) return false;
        if (nazionalità != null ? !nazionalità.equals(solisti.nazionalità) : solisti.nazionalità != null) return false;
        if (dataNascita != null ? !dataNascita.equals(solisti.dataNascita) : solisti.dataNascita != null) return false;
        if (sesso != null ? !sesso.equals(solisti.sesso) : solisti.sesso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = solistaId != null ? solistaId.hashCode() : 0;
        result = 31 * result + (nomeArte != null ? nomeArte.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        result = 31 * result + (nazionalità != null ? nazionalità.hashCode() : 0);
        result = 31 * result + (dataNascita != null ? dataNascita.hashCode() : 0);
        result = 31 * result + (sesso != null ? sesso.hashCode() : 0);
        return result;
    }
}
