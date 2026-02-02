package com.xworkz.meteorite.runner;

import com.xworkz.meteorite.entity.MeteoriteEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MeteoriteUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        MeteoriteEntity meteorite = em.find(MeteoriteEntity.class, 102);
        if(meteorite != null) {
            meteorite.setName(" est");
            em.merge(meteorite);
        }
        tx.commit();

        em.close();
        emf.close();
    }
}
