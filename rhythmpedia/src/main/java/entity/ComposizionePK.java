package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ComposizionePK implements Serializable {
    @javax.persistence.Column(name = "playlistID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playlistId;

    public String getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
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

        ComposizionePK that = (ComposizionePK) o;

        if (playlistId != null ? !playlistId.equals(that.playlistId) : that.playlistId != null) return false;
        if (codiceBrano != null ? !codiceBrano.equals(that.codiceBrano) : that.codiceBrano != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId != null ? playlistId.hashCode() : 0;
        result = 31 * result + (codiceBrano != null ? codiceBrano.hashCode() : 0);
        return result;
    }
}
