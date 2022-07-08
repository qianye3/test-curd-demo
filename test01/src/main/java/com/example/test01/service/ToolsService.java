package com.example.test01.service;

import com.example.test01.entity.Tools;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ToolsService {
    void add(Tools tools);
    void update(Tools tools);
    void del(Integer id);
    PageInfo<Tools> listByCode(String officeCode,Integer curPage,Integer pageSize);
    List<Tools> findAll();
}
