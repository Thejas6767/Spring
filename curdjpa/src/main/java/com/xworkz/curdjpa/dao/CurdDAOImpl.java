package com.xworkz.curdjpa.dao;


import com.xworkz.curdjpa.entity.CurdEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


@Repository
public class CurdDAOImpl implements CurdDAO {

    @Override
    public void save(CurdEntity entity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null) entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public List<CurdEntity> getAllData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("readAll");
            return (List<CurdEntity>) query.getResultList();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}