package com.xworkz.curd.service;


import com.xworkz.curd.dto.UserDto;

import java.util.List;

public interface UserService {

    String register(UserDto dto);

    UserDto login(String email,String password);

    List<UserDto> getAllUsers();
    boolean updateUser(UserDto dto);
    List<UserDto> searchUsers(String keyword);
    List<UserDto> getUsersWithPagination(int page, int size);

    UserDto getUserById(int id);

    void deleteUser(int id);
}