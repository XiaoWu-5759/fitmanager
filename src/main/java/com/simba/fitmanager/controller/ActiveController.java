package com.simba.fitmanager.controller;

import com.simba.fitmanager.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/active")
public class ActiveController {
    @Autowired
    private ActiveService activeService;

    @PostMapping("/{num1}")
    public String activeByOne(@PathVariable(value = "num1") String num) {
        System.out.println(num);
        String result = activeService.activeByOne(num);
        // 接口数据   url:localhost:8080/active/{num1},返回string
        //返回0，激活失败
        //返回1，是正常配件，激活成功
        //返回2，是备件，需要另外一个被激活的配件码
        //返回3，是激活过的配件，提示该配件已被激活
        return result;
    }

    @PostMapping
    public  String activeByTwo(@PathVariable(value = "num1") String num1,@PathVariable(value = "num2") String num2){
        System.out.println(num1+"+"+num2);
        String result = activeService.activeByTwo(num1,num2);

        return result;
    }

}
