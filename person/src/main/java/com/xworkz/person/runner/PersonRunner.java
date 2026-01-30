package com.xworkz.person.runner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        PersonEntity personEntity = new PersonEntity(3,"PT",20);

        entityManager.persist(personEntity);
        entityTransaction.commit();
        PersonEntity entity=entityManager.find(PersonEntity.class,3);
        System.out.println(entity.toString());



    }
}
