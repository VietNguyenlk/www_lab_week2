package vn.edu.iuh.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.edu.iuh.models.Employee;

public class JPAConnection {
    private static JPAConnection instance;
    private EntityManager em;
    private EntityManagerFactory emf;

         public JPAConnection() {
        try {
            emf= Persistence.createEntityManagerFactory("tuan2");
        //    em = emf.createEntityManager();
      //      System.out.println("thanh cong");
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

    public static void main(String[] args) {
        // Tạo một thể hiện của JPAConnection
        JPAConnection jpaConnection = JPAConnection.getInstance();

        // Lấy EntityManagerFactory từ JPAConnection
        EntityManagerFactory emf = jpaConnection.getEmf();

        // Tạo EntityManager từ EntityManagerFactory
        EntityManager em = emf.createEntityManager();

        // Bắt đầu một giao dịch (transaction)
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            // Thực hiện các thao tác với cơ sở dữ liệu ở đây

            // Ví dụ: Tạo một đối tượng và lưu vào cơ sở dữ liệu
//            YourEntity entity = new YourEntity();
           // entity.setSomeProperty("Some Value");
            Employee e = new Employee(1,null,null,null,null,null,null);
            em.persist(e);
            System.out.println("succes");

            // Commit giao dịch
            transaction.commit();

        } catch (Exception e) {
            // Nếu có lỗi, rollback giao dịch
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Đóng EntityManager khi hoàn thành
            em.close();
        }

    }
}
