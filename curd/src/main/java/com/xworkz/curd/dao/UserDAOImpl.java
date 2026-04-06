package com.xworkz.curd.dao;



import com.xworkz.curd.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(UserEntity entity) {

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(entity);
            et.commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            em.close();
        }
    }

    @Override
    public UserEntity findByEmail(String email) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            Query query = em.createNamedQuery("findUserByEmail");
            query.setParameter("email", email);

            return (UserEntity) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        } finally {
            em.close();
        }
    }
    @Override
    public boolean update(UserEntity entity) {

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            em.merge(entity);
            tx.commit();
            return true;

        } catch (Exception e){
            if(tx.isActive()) tx.rollback();
            e.printStackTrace();
            return false;

        } finally {
            em.close();
        }
    }

    @Override
    public List<UserEntity> getAll() {
        EntityManager em = entityManagerFactory.createEntityManager();

        return em.createQuery("SELECT u FROM UserEntity u", UserEntity.class)
                .getResultList();
    }

    @Override
    public List<UserEntity> search(String keyword) {

        EntityManager em = entityManagerFactory.createEntityManager();

        return em.createQuery(
                        "SELECT u FROM UserEntity u WHERE u.name LIKE :key OR u.email LIKE :key",
                        UserEntity.class)
                .setParameter("key", "%" + keyword + "%")
                .getResultList();
    }

    @Override
    public List<UserEntity> getUsers(int page, int size) {

        EntityManager em = entityManagerFactory.createEntityManager();

        return em.createQuery("SELECT u FROM UserEntity u", UserEntity.class)
                .setFirstResult(page * size)
                .setMaxResults(size)
                .getResultList();
    }

    @Override
    public UserEntity findById(int id) {

        EntityManager em = entityManagerFactory.createEntityManager();

        return em.find(UserEntity.class, id);
    }

    @Override
    public void delete(int id) {

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            UserEntity entity = em.find(UserEntity.class, id);

            if(entity != null){
                em.remove(entity);
                System.out.println("Deleted user with ID: " + id);
            } else {
                System.out.println("User not found!");
            }

            tx.commit();

        } catch (Exception e) {
            if(tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    @Override
    public long getTotalUsers() {
        return (long) entityManagerFactory.createEntityManager()
                .createQuery("select count(u) from UserEntity u")
                .getSingleResult();
    }

    @Override
    public long getCountByGender(String gender) {
        return (long) entityManagerFactory.createEntityManager()
                .createQuery("select count(u) from UserEntity u where lower(u.gender) = lower(:gender)")
                .setParameter("gender", gender)
                .getSingleResult();
    }
}
