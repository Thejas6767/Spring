package com.xworkz.satellite.runner;



import com.xworkz.satellite.entity.Satellite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        Satellite entity=entityManager.find(Satellite.class,4564);
        entityManager.remove(entity);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
