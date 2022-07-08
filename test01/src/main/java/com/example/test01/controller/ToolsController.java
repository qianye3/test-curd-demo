package com.example.test01.controller;

import com.example.test01.entity.Tools;
import com.example.test01.service.ToolsService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/tools")
public class ToolsController {
    @Resource
    private ToolsService toolsService;

    @RequestMapping("/list")
    public PageInfo<Tools> list(@RequestParam(defaultValue = "")String officeCode, @RequestParam(defaultValue = "1")Integer curPage, @RequestParam(defaultValue = "2")Integer pageSize){
        PageInfo<Tools> page = toolsService.listByCode(officeCode,curPage,pageSize);
        return page;
    }

    @RequestMapping("/add")
    public void add(Tools tools){
        toolsService.add(tools);
    }

    @RequestMapping("/update")
    public void update(Tools tools){
        toolsService.update(tools);
    }

    @RequestMapping("/del")
    public void del(Integer id){
        toolsService.del(id);
    }

    @RequestMapping("/findAll")
    public List<Tools>findAll(){
        List<Tools> tools = toolsService.findAll();
        return tools;
    }

}
