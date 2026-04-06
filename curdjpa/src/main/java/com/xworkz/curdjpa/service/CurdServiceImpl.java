package com.xworkz.curdjpa.service;


import com.xworkz.curdjpa.dao.CurdDAO;
import com.xworkz.curdjpa.dto.CurdDto;
import com.xworkz.curdjpa.entity.CurdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class CurdServiceImpl implements CurdService {
    @Autowired
    private CurdDAO curdDAO;

    @Override
    public void saveData(CurdDto dto) {
        CurdEntity entity = new CurdEntity();
        entity.setName(dto.getName());
        entity.setGender(dto.getGender());
        entity.setAge(dto.getAge());
        entity.setClgName(dto.getClgName());
        entity.setPh(dto.getPh());
        curdDAO.save(entity);
    }

    @Override
    public List<CurdDto> getAllData() {
        return Collections.emptyList();
    }


    @Override
    public List<CurdDto> getDtos() {
        List<CurdEntity> entities = curdDAO.getAllData();
        List<CurdDto> dtos = new ArrayList<>();
        entities.forEach(e -> {
            CurdDto d = new CurdDto();
            d.setId(e.getId());
            d.setName(e.getName());
            d.setGender(e.getGender());
            d.setAge(e.getAge());
            d.setClgName(e.getClgName());
            d.setPh(e.getPh());
            dtos.add(d);
        });
        return dtos;
    }
    }
