package com.example.test01.service.impl;

import com.example.test01.entity.Tools;
import com.example.test01.mapper.ToolsMapper;
import com.example.test01.service.ToolsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToolsServiceImpl implements ToolsService {

    @Resource
    private ToolsMapper toolsMapper;
    @Override
    public void add(Tools tools) {
        toolsMapper.add(tools);
    }

    @Override
    public void update(Tools tools) {
        toolsMapper.update(tools);
    }

    @Override
    public void del(Integer id) {
        toolsMapper.del(id);
    }

    @Override
    public PageInfo<Tools> listByCode(String officeCode, Integer curPage, Integer pageSize) {
        PageHelper.startPage(curPage,pageSize);
        List<Tools> toolsList = toolsMapper.listByCode(officeCode);
        PageInfo<Tools> page = new PageInfo<>(toolsList);
        return page;
    }

    @Override
    public List<Tools> findAll() {
        return toolsMapper.findAll();
    }
}
