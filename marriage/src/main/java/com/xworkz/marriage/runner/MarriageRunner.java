package com.xworkz.marriage.runner;

import com.xworkz.marriage.entity.MarriageEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;

public class MarriageRunner {


    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        MarriageEntity marriageEntity = new MarriageEntity("shashank",1,  300);

        entityManager.persist(marriageEntity);
        entityTransaction.commit();
        MarriageEntity entity=entityManager.find(MarriageEntity.class,1);
        System.out.println(entity.toString());



    }
}
