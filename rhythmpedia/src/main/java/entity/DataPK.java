package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class DataPK implements Serializable {
    @javax.persistence.Column(name = "nomeSolista")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeSolista;

    public String getNomeSolista() {
        return nomeSolista;
    }

    public void setNomeSolista(String nomeSolista) {
        this.nomeSolista = nomeSolista;
    }


    @javax.persistence.Column(name = "dataIngresso")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date dataIngresso;

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataPK dataPK = (DataPK) o;

        if (nomeSolista != null ? !nomeSolista.equals(dataPK.nomeSolista) : dataPK.nomeSolista != null) return false;
        if (dataIngresso != null ? !dataIngresso.equals(dataPK.dataIngresso) : dataPK.dataIngresso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeSolista != null ? nomeSolista.hashCode() : 0;
        result = 31 * result + (dataIngresso != null ? dataIngresso.hashCode() : 0);
        return result;
    }
}
