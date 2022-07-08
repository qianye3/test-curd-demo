package com.example.test01.mapper;

import com.example.test01.entity.Tools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToolsMapper {
    List<Tools> listByCode(String officeCode);
    void add(Tools tools);
    void update(Tools tools);
    void del(Integer id);
    List<Tools> findAll();
}
