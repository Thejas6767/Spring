package com.xworkz.curd.service;


import com.xworkz.curd.dao.UserDAO;
import com.xworkz.curd.dto.UserDto;
import com.xworkz.curd.entity.UserEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    UserDAO userDAO;

    @Override
    public String register(UserDto dto) {

        UserEntity existing = userDAO.findByEmail(dto.getEmail());

        if(existing != null){
            return "Email already exists";
        }

        UserEntity entity = new UserEntity();

        BeanUtils.copyProperties(dto, entity);

        // 🔐 Encrypt password
        entity.setPassword(encoder.encode(dto.getPassword()));

        if(dto.getEmail().equals("thejasmr.xworkz@gmail.com")){
            entity.setRole("ADMIN");
        } else {
            entity.setRole("USER");
        }
        if(userDAO.save(entity)){
            return "Signup successful";
        }

        return "Signup failed";
    }

    @Override
    public UserDto login(String email, String password) {

        UserEntity entity = userDAO.findByEmail(email);

        if(entity != null){

            // ✅ Always use matches()
            if(encoder.matches(password, entity.getPassword())){

                UserDto dto = new UserDto();
                BeanUtils.copyProperties(entity, dto);

                return dto;
            }
        }

        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<UserEntity> entities = userDAO.getAll();

        List<UserDto> dtos = new ArrayList<>();

        for(UserEntity entity : entities){
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(entity, dto);
            dtos.add(dto);
        }

        return dtos;
    }

    @Override
    public boolean updateUser(UserDto dto) {

        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(dto, entity);

        return userDAO.update(entity);
    }
    @Override
    public List<UserDto> searchUsers(String keyword) {

        List<UserEntity> entities = userDAO.search(keyword);

        List<UserDto> dtos = new ArrayList<>();

        for(UserEntity e : entities){
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(e, dto);
            dtos.add(dto);
        }

        return dtos;
    }

    @Override
    public List<UserDto> getUsersWithPagination(int page, int size) {

        List<UserEntity> entities = userDAO.getUsers(page, size);

        List<UserDto> dtos = new ArrayList<>();

        for(UserEntity e : entities){
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(e, dto);
            dtos.add(dto);
        }

        return dtos;
    }

    @Override
    public UserDto getUserById(int id) {

        UserEntity entity = userDAO.findById(id);

        if(entity != null){
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }

        return null;
    }

    @Override
    public void deleteUser(int id) {
        userDAO.delete(id);
    }
}