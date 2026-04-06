package com.xworkz.curdjpa.service;

import com.xworkz.curdjpa.dto.CurdDto;

import java.util.List;

public interface CurdService {
    void saveData(CurdDto dto);
    List<CurdDto> getAllData();

    List<CurdDto> getDtos();
}