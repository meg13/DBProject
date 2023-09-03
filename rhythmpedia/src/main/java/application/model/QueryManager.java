package application.model;

import entity.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QueryManager {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private final EntityTransaction transaction = entityManager.getTransaction();


    /*Method to get all the artist*/
    public List<Artisti> getArtists() {
        return entityManager.createNativeQuery("SELECT nomeArte from artisti").getResultList();

    }

    /*Method to get for a selected genres the list of the artists*/
    private List<AppartenenzaA> getCorrispondentGenres(String genres) {
        return entityManager.createNativeQuery("SELECT nomeArtista from appartenenza_a WHERE nomeGenere= :genres",
                AppartenenzaA.class).setParameter("genres",genres).getResultList();
    }


    public Map<String, BigInteger> artistCharts() {

        List<Object[]> artist = entityManager.createNativeQuery("SELECT nomeArte, count(*) as NumeroAscolti from artisti a join interpretazione b on a.nomeArte = b.nomeArtista join ascolti a2 on b.codiceBrano = a2.codiceBrano group by nomeArtista order by NumeroAscolti desc")
                .getResultList();

        Map<String, BigInteger> tests = new HashMap<>();
        for (Object[] element : artist) {
            String nomeArte= (String) element[0];
            BigInteger numeroAscolti = (BigInteger) element[1];
            tests.put(nomeArte,numeroAscolti);
        }
        return tests;
    }
    public Map<String,BigInteger> albumcharts() {

        List<Object[]> album= entityManager.createNativeQuery("select nomeRaccolta , count(*) as riproduzione from inclusione b join ascolti a on b.codiceBrano = a.codiceBrano join raccoltebrani r on r.titolo = b.nomeRaccolta group by r.titolo order by riproduzione desc")
                .getResultList();
        Map<String,BigInteger> charts= new HashMap<>();
        for (Object[] element : album) {
            String nomeArte= (String) element[0];
            BigInteger numeroAscolti = (BigInteger) element[1];
            charts.put(nomeArte,numeroAscolti);
        }
        return charts;

    }

    public Map<String,BigInteger> songcharts() {

        List<Object[]> song= entityManager.createNativeQuery(
                "select b.titolo, count(*) as braniAscoltati from brani b join ascolti a on b.codiceBrano = a.codiceBrano group by titolo order by braniAscoltati desc").getResultList();
        Map<String,BigInteger> charts= new HashMap<>();
        for (Object[] element : song) {
            String nomeBrano= (String) element[0];
            BigInteger numeroAscolti = (BigInteger) element[1];
            charts.put(nomeBrano,numeroAscolti);
        }
        return charts;

    }
    public Map<String,BigInteger> genrescharts() {

        List<Object[]> genres= entityManager.createNativeQuery("select genere, count(*) as genres from brani a join ascolti a2 on a.codiceBrano = a2.codiceBrano group by a.genere order by genres desc")
                .getResultList();
        Map<String,BigInteger> charts= new HashMap<>();
        for (Object[] element : genres) {
            String nomeGenere= (String) element[0];
            BigInteger numeroAscolti = (BigInteger) element[1];
            charts.put(nomeGenere,numeroAscolti);
        }
        return charts;

    }
    public Map<String,BigInteger> genresArtistcharts(final String genere) {

        List<Object[]> Artistgenres= entityManager.createNativeQuery("SELECT a.nomeArtista, count(*) as NumeroAscolti from appartenenza_a a join interpretazione b on a.nomeArtista = b.nomeArtista join ascolti a2 on b.codiceBrano = a2.codiceBrano where nomeGenere= :genere group by nomeArtista order by NumeroAscolti desc")
                .setParameter("genere",genere)
                .getResultList();
        Map<String,BigInteger> charts= new HashMap<>();
        for (Object[] element : Artistgenres) {
            String nomeGenere= (String) element[0];
            BigInteger numeroAscolti = (BigInteger) element[1];
            charts.put(nomeGenere,numeroAscolti);
        }
        return charts;

    }
    public String ascoltoTotale(final String artista){
        Object durata = entityManager.createNativeQuery("select sec_to_time(sum(time_to_sec(durata))) as minuti from brani a join ascolti a2 on a.codiceBrano = a2.codiceBrano join interpretazione i on a.codiceBrano = i.codiceBrano join artisti c on i.nomeArtista= c.nomeArte where nomeArtista= :artista")
                .setParameter("artista",artista).getSingleResult();
        return (String) durata;
    }
    public List<Object> Tour(final String artist){
        List<Object> tourDates = entityManager.createNativeQuery("select * from artisti b join concerti a on b.nomeArte = a.nomeArtista where data > CURRENT_DATE && b.nomeArte= :artist")
                .setParameter("artist",artist).getResultList();
        return tourDates;
    }

    public List<Object[]> getSoloProfile(final String artist){
        return entityManager.createNativeQuery("select a.inizioAttività,s.nome,s.cognome, s.dataNascita, s.nazionalità from Artisti a join Solisti s on s.nomeArte=a.nomeArte where a.nomeArte= :solista")
                .setParameter("solista",artist).getResultList();
    }
    public List<Object[]> getBandInfo(final String band){
        return entityManager.createNativeQuery("select a.inizioAttività, a.fineAttività, b.nazionalità from Artisti a join Band b on b.nomeArte=a.nomeArte where a.nomeArte= :band")
                .setParameter("band",band).getResultList();
    }

    public List<Object> getAlbum(final String artist){
        return entityManager.createNativeQuery("select r.titolo from Artisti a join Raccoltebrani r on r.nomeArtista=a.nomeArte where a.nomeArte= :solo")
                .setParameter("solo",artist).getResultList();
    }
    public List<Object> genresCorrispondance(final String artist){
        return entityManager.createNativeQuery("select ap.nomeGenere from Artisti a join appartenenza_a ap on ap.nomeArtista=a.nomeArte where a.nomeArte= :artist")
                .setParameter("artist",artist).getResultList();
    }

    public List<String> getGenres() {
        List<String> get = new ArrayList<>();
        List<Object> list= entityManager.createNativeQuery("select nomeGenere from generimusicali").getResultList();
        for (Object element : list){
            String genres = (String) element;
            get.add(genres);
        }
        return get;
    }

}
