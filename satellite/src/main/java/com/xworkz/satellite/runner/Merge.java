package com.xworkz.satellite.runner;

import com.xworkz.satellite.entity.Satellite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Merge {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
Satellite satellite=new Satellite();

        Satellite entity=entityManager.find(Satellite.class,34536);
        entity.setSatellitename("Burn");
entityManager.merge(entity);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}

