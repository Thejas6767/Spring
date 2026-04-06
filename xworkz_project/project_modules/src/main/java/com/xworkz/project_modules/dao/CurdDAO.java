package com.xworkz.project_modules.dao;


import com.xworkz.curd.entity.CurdEntity;
import com.xworkz.curd.entity.UserEntity;
import com.xworkz.project_modules.entity.UserEntity;

import java.util.List;

public interface CurdDAO {
    boolean save(UserEntity entity);

    UserEntity getTraineeBasedOnEmail(String email);

    List<UserEntity> getTraineeData();

    boolean update(UserEntity entity);

    void delete(int id);

    boolean saveUserEntity(UserEntity entity);

    boolean checkLogin(String email, String password);
}