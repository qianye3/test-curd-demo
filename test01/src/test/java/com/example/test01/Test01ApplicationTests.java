package com.example.test01;

import com.example.test01.entity.Tools;
import com.example.test01.service.ToolsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootTest
class Test01ApplicationTests {

    @Test
    void contextLoads() {
    }
    private ToolsService toolsService;
    @Test
    @RequestMapping("/findAll")
    public void findAll(){
        List<Tools> tools = toolsService.findAll();
        System.out.println(tools);
    }

}
