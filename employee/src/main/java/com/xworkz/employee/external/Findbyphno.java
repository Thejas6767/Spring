package com.xworkz.employee.external;




import javax.persistence.*;

public class Findbyphno {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        TypedQuery<EmployeeEntity> query = entityManager.createNamedQuery("findByPhno", EmployeeEntity.class);
        query.setParameter("phby", 785465897);

        EmployeeEntity employeeEntity = (EmployeeEntity) query.getSingleResult();
        System.out.println("Full Details: " + employeeEntity);








    }
}

