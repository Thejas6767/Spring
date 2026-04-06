package com.xworkz.employee.external;

import javax.persistence.*;
import java.util.List;

public class AgeGreaterthan18 {
    public static void main(String[] args) {

            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            TypedQuery<EmployeeEntity> query = entityManager.createNamedQuery("findByAgeGreater", EmployeeEntity.class);
            query.setParameter("ageby", 18);

            List<EmployeeEntity> employees = query.getResultList();
            System.out.println("Full Details: " + employees);

    }
}
