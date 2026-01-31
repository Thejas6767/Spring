package com.xworkz.jobfair.external;

import com.xworkz.jobfair.entity.JobFairEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class JobFair {
    public static void main(String[] args) {

        EntityManager em = null;
        EntityManagerFactory eMF = null;
        try {
            eMF = Persistence.createEntityManagerFactory("Xworkz");
            em = eMF.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();

           JobFairEntity jobFairEntity=em.find(JobFairEntity.class,4);
           em.remove(jobFairEntity);
            et.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            eMF.close();
        }

    }
}
