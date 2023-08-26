package entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Playlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "playlistID")
    private String playlistId;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "durata")
    private Time durata;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;

    public String getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getDurata() {
        return durata;
    }

    public void setDurata(Time durata) {
        this.durata = durata;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        if (playlistId != null ? !playlistId.equals(playlist.playlistId) : playlist.playlistId != null) return false;
        if (nome != null ? !nome.equals(playlist.nome) : playlist.nome != null) return false;
        if (durata != null ? !durata.equals(playlist.durata) : playlist.durata != null) return false;
        if (descrizione != null ? !descrizione.equals(playlist.descrizione) : playlist.descrizione != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId != null ? playlistId.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (durata != null ? durata.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }
}
