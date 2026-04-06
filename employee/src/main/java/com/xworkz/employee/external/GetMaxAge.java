package com.xworkz.employee.external;

import javax.persistence.*;

public class GetMaxAge {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        TypedQuery<EmployeeEntity> query = entityManager.createNamedQuery("getMaxAge", EmployeeEntity.class);

        EmployeeEntity employeeEntity = (EmployeeEntity) query.getSingleResult();
        System.out.println("Full Details: " + employeeEntity);
    }
}


