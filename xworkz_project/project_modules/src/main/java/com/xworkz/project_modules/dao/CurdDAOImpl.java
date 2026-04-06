package com.xworkz.project_modules.dao;

import com.xworkz.curd.entity.UserEntity;
import com.xworkz.project_modules.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class CurdDAOImpl implements CurdDAO {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(UserEntity entity) {
        return false;
    }

    @Override
    public UserEntity getTraineeBasedOnEmail(String email) {
        return null;
    }

    @Override
    public List<UserEntity> getTraineeData() {
        return Collections.emptyList();
    }

    @Override
    public boolean update(UserEntity entity) {
        return false;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public boolean saveUserEntity(UserEntity entity) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();
            return true;
        } catch (Exception e) {
            if (et.isActive()) et.rollback();
            return false;
        } finally {
            em.close();
        }
    }


    @Override
    public boolean checkLogin(String email, String password) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            String jpql = "SELECT count(u) FROM UserEntity u WHERE u.email = :email AND u.password = :pass";
            Query query = em.createQuery(jpql);
            query.setParameter("email", email);
            query.setParameter("pass", password);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
}
