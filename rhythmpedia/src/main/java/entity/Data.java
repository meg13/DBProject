package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@IdClass(entity.DataPK.class)
public class Data {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "nomeSolista")
    private String nomeSolista;

    public String getNomeSolista() {
        return nomeSolista;
    }

    public void setNomeSolista(String nomeSolista) {
        this.nomeSolista = nomeSolista;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "dataIngresso")
    private Date dataIngresso;

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    @Basic
    @Column(name = "dataUscita")
    private Date dataUscita;

    public Date getDataUscita() {
        return dataUscita;
    }

    public void setDataUscita(Date dataUscita) {
        this.dataUscita = dataUscita;
    }

    @Basic
    @Column(name = "nomeBand")
    private String nomeBand;

    public String getNomeBand() {
        return nomeBand;
    }

    public void setNomeBand(String nomeBand) {
        this.nomeBand = nomeBand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (nomeSolista != null ? !nomeSolista.equals(data.nomeSolista) : data.nomeSolista != null) return false;
        if (dataIngresso != null ? !dataIngresso.equals(data.dataIngresso) : data.dataIngresso != null) return false;
        if (dataUscita != null ? !dataUscita.equals(data.dataUscita) : data.dataUscita != null) return false;
        if (nomeBand != null ? !nomeBand.equals(data.nomeBand) : data.nomeBand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeSolista != null ? nomeSolista.hashCode() : 0;
        result = 31 * result + (dataIngresso != null ? dataIngresso.hashCode() : 0);
        result = 31 * result + (dataUscita != null ? dataUscita.hashCode() : 0);
        result = 31 * result + (nomeBand != null ? nomeBand.hashCode() : 0);
        return result;
    }
}
