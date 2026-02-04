package com.xworkz.jobfair.external;

import com.xworkz.jobfair.entity.JobFairEntity;

import javax.persistence.*;

public class JobFair {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        Query query=em.createNamedQuery("findByNameAndid");
        query.setParameter("idby", 1 );
        query.setParameter("personNameby", "ram" );

        JobFairEntity jobFairEntity = (JobFairEntity) query.getSingleResult();;
        System.out.println(jobFairEntity.getPersonAge());
    }

}
