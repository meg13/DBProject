package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.IdClass(entity.InterpretazionePK.class)
public class Interpretazione {
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

        Interpretazione that = (Interpretazione) o;

        if (nomeArtista != null ? !nomeArtista.equals(that.nomeArtista) : that.nomeArtista != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(that.codiceBrano) : that.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomeArtista != null ? nomeArtista.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
