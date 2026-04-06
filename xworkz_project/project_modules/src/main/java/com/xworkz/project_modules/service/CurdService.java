package com.xworkz.project_modules.service;


import com.xworkz.curd.dto.CurdDto;
import com.xworkz.curd.dto.UserDto;
import com.xworkz.project_modules.dto.UserDto;

import java.util.List;

public interface CurdService {
    String saveData(UserDto dto);

    List<UserDto> getDtos();

    UserDto getTraineeInServiceBasedOnEmail(String traineeEmail);

    String updateProduct(UserDto dto);

    String delete(int id);

    boolean saveUser(UserDto userDto);

    boolean loginUser(String email, String password);
}