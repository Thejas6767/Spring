package com.xworkz.employee.external;

import javax.persistence.*;

public class FindbyEmail {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        TypedQuery<EmployeeEntity> query = entityManager.createNamedQuery("findbyemail", EmployeeEntity.class);
        query.setParameter("emailby", "thejas@gmail");

        EmployeeEntity employeeEntity = (EmployeeEntity) query.getSingleResult();
        System.out.println("Full Details: " + employeeEntity);
    }
}

