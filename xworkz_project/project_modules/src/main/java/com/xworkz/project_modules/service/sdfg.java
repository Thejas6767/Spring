package com.xworkz.project_modules.service;


import com.xworkz.curd.dao.CurdDAO;
import com.xworkz.curd.dto.UserDto;
import com.xworkz.curd.entity.UserEntity;
import com.xworkz.project_modules.dao.CurdDAO;
import com.xworkz.project_modules.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CurdServiceImpl implements CurdService {
    @Autowired
    private CurdDAO curdDAO;

    @Override
    public String saveData(UserDto dto) {
        return "";
    }

    @Override
    public List<UserDto> getDtos() {
        return Collections.emptyList();
    }

    @Override
    public UserDto getTraineeInServiceBasedOnEmail(String traineeEmail) {
        return null;
    }

    @Override
    public String updateProduct(UserDto dto) {
        return "";
    }

    @Override
    public String delete(int id) {
        return "";
    }

    @Override
    public boolean saveUser(UserDto userDto) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(userDto, entity);
        return curdDAO.saveUserEntity(entity);
    }

    @Override
    public boolean loginUser(String email, String password) {
        return false;
    }

}
