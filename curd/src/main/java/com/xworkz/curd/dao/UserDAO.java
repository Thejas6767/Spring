package com.xworkz.curd.dao;



import com.xworkz.curd.entity.UserEntity;

import java.util.List;

public interface UserDAO {

    boolean save(UserEntity entity);

    UserEntity findByEmail(String email);

    boolean update(UserEntity entity);

    List<UserEntity> getAll();


    List<UserEntity> search(String keyword);

    List<UserEntity> getUsers(int page, int size);

    UserEntity findById(int id);

    void delete(int id);
    long getTotalUsers();
    long getCountByGender(String gender);
}