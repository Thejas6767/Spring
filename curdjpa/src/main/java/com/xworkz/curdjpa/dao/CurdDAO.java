package com.xworkz.curdjpa.dao;

import com.xworkz.curdjpa.entity.CurdEntity;

import java.util.List;

public interface CurdDAO {
    void save(CurdEntity entity);
    List<CurdEntity> getAllData();
}
