package db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConnection {
    private static JPAConnection instance;
    private EntityManager em;
    private EntityManagerFactory emf;

         public JPAConnection() {
        try {
            emf= Persistence.createEntityManagerFactory("tuan2");
            em = emf.createEntityManager();
        }catch (Exception e){
            throw  new RuntimeException();
        }

        }
    public static  JPAConnection getInstance(){
        if(instance == null){
            instance = new JPAConnection();
        }
        return instance;
    }

    public  EntityManagerFactory getEmf(){
             return emf;
    }

    public void close(){
        em.close();
    }
}
