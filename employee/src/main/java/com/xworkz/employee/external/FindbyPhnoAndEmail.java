package com.xworkz.employee.external;

import javax.persistence.*;

public class FindbyPhnoAndEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        TypedQuery<EmployeeEntity> query = entityManager.createNamedQuery("findByPhnoAndEmail", EmployeeEntity.class);
        query.setParameter("phby", 720423827);
        query.setParameter("emailby", "thejas@gmail");

        EmployeeEntity employeeEntity = (EmployeeEntity) query.getSingleResult();
        System.out.println("Full Details: " + employeeEntity);
    }
}