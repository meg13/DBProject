package application.model;

import entity.AppartenenzaA;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Query nativeQuery = entityManager.createNativeQuery("SELECT nomeArtista FROM appartenenza_a WHERE nomeGenere='Pop'");
            for (Object artist :nativeQuery.getResultList()
                 ) {
                System.out.println(artist);
            }
            System.out.println("PROVA");
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
