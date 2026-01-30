package com.xworkz.satellite.runner;


import com.xworkz.satellite.entity.Satellite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SatelliteRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();




        Satellite satellite = new Satellite(4564,"Ash",209,"Sun");

        entityManager.persist(satellite);
        entityTransaction.commit();
        Satellite entity=entityManager.find(Satellite.class,4564);
        System.out.println(entity.toString());
    }
}